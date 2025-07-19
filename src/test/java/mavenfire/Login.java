package mavenfire;

	import org.openqa.selenium.By;
	//import io.github.bonigarcia.wdm.WebDriverManager;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	//import io.github.bonigarcia.wdm.WebDriverManager;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
	import org.testng.asserts.SoftAssert;
	
	public class Login {
		
	    @Test    
	public void login() throws InterruptedException {
			//WebDriverManager.edgedriver().setup();
			WebDriver driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://practicetestautomation.com/practice-test-login/");
			Thread.sleep(2000);

		WebElement u1	=driver.findElement(By.xpath("//input[@id='username'] "));
		u1.sendKeys("student");
	WebElement p1 		=driver.findElement(By.xpath("//input[@id='password']"));
	p1.sendKeys("Password123");
		WebElement b1	=driver.findElement(By.xpath("//button[@id='submit']"));
		b1.click();
		WebElement l1=driver.findElement(By.xpath("//a[@class='wp-block-button__link has-text-color has-background has-very-dark-gray-background-color']"));
		l1.click();
		Thread.sleep(2000);

		String actualtitle=driver.getCurrentUrl();
		                   String expectedtitle="https://practicetestautomation.com/practice-test-login/";
							/*
							 * SoftAssert s1=new SoftAssert(); s1.assertNotEquals(actualtitle,
							 * expectedtitle);
							 */
		
		                   Assert.assertEquals(actualtitle, expectedtitle);
	
	
	            driver.quit();

		}
		/* s1.assertAll(); */
			
		


	}


