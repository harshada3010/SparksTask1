//HARSHADA PATIL

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;  
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

  
public class Seleniumtask{  
  
    public static void main(String[] args) throws InterruptedException {  
          
          // System Property for Gecko Driver   
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\Jar files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.thesparksfoundationsingapore.org/");
		driver.manage().window().maximize();
		driver.findElement(By.className("caret")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Executive Team")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(10000,1000)", "");
		Thread.sleep(2000);
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,-1000)", "");
		Thread.sleep(2000);
		System.out.println("Test1 Succesful");
		
		driver.findElement(By.xpath("(//*[@class='caret'])[2]")).click();
		Thread.sleep(2000);
		System.out.println("Test2 Succesful");
		driver.findElement(By.xpath("(//*[@class='caret'])[3]")).click();
		Thread.sleep(2000);
		System.out.println("Test3 Succesful");
		driver.findElement(By.xpath("(//*[@class='caret'])[4]")).click();
		Thread.sleep(2000);
		System.out.println("Test4 Succesful");
		driver.findElement(By.xpath("(//*[@class='caret'])[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Why Join Us")).click();
		Thread.sleep(2000);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(1000,900)", "");
		Thread.sleep(2000);
		driver.findElement(By.name("Name")).sendKeys("Harshada Patil");
		Thread.sleep(2000);
		driver.findElement(By.name("Email")).sendKeys("harshada39@gmail.com");
		Thread.sleep(3000);
		//driver.findElement(By.className("form-control")).click();
		Select dropdown = new Select(driver.findElement(By.className("form-control")));
		dropdown.selectByVisibleText("Intern");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		System.out.println("Test5 Succesful");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Contact Us")).click();
		Thread.sleep(3000);
		System.out.println("Test6 Succesful");
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(10000,1000)", "");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("The Sparks Foundation (Global)")).click();
		Thread.sleep(2000);
		
		
		
		String at = driver.getTitle();
		String et = "The Sparks Foundation | Home";
		driver.close();
		if(at.equalsIgnoreCase(et))
		{
			System.out.println("Test7 Succesful");
	
		}
		else
		{
			System.out.println("Test5 Failure");
		}
		
		System.out.println("Successfully Tested 15 elements and 5 Pages.");
		
		
	}
} 