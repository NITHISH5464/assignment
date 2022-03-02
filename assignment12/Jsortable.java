package assignment12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jsortable {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/selectable/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        driver.switchTo().frame(0);
        WebElement select = driver.findElement(By.xpath("(//li[@class='ui-state-default ui-sortable-handle'])[1]"));
	    WebElement select2 = driver.findElement(By.xpath("(//li[@class='ui-state-default ui-sortable-handle'])[5]"));
	    Actions build=new Actions(driver);
	    build.clickAndHold(select).moveToElement(select2).perform();
	     Thread.sleep(2000);
	     driver.close();
	    
	}

}
