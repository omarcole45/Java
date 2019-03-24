package practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		

		//tagName[@attribute='value']
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\omar\\Documents\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("MyUsername");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Mypassword");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		

	}

}
