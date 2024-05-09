package TS_002_LOGIN_FUNCTIONALITY;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import BASE_CLASS_GOOGLE_MAPS.GM_BASE_CLASS;

public class TC_GM_011_LOGIN_FUNCTIONALITY4 extends GM_BASE_CLASS {
	@Test
	public void VALIDATE_rightclick_password_pagesource_LOGIN_011() {

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
		WebElement copy10 = driver.findElement(By.xpath(loc.getProperty("your_password_GM_LF_001")));
		Actions action = new Actions(driver);
		action.contextClick(copy10).build().perform();

		// password is not shown on page source

	}

}
