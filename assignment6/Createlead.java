package assignment6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createlead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.of(10);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		String title=driver.getTitle();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ACCENTURE");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("NITHISH");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ACCENTURE");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("nithish");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("s");
	
		String text = driver.findElement(By.id("createLeadForm_dataSourceId")).getText();
		text.indexOf(3);
		
		String text2 = driver.findElement(By.id("createLeadForm_marketingCampaignId")).getText();
		text.indent(3);
		driver.findElement(null)
	}
	

}
