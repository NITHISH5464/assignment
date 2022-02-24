package assignment11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions in=new ChromeOptions();
		in.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(in);
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement mic1 = driver.findElement(By.linkText("BRAND"));
	
		 Actions input=new Actions(driver);
		 input.moveToElement(mic1).perform();
		 
		// driver.findElement(By.linkText("//img[contains(text(),'NIVEA)']")).click();
		 
		 

	}

}
