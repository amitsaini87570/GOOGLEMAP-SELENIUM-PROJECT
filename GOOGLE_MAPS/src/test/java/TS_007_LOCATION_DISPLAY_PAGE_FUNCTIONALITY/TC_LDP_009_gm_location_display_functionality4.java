package TS_007_LOCATION_DISPLAY_PAGE_FUNCTIONALITY;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BASE_CLASS_GOOGLE_MAPS.GM_BASE_CLASS;

public class TC_LDP_009_gm_location_display_functionality4 extends GM_BASE_CLASS {
	@Test
	public void Validate_travelling_options_tc_gm_ldp_009() {

		driver.manage().window().maximize();
		// ENTER LOCATION NAME
		driver.findElement(By.xpath(loc.getProperty("search_box_gm_ldp_001")))
				.sendKeys((loc.getProperty("enter_search_box_gm_ldp_001")));
		// CLICK ON SEARCH BUTTON
		driver.findElement(By.xpath(loc.getProperty("search_button_gm_ldp_001"))).click();

		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		// CLICK ON direction BUTTON
		// driver.findElement(By.xpath(loc.getProperty("direction_button_gm_ldp_004"))).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
//click button
		WebElement submit = driver.findElement(By.xpath("direction_button_gm_ldp_004"));
		js.executeScript("arguments[0].click();", submit);

		// ENTER start LOCATION NAME
		driver.findElement(By.xpath(loc.getProperty("start_location_gm_ldp_007")))
				.sendKeys((loc.getProperty("enter_start_location_gm_ldp_007")));

		// CLICK ON SEARCH BUTTON 1.1
		driver.findElement(By.xpath(loc.getProperty("search_button_1.1_gm_ldp_001"))).click();

	}
}
