package TS_002_LOGIN_FUNCTIONALITY;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import BASE_CLASS_GOOGLE_MAPS.GM_BASE_CLASS;

public class TC_GM_013_LOGIN_FUNCTIONALITY2 extends GM_BASE_CLASS {
	@Test
	public void VALIDATE_title_url_lf_gm_013() {

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
		driver.findElement(By.xpath(loc.getProperty("your_password_GM_LF_001")))
				.sendKeys((loc.getProperty("enter_your_password_GM_LF_001")));

		// click on next
		driver.findElement(By.xpath(loc.getProperty("click_on_next_1.2_GM_LF_001"))).click();

		// verify title
		// get the actual title
		String actual_title10 = driver.getTitle();
		// printing actual title
		System.out.println("actual title is     " + actual_title10);
		// expected title from locator properties
		String expected_title10 = (loc.getProperty("expected_title_gm_lf_013"));
		// verifying the title
		Assert.assertEquals(actual_title10, expected_title10, "title not matched");

		// verify url
		// get the actual url
		String actual_url10 = driver.getCurrentUrl();
		// printing actual url
		System.out.println("actual url is     " + actual_url10);
		// expected url from locator properties
		String expected_url10 = (loc.getProperty("expected_url10__gm_lf_013"));
		// verifying the url
		Assert.assertEquals(actual_url10, expected_url10, "url not matched");

	}

}
