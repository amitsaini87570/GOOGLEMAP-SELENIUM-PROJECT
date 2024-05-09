package TS_001_GM_REGISTRATION_FUNCTIONALITY;

import java.util.concurrent.TimeUnit;
import java.util.stream.StreamSupport;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.twiml.voice.Stream;

import BASE_CLASS_GOOGLE_MAPS.GM_BASE_CLASS;

public class TC_008_GM_REGISTRATION_FUNCTIONALITY5 extends GM_BASE_CLASS {

	@Test
	public void VALIDATE_title_url_GM_RF_008() {

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		// CLICK ON SIGN IN BUTTON
		driver.findElement(By.xpath(loc.getProperty("SIGN_IN_BUTTON_GM_001"))).click();
		// CLICK ON CREATE ACCOUNT BUTTON
		driver.findElement(By.xpath(loc.getProperty("CLICK_ON_CREATE_ACCOUNT_GM_RF_001"))).click();
		// click on personal use
		driver.findElement(By.xpath(loc.getProperty("click_on_personal_use_GM_RF_001"))).click();

		// verify title
		// get the actual title
		String actual_title10 = driver.getTitle();
		// printing actual title
		System.out.println("actual title is     " + actual_title10);
		// expected title from locator properties
		String expected_title10 = (loc.getProperty("expected_title_gm_rf_008"));
		// verifying the title
		Assert.assertEquals(actual_title10, expected_title10, "title not matched");

		// verify url
		// get the actual url
		String actual_url10 = driver.getCurrentUrl();
		// printing actual url
		System.out.println("actual url is     " + actual_url10);
		// expected url from locator properties
		String expected_url10 = (loc.getProperty("expected_url10_gm_rf_008"));
		// verifying the url
		Assert.assertEquals(actual_url10, expected_url10, "url not matched");

	}

}
