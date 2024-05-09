package TS_003_LOGOUT_FUNCTIONALITY;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import TS_002_LOGIN_FUNCTIONALITY.TC_GM_001_LOGIN_FUNCTIONALITY;

public class TC_LG_002_LOGOUT_FUNCTIONALITY2 extends TC_LG_001_LOGOUT_FUNCTIONALITY {
	@Test
	public void validate_logout_back_button_LOF_00() {
		TC_LG_002_LOGOUT_FUNCTIONALITY2 logout_002 = new TC_LG_002_LOGOUT_FUNCTIONALITY2();
		logout_002.logout_LOF_001();

        //back
		driver.navigate().back();
   //user should logout ,but found log in
		Assert.assertTrue(false);
	}

}
