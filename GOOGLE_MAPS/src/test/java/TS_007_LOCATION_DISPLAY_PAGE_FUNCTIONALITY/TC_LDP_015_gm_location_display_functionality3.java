package TS_007_LOCATION_DISPLAY_PAGE_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BASE_CLASS_GOOGLE_MAPS.GM_BASE_CLASS;

public class TC_LDP_015_gm_location_display_functionality3 extends GM_BASE_CLASS {
	@Test
	public void Validate_click_on_zoom_in_display_tc_gm_ldp_015() {

		driver.manage().window().maximize();
		// ENTER LOCATION NAME
		driver.findElement(By.xpath(loc.getProperty("search_box_gm_ldp_001")))
				.sendKeys((loc.getProperty("enter_search_box_gm_ldp_001")));
		// CLICK ON SEARCH BUTTON
		driver.findElement(By.xpath(loc.getProperty("search_button_gm_ldp_001"))).click();

		// CLICK ON zoomin
		driver.findElement(By.xpath(loc.getProperty("click_on_zoom_in_gm_ldp_015"))).click();

	}
}
