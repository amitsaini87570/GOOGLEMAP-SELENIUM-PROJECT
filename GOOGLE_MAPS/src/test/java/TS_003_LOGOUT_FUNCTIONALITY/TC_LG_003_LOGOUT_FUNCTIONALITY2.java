package TS_003_LOGOUT_FUNCTIONALITY;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import TS_002_LOGIN_FUNCTIONALITY.TC_GM_001_LOGIN_FUNCTIONALITY;

public class TC_LG_003_LOGOUT_FUNCTIONALITY2 extends TC_GM_001_LOGIN_FUNCTIONALITY {
	@Test
	public void logout_LF_LOGOUT_OPTION_NOT_DISPLAYED() {

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		// CLICK ON SIGN IN BUTTON
		driver.findElement(By.xpath(loc.getProperty("click_on_sign_in_lg_003"))).click();

	}

}
