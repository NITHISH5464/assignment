package assignment12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jdroppable {
public static void main(String[] args)  {
	//ChromeOptions option=new ChromeOptions();
	//option.addArguments("--disable-notifications");
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//Thread.sleep(2000);
	driver.switchTo().frame(0);
	WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
    WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
    Actions build=new Actions(driver);
    build.dragAndDrop(source, target).build().perform();
driver.close();
}

}
