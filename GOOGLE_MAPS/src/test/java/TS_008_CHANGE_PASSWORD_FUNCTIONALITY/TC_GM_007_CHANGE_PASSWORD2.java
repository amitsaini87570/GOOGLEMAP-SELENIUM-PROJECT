package TS_008_CHANGE_PASSWORD_FUNCTIONALITY;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BASE_CLASS_GOOGLE_MAPS.GM_BASE_CLASS;

public class TC_GM_007_CHANGE_PASSWORD2 extends GM_BASE_CLASS {
	@Test
	public void VALIDATE_title_url_CHANGE_PASSWORD_FUNCTIONALITY_007() {
		/*
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
				.sendKeys((loc.getProperty("enter_your_password_GM_LF_0012")));

		// click on next
		driver.findElement(By.xpath(loc.getProperty("click_on_next_1.2_GM_LF_001"))).click();

		// click_on_logo account
		driver.findElement(By.xpath(loc.getProperty("click_on_account_logo_GM_LF_00012"))).click();

		// switch account frame
		driver.switchTo().frame(loc.getProperty("framework_name__GM_LF_012"));

		// click on manage account
		driver.findElement(By.xpath(loc.getProperty("click_on_manage_account_GM_LF_012"))).click();

		Set<String> wh = driver.getWindowHandles();
		System.out.println(wh);

		Iterator<String> i = wh.iterator();
		String pw = i.next();
		String cw = i.next();
		driver.switchTo().window(cw);

		System.out.println(pw);
		System.out.println(cw);

		// click on security
		driver.findElement(By.xpath(loc.getProperty("click_on_security_GM_LF_012"))).click();

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		// scroll
		WebElement scroll1 = driver.findElement(By.xpath(loc.getProperty("scroll__element_GM_LF_012")));
		js.executeScript("arguments[0].scrollIntoView(true)", scroll1);
		// click on password
		driver.findElement(By.xpath(loc.getProperty("password_change_GM_LF_012"))).click();

		// enter password
		driver.findElement(By.xpath(loc.getProperty("new_password_GM_LF_012")))
				.sendKeys((loc.getProperty("enter_new_password_GM_LF_012")));

		// confirm enter password
		driver.findElement(By.xpath(loc.getProperty("confirm_new_passwordGM_LF_012")))
				.sendKeys((loc.getProperty("enter_confirm_new_passwordGM_LF_012")));

		// click on change password
		driver.findElement(By.xpath(loc.getProperty("click_on_change_password_LF_012"))).click();

		//click on account  logo
		driver.findElement(By.xpath(loc.getProperty("click_on_account_logo_GM_LF_00012"))).click();

		//click on logout
				driver.findElement(By.xpath(loc.getProperty("click_On_sign_out_GM_LF_0012"))).click();

		//click on account  logo
		driver.findElement(By.xpath(loc.getProperty("click_on_account_logo_GM_LF_00012"))).click();

		// click on sign in
				driver.findElement(By.xpath(loc.getProperty("click_on_sign_in_GM_LF_012"))).click();


		//enter email
		driver.findElement(By.xpath(loc.getProperty("email_phone_no_GM_LF_012")))
				.sendKeys((loc.getProperty("enter_your_email_phone_no_GM_LF_012")));
				
				
		//click on next 		
						driver.findElement(By.xpath(loc.getProperty("click_on_next_1.1_GM_LF_012"))).click();
		
				
		//enter password
			driver.findElement(By.xpath(loc.getProperty("your_password_GM_LF_012")))
				.sendKeys((loc.getProperty("enter_your_password_GM_LF_012")));
				
		
			// verify title
			// get the actual title
			String actual_title10 = driver.getTitle();
			// printing actual title
			System.out.println("actual title is     " + actual_title10);
			// expected title from locator properties
			String expected_title10 = (loc.getProperty("expected_title_gm_cp_007"));
			// verifying the title
//		Assert.assertEquals(actual_title10, expected_title10, "title not matched");

			// verify url
			// get the actual url
			String actual_url10 = driver.getCurrentUrl();
			// printing actual url
			System.out.println("actual url is     " + actual_url10);
			// expected url from locator properties
			String expected_url10 = (loc.getProperty("expected_url10__gm_cp_007"));
			// verifying the url
//		Assert.assertEquals(actual_url10, expected_url10, "url not matched");

		
		
		*/
		
		
		
	}

}
