package TS_005_SEARCH_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BASE_CLASS_GOOGLE_MAPS.GM_BASE_CLASS;
import TS_002_LOGIN_FUNCTIONALITY.TC_GM_001_LOGIN_FUNCTIONALITY;

public class TC_SF_004_SEARCH_FUNCTIONALITY2 extends TC_GM_001_LOGIN_FUNCTIONALITY {
	@Test
	public void search_AFTER_LOGIN_location_gm_sf_004() {
		TC_SF_004_SEARCH_FUNCTIONALITY2 SF_GM_004 = new TC_SF_004_SEARCH_FUNCTIONALITY2();
		SF_GM_004.VALIDATE_VALID_CREDENTIAL_LOGIN_001();

		driver.manage().window().maximize();

		// ENTER LOCATION NAME
		driver.findElement(By.xpath(loc.getProperty("search_box_gm_sf_001")))
				.sendKeys((loc.getProperty("enter_search_box_gm_sf_001")));
		// CLICK ON SEARCH BUTTON
		driver.findElement(By.xpath(loc.getProperty("search_button_gm_sf_001"))).click();

	}

}
