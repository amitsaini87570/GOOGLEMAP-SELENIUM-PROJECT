package TS_005_SEARCH_FUNCTIONALITY;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BASE_CLASS_GOOGLE_MAPS.GM_BASE_CLASS;

public class TC_SF_001_SEARCH_FUNCTIONALITY extends GM_BASE_CLASS{
	@Test
public void search_existing_location_gm_sf_001() {
		
	driver.manage().window().maximize();


	 //ENTER LOCATION NAME
	driver.findElement(By.xpath(loc.getProperty("search_box_gm_sf_001"))).sendKeys((loc.getProperty("enter_search_box_gm_sf_001")));
 //CLICK ON SEARCH BUTTON
	driver.findElement(By.xpath(loc.getProperty("search_button_gm_sf_001"))).click();






}
	
}
