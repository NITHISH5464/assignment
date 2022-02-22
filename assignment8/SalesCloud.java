package assignment8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesCloud {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://qeagle-dev-ed.my.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Password@123");
		driver.findElement(By.name("Login")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		//driver.findElement(By.xpath("//button[text()='View All']")).click();
	    driver.findElement(By.xpath("(//p[@class='slds-truncate'])[7]")).click();
	    driver.findElement(By.linkText("Opportunities")).click();
	  //  System.out.println(driver);
	    
	
	}

}
