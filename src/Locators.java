import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  // this is globally waits for every thing
		// implicit wait -- this wait will monitor every milli sec upto the time we give
		// for suppose we give 5sec and the element we are searching is found in 2 sec then the esc from that wait,the
		// max it will wait is 5sec if still not found it will through an error.
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("qwerty@123");
		driver.findElement(By.className("signInBtn")).click();
		
		
		// css --> if you have class name and what to deriver css out of it -----> tagname.classname
		// or if you have id than --> tagname#id
		
		// <button class="submit signInBtn" type="submit">Sign In</button>
		//css -> button.signInBtn
		
		//<input type="text" placeholder="Username" value="">
		//css--> for above is : input[placeholder='Username']
		
		
		//<p class="error">* Incorrect username or password </p>--writing css for this 
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		
		//xpath -->  //tagname[@attribute ='value']
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("bhargav");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("bhargav@cmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("sreenu@cmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("987654321");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		//driver.quit();

	}

}
