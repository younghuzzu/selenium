package My2nd;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class H22 {

	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\user\\OneDrive\\Desktop\\chrome drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,25);
		
//		driver.findElement(By.xpath("//div[@class='abcc616ec7 cc1b961f14 c180176d40 f11eccb5e8 ff74db973c']//button[@type='button']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			
		driver.manage().window().maximize();
		driver.get("https://booking.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='abcc616ec7 cc1b961f14 c180176d40 f11eccb5e8 ff74db973c']//button[@type='button']"))).click();
		driver.findElement(By.name("ss")).sendKeys("Jamshedpur");
		
		driver.findElement(By.xpath("//li[@id='autocomplete-result-0']")).click();
//		driver.findElement(By.linkText("Check-in Date")).click();
		driver.findElement(By.xpath("//span[@data-date='2024-02-04']")).click();
		driver.findElement(By.xpath("//span[@data-date='2024-02-06']")).click();
//		driver.findElement(By.linkText("Check-out Date")).click();
		
		driver.findElement(By.xpath("//label[@for=':rg:']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[text()='OYO Flagship 78696 Hotel Kamini']")).click();
		
		String currtab=driver.getWindowHandle();
		Set<String> alltabs=driver.getWindowHandles();
		for(String tab: alltabs) 
		{
			if(!tab.equals(currtab)) {
				driver.switchTo().window(tab);
			}
		}
		driver.findElement(By.id("hp_book_now_button")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-testid='reservation-summary']//button[@type='submit']"))).click();
		driver.findElement(By.xpath("//div[@data-testid='reservation-summary']//button[@type='submit']")).click();
//				driver.close();
		
	}

}
