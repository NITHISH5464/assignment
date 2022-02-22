package assignment6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebooknew {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("NITHIS");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("gangstar");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9876543245");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("123456543");
		
		WebElement input = driver.findElement(By.id("day"));
		Select a1=new Select(input);
		a1.selectByIndex(24);
		
		WebElement input2 = driver.findElement(By.id("month"));
	    Select a2=new Select(input2);
	    a2.selectByIndex(2);
	    
	    WebElement input3 = driver.findElement(By.id("year"));
	    Select a3=new Select(input3);
	    a3.selectByIndex(22);
	    
	    driver.findElement(By.xpath("(//input[@name='sex']/preceding::label[@class='_58mt'])[2]")).click();
	    driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	    
	    
	}
	

}
