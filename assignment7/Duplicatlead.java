package assignment7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Duplicatlead {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.linkText("Email")).click();
	driver.findElement(By.id("ext-gen282")).sendKeys("sharath@gmail.com");
	driver.findElement(By.id("ext-gen334")).click();
	driver.findElement(By.linkText("srm")).click();
    driver.findElement(By.xpath("(//a[@class='subMenuButton'])[1]")).click();
    String title=driver.getTitle();
   String title1="Duplicate Lead | opentaps CRM";
   System.out.println(title);
   driver.findElement(By.className("smallSubmit")).click();
	String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	System.out.println(text);
	
	driver.close();
   
   // driver.findElement(By.xpath(""))
    
	}}

