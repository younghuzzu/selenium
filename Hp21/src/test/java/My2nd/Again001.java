package My2nd;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Again001 {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\OneDrive\\Desktop\\chrome drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/webtables");
		List<WebElement> names =driver.findElements(By.xpath("//div[@role='row']//div[2][text()]"));
		for(WebElement ex:names) {
			System.out.println(ex.getText());
		}
//		driver.findElement(By.xpath("(//div[@class='left-pannel']//span[@class='text'])[1]")).click();
//		driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys("md huzaifa khan");
//		driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("xyz@gmail.com");
//		driver.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys("zakirnagar");
//		WebElement btn= driver.findElement(By.xpath("//button[@id='submit']"));
//		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",btn);
//		btn.click();
	
		
		
		
		
		
		
		
		
	
	
	}
	
	
	
	

}
