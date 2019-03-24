package practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_css {

	public static void main(String[] args) {
		

		//*** tagName[attribute='value'] - css synthax. you dont need no // and no annotation. 
		//if you don
		
		//another way to replicate CSS in another way is to form css like: tagName#id
		
		//*** input#username
		
		//another way is one more for CSS: tagname.classname
		
		//You can skip tagname in CSS by simply using #. like: #email instead of input#email
		
		//Reg expression - Sometimes value might keep on changing. assuming you have only one attribute and 
		//it keeps on changing, you can use a regular expression. You have to find out what is constant
		//for example, <input name="username123"">, well username is constant and by using constant and one sub text of your 
		//actual attribute value, you can find your xpath or css using Reg expression.
		//Regular expression for xpath - //tagName[contains(@attribute, 'value')]
		//Real example xpath: //input[contains(@name, 'username')],
		
		//Regular expression Css - tagName[attribute*='value']
		//Real example of CSS - input[name*='username']
		
		//A couple scenarios you can use these expressions, one scenario is when it is constant and another one is 
		//when the value is to long.
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\omar\\Documents\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("myemail");
		//if you want to skip tag name...just leave it blank...this is for CSS...
		driver.findElement(By.cssSelector("[value='Log In']")).click();

	}

}
