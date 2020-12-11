package JimsHoney;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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
		
		driver.get("https://jimshoneyofficial.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"masthead\"]/div[1]/div[4]/ul/li[3]/a/i")).click();

//        for(String winHandle : driver.getWindowHandles()){
//            driver.switchTo().window(winHandle);
//        }
		
		driver.findElement(By.xpath("//*[@id=\"idnumber\"]")).sendKeys("3671083004960001");
		driver.findElement(By.xpath("//*[@id=\"birthday\"]")).sendKeys("30041996");
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"gender\"]"));
		Select sel = new Select(element);
		sel.selectByVisibleText("Male");
		
		driver.findElement(By.xpath("//*[@id=\"reg_username\"]")).sendKeys("ariansyah");
		driver.findElement(By.xpath("//*[@id=\"reg_email\"]")).sendKeys("ariansyah@mailinator.com");
		driver.findElement(By.xpath("//*[@id=\"reg_password\"]")).sendKeys("Password1234567?");
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/div/form/p[7]/button")).click();
	
	}
}
