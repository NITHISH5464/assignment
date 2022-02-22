package assignment8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salessforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("UserFirstName")).sendKeys("NITHISH");
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("S");
		driver.findElement(By.name("UserEmail")).sendKeys("cbenithish25@gmail.com");
		WebElement input = driver.findElement(By.xpath("//select[@name='UserTitle']"));
		Select ss=new Select(input);
		ss.selectByIndex(2);
		driver.findElement(By.name("CompanyName")).sendKeys("TESTLEAF");
		WebElement input2 = driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
		Select ss2=new Select(input2);
		ss2.selectByIndex(2);
		driver.findElement(By.name("UserPhone")).sendKeys("9876543210");
		driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[1]")).click();
		driver.close();
	}
	}


