package My2nd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Classw {

	public static void main(String[] args) {
	 WebDriver driver;

	 
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\OneDrive\\Desktop\\chrome drivers\\chromedriver.exe");
	 driver =new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/");
	 WebDriverWait wait =new WebDriverWait(driver,10);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Forgotten password?']")));
	 
	 driver.close();

	}

}
