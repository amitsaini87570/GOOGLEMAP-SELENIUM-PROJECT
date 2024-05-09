package TS_001_GM_REGISTRATION_FUNCTIONALITY;

import java.util.concurrent.TimeUnit;
import java.util.stream.StreamSupport;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.twiml.voice.Stream;

import BASE_CLASS_GOOGLE_MAPS.GM_BASE_CLASS;

public class TC_001_GM_REGISTRATION_FUNCTIONALITY extends GM_BASE_CLASS {

	public static final String ACCOUNT_SID = "ACeeb223a28b90334a112f648e6f765a8f";
	public static final String AUTH_TOKEN = "[AuthToken]";

	@Test
	public void register_account_1() {

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		// CLICK ON SIGN IN BUTTON
		driver.findElement(By.xpath(loc.getProperty("SIGN_IN_BUTTON_GM_001"))).click();
		// CLICK ON CREATE ACCOUNT BUTTON
		driver.findElement(By.xpath(loc.getProperty("CLICK_ON_CREATE_ACCOUNT_GM_RF_001"))).click();
		// click on personal use
		driver.findElement(By.xpath(loc.getProperty("click_on_personal_use_GM_RF_001"))).click();

		// FIRST NAME
		driver.findElement(By.xpath(loc.getProperty("FIRST_NAME_GM_RF_001")))
				.sendKeys((loc.getProperty("ENTER_YOUR_FIRST_NAME_GM_RF_001")));
		// LAST NAME
		driver.findElement(By.xpath(loc.getProperty("LAST_NAME_GM_RF_001")))
				.sendKeys((loc.getProperty("ENTER_YOUR_LAST_NAME_GM_RF_001")));
		// CLICK ON NEXT
		driver.findElement(By.xpath(loc.getProperty("CLICK_ON_NEXTGM_RF_001"))).click();

		// MONTH
		WebElement month = driver.findElement(By.xpath(loc.getProperty("month_gm_rf_001")));
		Select select = new Select(month);
		select.selectByIndex(1);

		// DAY
		driver.findElement(By.xpath(loc.getProperty("day_gm_rf_001")))
				.sendKeys((loc.getProperty("enter_day_gm_rf_001")));

		// YEAR
		driver.findElement(By.xpath(loc.getProperty("year_gm_rf_001")))
				.sendKeys((loc.getProperty("enter_year_gm_rf_001")));

		// gender
		WebElement gender = driver.findElement(By.xpath(loc.getProperty("gender_gm_rf_001")));
		Select select1 = new Select(gender);
		select1.selectByIndex(1);

		// click on next
		driver.findElement(By.xpath(loc.getProperty("click_on_next_gm_rf_001"))).click();

		// enter email address
		driver.findElement(By.xpath(loc.getProperty("email_username_gm_rf_001")))
				.sendKeys((loc.getProperty("enter_email_gm_rf_001")));

		// click_on next
		driver.findElement(By.xpath(loc.getProperty("click_on_next_gm_rf_001.2"))).click();

		// click_on_password
		driver.findElement(By.xpath(loc.getProperty("password_gm_rf_001")))
				.sendKeys((loc.getProperty("enter_password_gm_rf_001")));

		// click_on confirm_password
		driver.findElement(By.xpath(loc.getProperty("confirm_password_gm_rf_001")))
				.sendKeys((loc.getProperty("enter_confirm_password_gm_rf_001")));

		// click on next
		driver.findElement(By.xpath(loc.getProperty("click_on_next_1.3_gm_rf_001"))).click();

		// enter phone no
		driver.findElement(By.xpath(loc.getProperty("phone_no_gm_rf_001")))
				.sendKeys((loc.getProperty("enter_phone_no_gm_rf_001")));

		// click on next
		driver.findElement(By.xpath(loc.getProperty("click_on_next_1.4_rf"))).click();

		// get the otp using twilio api
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		String smsBody = getMessage();
		// String smsBody = "123456";

		System.out.println(smsBody);
		String OTPNumber = smsBody.replaceAll("[^-?0-9]+", " ");
		System.out.println(OTPNumber);

		// enter otp
		driver.findElement(By.xpath(loc.getProperty("enter_otp_code_rf_gm_001")))
				.sendKeys((loc.getProperty(OTPNumber)));

	}

	public static String getMessage() {

		return ((java.util.stream.Stream<Message>) getMessages())
				.filter(m -> m.getDirection().compareTo(Message.Direction.INBOUND) == 0)
				.filter(m -> m.getTo().equals("+13357493746")).map(Message::getBody).findFirst()
				.orElseThrow(IllegalStateException::new);
	}

	private static Stream getMessages() {
		ResourceSet<Message> messages = Message.reader(ACCOUNT_SID).read();
		return (Stream) StreamSupport.stream(messages.spliterator(), false);
	}

	@Test
	public void register_account_2() {

		TC_001_GM_REGISTRATION_FUNCTIONALITY gm_rf_001 = new TC_001_GM_REGISTRATION_FUNCTIONALITY();
		gm_rf_001.register_account_1();
		// click on next
		driver.findElement(By.xpath(loc.getProperty("click_on_next_rf_gm_001_1.5"))).click();

		// click on skip
		driver.findElement(By.xpath(loc.getProperty("click_on_skip_gm_rf_001"))).click();

		// click on next
		driver.findElement(By.xpath(loc.getProperty("click_on_next_rf_gm_1.6"))).click();

		// scroll
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		WebElement scroll1 = driver.findElement(By.xpath(loc.getProperty("click_on_i_agree_gm_rf_001")));
		js.executeScript("arguments[0].scrollIntoView(true)", scroll1);

		// click on i agree
		driver.findElement(By.xpath(loc.getProperty("click_on_i_agree_gm_rf_001"))).click();

	}

}
