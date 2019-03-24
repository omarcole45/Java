package practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	
//	Type of Alerts Present and Methods to handle them
//	 
//	if the pop up is not part of HTML then Selenium cannnot identify it, but there is a new class called alert in which you can
//	switch your driver from the web page to the alert box and you can click ok.
	
	//When you dont have an element and its no HTML and you need to select the pop up box you need to switch your 
	//driver web element to alert...you can just do that by putting driver.switchto().alert();
	//you are actually switching from your web view to pop up view...what ever alert is displaying it will switch
	//its control to that alert.
	//now after switching...you want to click on "ok"...you have to use the accept method.
	//if you want to click on "cancel or any thing that means no" you will have to use dismiss method
	
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\omar\\\\Documents\\\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.xpath("//input[@value=\'Confirmation Alert\']")).click();
		driver.switchTo().alert().getText();
		System.out.println(driver.switchTo().alert().getText());
		//driver.switchTo().alert().sendKeys("test");
		driver.switchTo().alert().accept(); //accept means  "ok" or "done"
		//driver.switchTo().alert().dismiss(); //Dismiss means click "cancel or no"
	}

}
