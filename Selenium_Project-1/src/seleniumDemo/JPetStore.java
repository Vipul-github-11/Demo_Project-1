package seleniumDemo;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JPetStore {

	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\GitHub\\Demo_Project-1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://petstore.octoperf.com/actions/Catalog.action;jsessionid=A0DAC1B28A4AAFAAF31307641B871D1E");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@name='img_cart']")).click(); //Cart Empty
		Thread.sleep(2000);
	
		
		driver.findElement(By.xpath("//a[text()='Return to Main Menu']")).click(); //Return Main
		
	
		//DOG
		driver.findElement(By.xpath("//img[@src='../images/dogs_icon.gif']")).click();
		
		Thread.sleep(2000);
	
	
		driver.findElement(By.xpath("//a[text()='K9-BD-01']")).click(); //BullDog
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='Add to Cart'])[1]")).click();		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Return to Main Menu']")).click(); //Return Main
		Thread.sleep(2000);
	
		//DOG
		driver.findElement(By.xpath("//img[@src='../images/dogs_icon.gif']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='K9-RT-02']")).click(); // Labrador Retriever
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='Add to Cart'])[4]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Proceed to Checkout']")).click();
		Thread.sleep(2000);
		driver.close();
		
	}
	
}
