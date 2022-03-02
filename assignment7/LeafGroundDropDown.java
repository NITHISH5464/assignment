package assignment7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundDropDown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement text = driver.findElement(By.id("dropdown1"));
	    Select index=new Select(text);
	    index.selectByIndex(3);
	    
	    WebElement text2 = driver.findElement(By.name("dropdown2"));
	    Select index2=new Select(text2);
	    index2.selectByIndex(2);
	    
	    WebElement text3 = driver.findElement(By.id("dropdown3"));
	    Select index3=new Select(text3);
	    index3.selectByIndex(1);
	
	    driver.close();
	    System.out.println("mission passed");
	    
	}

}
