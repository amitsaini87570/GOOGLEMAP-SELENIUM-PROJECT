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

public class TC_009_GM_REGISTRATION_FUNCTIONALITY6 extends GM_BASE_CLASS {
	  
	@Test
	public void VALIDATE_gm_rf_ui_009() {

		driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		//CLICK ON SIGN IN BUTTON
		driver.findElement(By.xpath(loc.getProperty("SIGN_IN_BUTTON_GM_001"))).click();
        //CLICK ON CREATE ACCOUNT BUTTON
		driver.findElement(By.xpath(loc.getProperty("CLICK_ON_CREATE_ACCOUNT_GM_RF_001"))).click();
       //click on personal use
		driver.findElement(By.xpath(loc.getProperty("click_on_personal_use_GM_RF_001"))).click();

		//  Proper and good UI are displayed on the 'Register Account' page


	}
		
	
		
		
		
}	
		

