package assignment12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal2 {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--diasble-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement mov = driver.findElement(By.xpath("(//span[@class='catText']/preceding-sibling::span)[1]"));
		Actions build=new Actions(driver);
		build.moveToElement(mov).build().perform();
		driver.findElement(By.linkText("Sports Shoes")).click();
		driver.findElement(By.xpath("//div[@class='sort-drop clearfix']")).click();
		driver.findElement(By.xpath("//span[@class='arrow hidden']/..")).click();
		driver.findElement(By.xpath("//input[@name='fromVal']")).clear();
		driver.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("900");
		driver.findElement(By.xpath("//input[@name='toVal']")).clear();
		driver.findElement(By.xpath("//input[@name='toVal']")).sendKeys("2000");
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		driver.findElement(By.xpath("(//button[@class='view-more-button btn btn-line btn-theme-secondary viewMoreFilter'])[2]")).click();
		
		//driver.findElement(By.xpath(""))
		//Actions build1=new Actions(driver);
		//build.clickAndHold().moveToElement(range).build().perform();
	}

}
