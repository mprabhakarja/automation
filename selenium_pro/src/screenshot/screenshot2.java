package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class screenshot2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.redbus.com");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 String random= RandomString.make(5);
		  String imagename="redbus_";
		
		//System.out.println(src);
		
		File dest=new File("C:\\Users\\Admin\\Desktop\\screenshot\\"+imagename+""+random+"jpg");
		
		FileHandler.copy(src, dest);


	}

}
