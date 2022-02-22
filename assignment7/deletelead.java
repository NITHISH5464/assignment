package assignment7;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class deletelead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
	    driver.findElement(By.linkText("Phone")).click();
	    driver.findElement(By.name("phoneCountryCode")).clear();
	    driver.findElement(By.name("phoneCountryCode")).sendKeys("+91");
	   // driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("91");
	    driver.findElement(By.name("phoneCountryCode")).sendKeys("+91");
	    driver.findElement(By.name("phoneCountryCode")).sendKeys("9750685464");
	   driver.findElement(By.linkText("")
	    
	    
	       
			//driver.findElement(by)
		
		
		
		
	}

}
