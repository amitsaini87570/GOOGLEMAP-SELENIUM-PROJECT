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

public class TC_FP_009_FORGOT_PASSWORD_FUNCTIONALITY3 extends GM_BASE_CLASS {

	@Test
	public void validate_backbutton__fp_009() throws IOException, MailosaurException {

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

		// back
		driver.navigate().back();

		// navigated to login page

	}
}
