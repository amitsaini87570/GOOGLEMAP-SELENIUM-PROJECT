package TS_003_LOGOUT_FUNCTIONALITY;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import TS_002_LOGIN_FUNCTIONALITY.TC_GM_001_LOGIN_FUNCTIONALITY;

public class TC_LG_004_LOGOUT_FUNCTIONALITY2 extends TC_GM_001_LOGIN_FUNCTIONALITY {
	@Test
	public void logout_login_logout_immediately_after_logout() {
		TC_LG_004_LOGOUT_FUNCTIONALITY2 logout_001 = new TC_LG_004_LOGOUT_FUNCTIONALITY2();
		logout_001.VALIDATE_VALID_CREDENTIAL_LOGIN_001();

		// click on account logo
		driver.findElement(By.xpath(loc.getProperty("click_on_account_logo_GM_lof_001"))).click();

		// switch to frame
		driver.switchTo().frame("account");

		// click on sign out
		driver.findElement(By.xpath(loc.getProperty("click_On_sign_out_GM_lof_001"))).click();

		logout_001.VALIDATE_VALID_CREDENTIAL_LOGIN_001();

	}

}
