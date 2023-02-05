package mouse_action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class move_to_element {

	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/");
	    
	    WebElement w1=driver.findElement(By.xpath("//a[@class=\"nav-a nav-a-2 icp-link-style-2\"]"));
	    System.out.println(w1.getText());
	    
	    
	    
	    Actions act=new Actions(driver);
	    act.moveToElement(w1).build().perform();
	    Thread.sleep(3000);
	    
	    driver.quit();
	    
	
	
	}

}
