package TS_002_LOGIN_FUNCTIONALITY;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BASE_CLASS_GOOGLE_MAPS.GM_BASE_CLASS;

public class TC_GM_008_LOGIN_FUNCTIONALITY2 extends TC_GM_001_LOGIN_FUNCTIONALITY {
	@Test
	public void VALIDATE_BACK_BUTTON_AFTER_LOGOUT_LOGIN_008() {

		TC_GM_008_LOGIN_FUNCTIONALITY2 gm_lf_008 = new TC_GM_008_LOGIN_FUNCTIONALITY2();
		gm_lf_008.VALIDATE_VALID_CREDENTIAL_LOGIN_001();
		// click on account logo
		driver.findElement(By.xpath(loc.getProperty("click_on_account_logo_GM_LF_008"))).click();

		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		// switch to frame
		driver.switchTo().frame(loc.getProperty("frame_name_GM_LF_008"));

		// click on sign out
		driver.findElement(By.xpath(loc.getProperty("click_On_sign_out_GM_LF_008"))).click();

		// back button
		driver.navigate().back();

	}

}
