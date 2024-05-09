package TS_001_GM_REGISTRATION_FUNCTIONALITY;

import java.util.concurrent.TimeUnit;
import java.util.stream.StreamSupport;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.twiml.voice.Stream;

import BASE_CLASS_GOOGLE_MAPS.GM_BASE_CLASS;

public class TC_002_GM_REGISTRATION_FUNCTIONALITY2 extends GM_BASE_CLASS {

	@Test
	public void dont_provide_details_gm_rf_002() {

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		// CLICK ON SIGN IN BUTTON
		driver.findElement(By.xpath(loc.getProperty("SIGN_IN_BUTTON_GM_002"))).click();
		// CLICK ON CREATE ACCOUNT BUTTON
		driver.findElement(By.xpath(loc.getProperty("CLICK_ON_CREATE_ACCOUNT_GM_RF_002"))).click();
		// click on personal use
		driver.findElement(By.xpath(loc.getProperty("click_on_personal_use_GM_RF_002"))).click();

		// FIRST NAME
		driver.findElement(By.xpath(loc.getProperty("FIRST_NAME_GM_RF_002")))
				.sendKeys((loc.getProperty("ENTER_YOUR_FIRST_NAME_GM_RF_002")));
		// LAST NAME
		driver.findElement(By.xpath(loc.getProperty("LAST_NAME_GM_RF_002")))
				.sendKeys((loc.getProperty("ENTER_YOUR_LAST_NAME_GM_RF_002")));
		// CLICK ON NEXT
		driver.findElement(By.xpath(loc.getProperty("CLICK_ON_NEXTGM_RF_002"))).click();

	}

}
