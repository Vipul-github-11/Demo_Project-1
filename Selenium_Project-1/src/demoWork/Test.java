package demoWork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import graphql.Assert;



public class Test {
		
		public static void main(String[]args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\GitHub\\Demo_Project-1\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://www.zyxware.com/");
			
			driver.findElement(By.xpath("//a[@id='hs-eu-decline-button']")).click();
			
			driver.findElement(By.xpath("(//a[@class='getin-touch-btn'])[2]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@id='firstname-a5f8f253-2129-4269-b00c-4534bc470ec0']")).sendKeys("Vipul");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@id='lastname-a5f8f253-2129-4269-b00c-4534bc470ec0']")).sendKeys("Parate");
			
			
			driver.findElement(By.xpath("//input[@id='email-a5f8f253-2129-4269-b00c-4534bc470ec0']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@id='phone-a5f8f253-2129-4269-b00c-4534bc470ec0']")).sendKeys("123456789");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@id='company-a5f8f253-2129-4269-b00c-4534bc470ec0']")).sendKeys("XYZ");
	
			
			WebElement CS = driver.findElement(By.xpath("//select[@name='company_size']"));
			Select s = new Select(CS);
			s.selectByVisibleText("50-249");
			Thread.sleep(2000);

		//	driver.findElement(By.xpath("//span[@data-reactid='.hbspt-forms-0.1:$3.1:$enquire_about.$enquire_about.0.$Quality Assurance.0.1']")).click();
		//	Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@value='Submit']")).submit();			
			
			Thread.sleep(2000);
			
			String actual_error=driver.findElement(By.xpath("//label[text()='Please complete all required fields.']")).getText();
			String expected_error = "Please complete all required fields.";
			Assert.assertTrue(actual_error.contains("Please complete all required fields"));
			
			System.out.println("Task Completed");
			
			Thread.sleep(1000);
			driver.close();
		}
		
		

	}
	
