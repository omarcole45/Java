package practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceE2E {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\omar\\Documents\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//1.Navigate page
		driver.get("https://rediff.com");
		//2.Login page
		driver.findElement(By.cssSelector("a[href*='login.cgi9j    ']")).click();
		//3.type username
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("MyUsername");
		//4.type password
		driver.findElement(By.cssSelector("#password")).sendKeys("myPassword");
		//5.Select click button
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		//driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();
		
				
	}

}
