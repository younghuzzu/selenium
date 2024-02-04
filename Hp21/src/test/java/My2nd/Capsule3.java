package My2nd;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Capsule3 {

	public static void main(String[] args) {
			WebDriver driver;
			System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\user\\\\OneDrive\\\\Desktop\\\\chrome drivers\\\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			Actions a=new Actions(driver);
			WebElement ele= driver.findElement(By.id("email"));
			a.moveToElement(ele).keyDown(Keys.SHIFT).sendKeys(ele,"huzaifa").perform();
			
	
			
			
			
//			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",clr);
//			clr.click();
			
			
				
	}

}



