package demoWork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Define_Labs {
	
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\GitHub\\Demo_Project-1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.bhaane.com/");
		
	
		
		driver.findElement(By.xpath("//div[@class='mdiv']")).click();		
		
		driver.findElement(By.xpath("//li[text()='account']")).click();		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='email'])[1]")).sendKeys("paratevipul11@yahoo.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("Bhaane");				
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();				
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[text()='tops'])[2]")).click();			
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='gender >']")).click();			
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[text()='male'])[2]")).click();			
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@src='https://www.bhaane.com/resized/473X/2610/chickoo-henley-621607fcef9c4.jpeg']")).click();			
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='l']")).click();			
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[text()='add to bag'])[1]")).click();			
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[text()='go to cart'])[1]")).click();			
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//div[@class='col trigger increment']")).click();		
		Thread.sleep(2000);
		
		
		WebElement price = driver.findElement(By.xpath("//div[text()='₹ 5,600']"));
		System.out.println(price.getText());
		Thread.sleep(2000);
		
		driver.close();
	
	}
}
