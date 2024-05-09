package TS_002_LOGIN_FUNCTIONALITY;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BASE_CLASS_GOOGLE_MAPS.GM_BASE_CLASS;

public class TC_GM_001_LOGIN_FUNCTIONALITY extends GM_BASE_CLASS {
	@Test
	public void VALIDATE_VALID_CREDENTIAL_LOGIN_001() {

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		// click on sign in
		driver.findElement(By.xpath(loc.getProperty("click_on_sign_in_GM_LF_001"))).click();

		// enter email phone
		// LAST NAME
		driver.findElement(By.xpath(loc.getProperty("email_phone_no_GM_LF_001")))
				.sendKeys((loc.getProperty("enter_your_email_phone_no_GM_LF_001")));
		// CLICK ON NEXT
		driver.findElement(By.xpath(loc.getProperty("click_on_next_1.1_GM_LF_001"))).click();
		// enter password
		driver.findElement(By.xpath(loc.getProperty("your_password_GM_LF___01")))
				.sendKeys((loc.getProperty("enter_your_password_GM_LF_0001")));

		// click on next
		driver.findElement(By.xpath(loc.getProperty("click_on_next_1.2_GM_LF_001"))).click();

	}

}
