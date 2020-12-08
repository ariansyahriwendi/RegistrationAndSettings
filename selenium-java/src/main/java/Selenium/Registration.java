package Selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Registration {
	public static void main(String[] args) {
	
		WebDriver driver;	
		WebDriverWait wait;
	
		System.setProperty("webdriver.chrome.driver","/Users/arian/Downloads/chromedriver.exe");
		driver = new ChromeDriver();
		
		String winHandleBefore = driver.getWindowHandle();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 10);
		
		driver.get("https://demo.midtrans.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[1]/div[2]/div/div/div[4]/a")).click();

        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
		
		driver.findElement(By.xpath("//*[@id=\"user_merchant_name\"]")).sendKeys("Business");
		driver.findElement(By.xpath("//*[@id=\"user_full_name\"]")).sendKeys("Ariansyah");
		driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("ariansyah@mailinator.com");
		driver.findElement(By.xpath("//*[@id=\"user_phone\"]")).sendKeys("081806442929");
		driver.findElement(By.xpath("//*[@id=\"user_password\"]")).sendKeys("hello");
		driver.findElement(By.xpath("//*[@id=\"user_password_confirmation\"]")).sendKeys("hello");
		driver.findElement(By.xpath("//*[@id=\"signup_btn\"]")).click();
	
	}
}
