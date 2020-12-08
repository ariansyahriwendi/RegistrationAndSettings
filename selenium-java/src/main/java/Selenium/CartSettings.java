package Selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CartSettings{
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
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[1]/div[2]/div/div/a")).click();     
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[2]/div[2]/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[2]/div[3]/div[2]/div/div[3]/label/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"is_snap_pop_up:false\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[2]/div[3]/div[3]/div[2]/a")).click();
		

        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/label")).click();
        driver.findElement(By.xpath("//*[@id=\"payment-list\"]/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"application\"]/div[4]/div/div/div/form/div[2]/div[1]/input")).sendKeys("4811111111111114	0125	123");
        driver.findElement(By.xpath("//*[@id=\"application\"]/div[2]/a")).click();      
        driver.findElement(By.xpath("//*[@id=\"PaRes\"]")).sendKeys("112233");
        driver.findElement(By.xpath("//*[@id=\"acsForm\"]/div[6]/div/button[1]")).click();
        
	}
}