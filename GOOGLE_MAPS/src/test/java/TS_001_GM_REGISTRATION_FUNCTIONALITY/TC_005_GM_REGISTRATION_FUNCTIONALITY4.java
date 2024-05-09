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

public class TC_005_GM_REGISTRATION_FUNCTIONALITY4 extends GM_BASE_CLASS {

	@Test
	public void VALIDATE_FIELD_PLACEHOLDER_GM_RF_005() {

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
		driver.findElement(By.xpath(loc.getProperty("click_on_next_gender_001"))).click();

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
				.sendKeys((loc.getProperty("enter_phone_no_gm_rf_004")));

		// click on next
		driver.findElement(By.xpath(loc.getProperty("click_on_next_1.4_rf"))).click();

	}

}
