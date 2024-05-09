package TS_003_LOGOUT_FUNCTIONALITY;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import TS_002_LOGIN_FUNCTIONALITY.TC_GM_001_LOGIN_FUNCTIONALITY;

public class TC_LG_005_LOGOUT_FUNCTIONALITY2 extends TC_GM_001_LOGIN_FUNCTIONALITY {
	@Test
	public void logout_title_url_LOF_005() {
		TC_LG_005_LOGOUT_FUNCTIONALITY2 logout_001 = new TC_LG_005_LOGOUT_FUNCTIONALITY2();
		logout_001.VALIDATE_VALID_CREDENTIAL_LOGIN_001();

		// verify title
		// get the actual title
		String actual_title10 = driver.getTitle();
		// printing actual title
		System.out.println("actual title is     " + actual_title10);
		// expected title from locator properties
		String expected_title10 = (loc.getProperty("expected_title_gm_lg_005"));
		// verifying the title
		// Assert.assertEquals(actual_title10, expected_title10, "title not matched");

		// verify url
		// get the actual url
		String actual_url10 = driver.getCurrentUrl();
		// printing actual url
		System.out.println("actual url is     " + actual_url10);
		// expected url from locator properties
		String expected_url10 = (loc.getProperty("expected_url10__gmlg_005"));
		// verifying the url
		// Assert.assertEquals(actual_url10, expected_url10, "url not matched");

	}

}
