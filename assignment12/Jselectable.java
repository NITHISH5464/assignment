package assignment12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jselectable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/selectable/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        driver.switchTo().frame(0);
        WebElement select = driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-selectee'])[1]"));
	    WebElement select2 = driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-selectee'])[4]"));
        WebElement select3 = driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-selectee'])[6]"));
	   Actions build=new Actions(driver);
	   build.clickAndHold(select).moveToElement(select3).build().perform();
       Thread.sleep(2000);
       driver.close();
       
	}

}
