package assignment7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[1]")).click();
        String title=driver.getTitle();
        System.out.println(title);
        driver.get("http://leafground.com/pages/Image.html");
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[2]")).click();
        String title2=driver.getTitle();
        System.out.println(title2);
        driver.get("http://leafground.com/pages/Image.html");
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[3]")).click();
        String title3=driver.getTitle();
	     System.out.println(title3);
	}

}
