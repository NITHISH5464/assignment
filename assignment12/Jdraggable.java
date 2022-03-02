package assignment12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jdraggable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions in=new ChromeOptions();
		in.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(in);
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		Actions build=new Actions(driver);
	    build.dragAndDropBy(drag, 100, 75).build().perform();
	  //  Thread.sleep(2000);
	    driver.close();
	}

}
