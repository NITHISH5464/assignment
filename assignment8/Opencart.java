package assignment8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Opencart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("MARK MANI GANG");
		driver.findElement(By.id("input-firstname")).sendKeys("NITHISH");
		driver.findElement(By.id("input-lastname")).sendKeys("S");
		driver.findElement(By.id("input-email")).sendKeys("cbenithish25@gmail.com");
		WebElement input = driver.findElement(By.id("input-country"));
		Select op=new Select(input);
		op.selectByIndex(99);
		driver.findElement(By.id("input-password")).sendKeys("12345432");
		driver.close();

	}

}
