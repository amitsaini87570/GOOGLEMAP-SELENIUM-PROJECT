package TS_004_FORGOT_PASSWORD_FUNCTIONALITY;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BASE_CLASS_GOOGLE_MAPS.GM_BASE_CLASS;

public class TC_FP_001_FORGOT_PASSWORD_FUNCTIONALITY extends GM_BASE_CLASS {
	@Test
	public void validate_invalid_credintial_forgot_password_fp_001() {

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		// CLICK ON SIGN IN BUTTON
		driver.findElement(By.xpath(loc.getProperty("SIGN_IN_BUTTON_GM__fp_001"))).click();
		// ENTER INVALID EMAIL IN BOX
		driver.findElement(By.xpath(loc.getProperty("email_box_gm_fp_001")))
				.sendKeys((loc.getProperty("enter_email_box_gm_fp_001")));
		// click on next
		driver.findElement(By.xpath(loc.getProperty("click_on_next_1.1"))).click();

	}
}
