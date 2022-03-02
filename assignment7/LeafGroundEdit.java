package assignment7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundEdit {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leafground.com/pages/Edit.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.id("email")).sendKeys("cbenithis25@gmail.com");
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).clear();
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("no comments");
	driver.findElement(By.name("username")).clear();
	driver.findElement(By.name("username")).sendKeys("defaul");
	driver.findElement(By.xpath("(//input[@type='text'])[4]")).clear();
	driver.findElement(By.xpath("(//input[@type='text'])[5]")).isEnabled();
	
	
	
	
}
}
