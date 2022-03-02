package assignment12;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.utils.FileUtil;

import io.github.bonigarcia.wdm.WebDriverManager;
import week2.day3.string;

public class Nykka2 {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement mic1 = driver.findElement(By.linkText("BRANDS"));
		Actions buil=new Actions(driver);
		buil.moveToElement(mic1).perform();
		
	 WebElement mic2 = driver.findElement(By.linkText("L'Oreal Paris"));
	 Actions buil2=new Actions(driver);
	 buil2.moveToElement(mic2).click().perform();
	 
		String title=driver.getTitle();
		System.out.println(title);
		String title1="Buy L'Oreal Paris products online at best price on Nykaa | Nykaa";
		
		if(title.equals(title)) {
			System.out.println("the page is rght");
		}
		else {
			System.out.println("the page in wrong ");
		}
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='filter-sort']")).click();
		driver.findElement(By.xpath("//label[@for='radio_customer top rated_undefined']")).click();
		driver.findElement(By.xpath("//div[@class='filter-open css-nbw8dp']")).click();
		driver.findElement(By.xpath("(//div[@class=' css-15dbf9i'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='filter-name '])[1]")).click();
		driver.findElement(By.xpath("//label[@for='checkbox_Shampoo_316']")).click();
		driver.findElement(By.xpath("(//div[@class='filter-open css-nbw8dp'])[6]")).click();
		driver.findElement(By.xpath("(//div[@class='control-value'])[4]")).click();
	    driver.findElement(By.xpath("(//div[@class='css-43m2vm'])[1]")).click();
		//Set<String> num1 = driver.getWindowHandles();
			//	System.out.println(num1);
				//driver.getWindowHandles();
				//String win1=new String
	    //String mic4=driver.getWindowHandle()); 
		//driver.switchTo().window(mic3);
        	
		//driver.findElement(By.xpath("(//button[@type='button'])[8]")).click();
	    //driver.findElement(By.xpath("(//button[@type='button'])[9]")).click();
	    //driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
	    //File mic5 = driver.getScreenshotAs(OutputType.FILE);
	    //File desk=new File("./SELENIUM/SUNA PAN.png");
	    //FileUtils.copyFile(mic5, desk);
	}

}
