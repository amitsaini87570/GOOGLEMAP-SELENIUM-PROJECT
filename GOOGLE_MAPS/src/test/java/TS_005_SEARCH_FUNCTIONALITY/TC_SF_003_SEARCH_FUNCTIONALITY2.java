package TS_005_SEARCH_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BASE_CLASS_GOOGLE_MAPS.GM_BASE_CLASS;

public class TC_SF_003_SEARCH_FUNCTIONALITY2 extends GM_BASE_CLASS {
	@Test
	public void search_WITHOUT_location_gm_sf_003() {

		driver.manage().window().maximize();

		// ENTER LOCATION NAME

		// CLICK ON SEARCH BUTTON
		driver.findElement(By.xpath(loc.getProperty("search_button_gm_sf_001"))).click();

//WITHOUT PROVIDE LOCATION SEARCH BUTTON IS NOT CLICKABLE

	}

}
