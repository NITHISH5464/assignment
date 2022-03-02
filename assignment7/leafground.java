package assignment7;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class leafground {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://leafground.com/pages/Link.html");
	driver.findElement(By.linkText("Go to Home Page")).click();
	String title=driver.getTitle();
	System.out.println(title);
	
	driver.get("http://leafground.com/pages/Link.html");
	
	driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).click();
String title1=driver.getTitle();
System.out.println(title1);

driver.get("http://leafground.com/pages/Link.html");

driver.findElement(By.linkText("Verify am I broken?")).click();
String title2=driver.getTitle();
System.out.println(title2);
Thread.sleep(2000);

driver.quit();
}

}
