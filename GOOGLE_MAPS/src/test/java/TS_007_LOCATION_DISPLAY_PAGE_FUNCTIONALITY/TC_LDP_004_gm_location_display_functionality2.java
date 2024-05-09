package TS_007_LOCATION_DISPLAY_PAGE_FUNCTIONALITY;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BASE_CLASS_GOOGLE_MAPS.GM_BASE_CLASS;

public class TC_LDP_004_gm_location_display_functionality2 extends GM_BASE_CLASS {
	@Test
	public void Validate_availability_starting_location_tc_gm_ldp_005() {

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		// click on sign in
		driver.findElement(By.xpath(loc.getProperty("click_on_sign_in_GM_LF_001"))).click();

		// enter email phone
		// LAST NAME
		driver.findElement(By.xpath(loc.getProperty("email_phone_no_GM_LF_001")))
				.sendKeys((loc.getProperty("enter_your_email_phone_no_GM_LF_001")));
		// CLICK ON NEXT
		driver.findElement(By.xpath(loc.getProperty("click_on_next_1.1_GM_LF_001"))).click();
		// enter password
		driver.findElement(By.xpath(loc.getProperty("your_password_GM_LF___01")))
				.sendKeys((loc.getProperty("enter_your_password_GM_LF_0001")));

		// click on next
		driver.findElement(By.xpath(loc.getProperty("click_on_next_1.2_GM_LF_001"))).click();

		// ENTER LOCATION NAME
		driver.findElement(By.xpath(loc.getProperty("search_box_gm_ldp_001")))
				.sendKeys((loc.getProperty("enter_search_box_gm_ldp_001")));
		// CLICK ON SEARCH BUTTON
		driver.findElement(By.xpath(loc.getProperty("search_button_gm_ldp_001"))).click();

		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		// CLICK ON direction BUTTON
		driver.findElement(By.xpath(loc.getProperty("direction_button_gm_ldp_004"))).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
//click button
		// WebElement submit =
		// driver.findElement(By.xpath("direction_button_gm_ldp_004"));
		// js.executeScript("arguments[0].click();",submit);

	}
}
