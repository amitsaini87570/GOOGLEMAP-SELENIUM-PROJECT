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

public class TC_FP_008_FORGOT_PASSWORD_FUNCTIONALITY4 extends GM_BASE_CLASS {

	String apiKey = "ALhIdVH3YcfgLnve9tQHuTFclpbUBg9c";
	String serverId = "7soinggk";
	String serverDomain = "7soinggk.mailosaur.net";
	String from = "noreply@groww.in";

	public String getrandomemail() {
		return "user" + System.currentTimeMillis() + "@" + serverDomain;
	}

	@Test
	public void validate_email_otp_placeholder_fp_007() throws IOException, MailosaurException {

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

	}
}
