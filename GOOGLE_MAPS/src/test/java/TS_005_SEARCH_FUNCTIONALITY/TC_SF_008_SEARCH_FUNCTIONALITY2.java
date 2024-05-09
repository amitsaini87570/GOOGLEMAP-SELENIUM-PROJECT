package TS_005_SEARCH_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BASE_CLASS_GOOGLE_MAPS.GM_BASE_CLASS;

public class TC_SF_008_SEARCH_FUNCTIONALITY2 extends GM_BASE_CLASS {
	@Test
	public void search_title_url_gm_sf_008() {

		driver.manage().window().maximize();

		// ENTER LOCATION NAME
		driver.findElement(By.xpath(loc.getProperty("search_box_gm_sf_001")))
				.sendKeys((loc.getProperty("enter_search_box_gm_sf_001")));
		// CLICK ON SEARCH BUTTON
		driver.findElement(By.xpath(loc.getProperty("search_button_gm_sf_001"))).click();

		// verify title
		// get the actual title
		String actual_title10 = driver.getTitle();
		// printing actual title
		System.out.println("actual title is     " + actual_title10);
		// expected title from locator properties
		String expected_title10 = (loc.getProperty("expected_title_gm_sf_008"));
		// verifying the title
//	Assert.assertEquals(actual_title10, expected_title10, "title not matched");

		// verify url
		// get the actual url
		String actual_url10 = driver.getCurrentUrl();
		// printing actual url
		System.out.println("actual url is     " + actual_url10);
		// expected url from locator properties
		String expected_url10 = (loc.getProperty("expected_url10__gm_sf_008"));
		// verifying the url
//	Assert.assertEquals(actual_url10, expected_url10, "url not matched");

	}

}
