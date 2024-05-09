package TS_006_HOME_PAGE_FUNCTIONALITY;

import org.testng.Assert;
import org.testng.annotations.Test;

import BASE_CLASS_GOOGLE_MAPS.GM_BASE_CLASS;

public class TC_HP_003_HOME_PAGE_FUNCTIONALITY2 extends GM_BASE_CLASS {
	@Test
	public void validate_navigate_tO_home_page_tc_gm_hp_001() {
		driver.manage().window().maximize();

		// verify title
		// get the actual title
		String actual_title10 = driver.getTitle();
		// printing actual title
		System.out.println("actual title is     " + actual_title10);
		// expected title from locator properties
		String expected_title10 = (loc.getProperty("expected_title_gm_hp_003"));
		// verifying the title
	Assert.assertEquals(actual_title10, expected_title10, "title not matched");

		// verify url
		// get the actual url
		String actual_url10 = driver.getCurrentUrl();
		// printing actual url
		System.out.println("actual url is     " + actual_url10);
		// expected url from locator properties
		String expected_url10 = (loc.getProperty("expected_url10__gm_hp_003"));
		// verifying the url
	Assert.assertEquals(actual_url10, expected_url10, "url not matched");

	}
}
