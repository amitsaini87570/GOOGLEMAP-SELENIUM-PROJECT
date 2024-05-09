package TS_004_FORGOT_PASSWORD_FUNCTIONALITY;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNotNull;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.Message;
import com.mailosaur.models.MessageSearchParams;
import com.mailosaur.models.SearchCriteria;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import BASE_CLASS_GOOGLE_MAPS.GM_BASE_CLASS;

public class TC_FP_002_FORGOT_PASSWORD_FUNCTIONALITY3 extends GM_BASE_CLASS {

	String apiKey = "ALhIdVH3YcfgLnve9tQHuTFclpbUBg9c";
	String serverId = "7soinggk";
	String serverDomain = "7soinggk.mailosaur.net";
	String from = "noreply@groww.in";

	public String getrandomemail() {
		return "user" + System.currentTimeMillis() + "@" + serverDomain;
	}

	@Test
	public void validate_mismatch_password_fp_002() throws IOException, MailosaurException {

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		// CLICK ON SIGN IN BUTTON
		driver.findElement(By.xpath(loc.getProperty("SIGN_IN_BUTTON_GM__fp_001"))).click();
		// ENTER VALID EMAIL IN BOX
		driver.findElement(By.xpath(loc.getProperty("email_box_gm_fp_001")))
				.sendKeys((loc.getProperty("enter_email_box_gm_fp_013")));
		// click on next
		driver.findElement(By.xpath(loc.getProperty("click_on_next_1.1"))).click();

		// click on forgot password
		driver.findElement(By.xpath(loc.getProperty("click_on_forgot_password_gm_fp_002"))).click();

		// ENTER LAST PASSWORD IN BOX
		driver.findElement(By.xpath(loc.getProperty("last_password_gm_fp_013")))
				.sendKeys((loc.getProperty("enter_last_password_gm_fp_013")));
		// click on next
		driver.findElement(By.xpath(loc.getProperty("click_on_next_1.2_gm_fp_013"))).click();

		// enter code on recovery email

		String emailid = getrandomemail();
		WebDriver driver = new ChromeDriver();
		driver.get("https://groww.in/login");
		driver.findElement(By.id("login_email1")).sendKeys(emailid);
		driver.findElement(By.xpath("//span[text()='Continue']")).click();

		MailosaurClient mailosaur = new MailosaurClient(apiKey);
		MessageSearchParams params = new MessageSearchParams();
		params.withServer(serverId);

		SearchCriteria criteria = new SearchCriteria();
		criteria.withSentTo(emailid);
		criteria.withSentFrom(from);

		Message message = mailosaur.messages().get(params, criteria);

		String subject = message.subject();
		System.out.println(subject);

		System.out.println("getotp");

		Pattern pattern = Pattern.compile("Your email verification OTP is .*([0-9]{6}).*");

		Matcher matcher = pattern.matcher(subject);
		matcher.find();
		System.out.println(matcher.group(1));
		String otp = matcher.group(1);
		driver.findElement(By.id("gmail_recovery_code_gm_fp_013")).sendKeys(otp);

		assertNotNull(message);

		// click_on next 1.4
		driver.findElement(By.xpath(loc.getProperty("click_on_next_1.3_gm_fp_013"))).click();

		// click_on update_password
		driver.findElement(By.xpath(loc.getProperty("click_on_update_password_gm_fp_013"))).click();

		// ENTER create password IN BOX
		driver.findElement(By.xpath(loc.getProperty("create_password_gm_fp_013")))
				.sendKeys((loc.getProperty("enter_create_password_gm_fp_013")));

		// ENTER confirm password IN BOX
		driver.findElement(By.xpath(loc.getProperty("confirm_password_gm_fp_013")))
				.sendKeys((loc.getProperty("enter_confirm_password_gm_fp_002")));

		// click on save password
		driver.findElement(By.xpath(loc.getProperty("click_on_save_password_gm_fp_013"))).click();

	}
}
