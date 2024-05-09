package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BASE_CLASS_GOOGLE_MAPS.GM_BASE_CLASS;



public class takescreenshot extends GM_BASE_CLASS{
	public void takess() throws IOException {
		
		Date d = new Date();
		String ssfn = d.toString().replace(" ","_").replace(":","_");
		System.out.println("taking ss");
	 File ssf =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(ssf, new File("C:\\Users\\amits\\eclipse-workspace\\GOOGLE_MAPS\\screenshots"+ssfn+".png"));
		System.out.println("taken ss");
	}
}
