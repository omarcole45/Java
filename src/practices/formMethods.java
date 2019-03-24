package practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class formMethods {

	public static void main(String[] args) {
		
		//Validate that something is hidden or not.
		//isDisplayed lets you know if something is Displayed or not...and it returns true or false.
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\omar\\\\Documents\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.markmytrip.com/");
		System.out.println("Before clicking multi city");
		System.out.println(driver.findElement(By.cssSelector("#addModifyBtn")).isDisplayed());
		driver.findElement(By.xpath("//*[@id=\'multicity\']/label")).click();
		System.out.println("After Clicking Multi city");
		System.out.println(driver.findElement(By.cssSelector("#addModifyBtn")).isDisplayed());

		

	}

}
