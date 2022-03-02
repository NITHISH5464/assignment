package assignment12;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.utils.FileUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    WebDriverManager.chromedriver().setup();
    ChromeDriver driver=new ChromeDriver();
    driver.get("https://www.amazon.in/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.findElement(By.id("nav-search-bar-form")).sendKeys("oneplus 9 pro");
    driver.findElement(By.id("nav-search-submit-text")).click();
    driver.findElement(By.xpath("//span[text()='OnePlus 9 Pro 5G (Morning Mist, 12GB RAM, 256GB Storage)']")).click();
    
    
    File snap = driver.getScreenshotAs(OutputType.FILE);
    File prnt=new File("./amazon/snap.png");
    FileUtils.copyDirectory(snap, prnt);
    
    driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
    
	}

}
