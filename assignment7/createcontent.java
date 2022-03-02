package assignment7;

import java.time.Duration;

import org.apache.hc.client5.http.nio.ManagedAsyncClientConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class createcontent {
//	package week2.day2.Assignments;

	//public class CreateContact {

		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get( "http://leaftaps.com/opentaps/control/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Find Leads")).click();
//           * 6. Click on Create Contact
             driver.findElement(By.linkText("Contacts")).click();
//			 * 7. Enter FirstName Field Using id Locator
			 driver.findElement(By.id("ext-gen380")).sendKeys("NITHISH") ;
//			 * 8. Enter LastName Field Using id Locator
              driver.findElement(By.id("ext-gen382")).sendKeys("KUMAR");
			 

//			 * 11. Enter Department Field Using any Locator of Your Choice
			 driver.findElement(By.id("ext-gen384")).sendKeys("9876543");
//			 * 12. Enter Description Field Using any Locator of your choice 
              driver.findElement(By.id("ext-gen392")).clear();
              driver.findElement(By.id("ext-gen392")).sendKeys("+");
              driver.findElement(By.id("ext-gen396")).sendKeys("91");
              driver.findElement(By.id("ext-gen400")).sendKeys("9658373538");
//			 * 13. Enter your email in the E-mail address Field using the locator of your choice
              driver.findElement(By.id("ext-gen410")).sendKeys("cbenithish25@gmail.com");
              driver.findElement(By.id("ext-gen426")).click();
              
//			 * 15. Click on Create Contact
//			 * 
//			 * 16. Click on edit button 
//			 * 
//			 * 17. Clear the Description Field using .clear
//			 * 
//			 * 18. Fill ImportantNote Field with Any text
//			 * 
//			 * 19. Click on update button using Xpath locator
//			 * 
//			 * 20. Get the Title of Resulting Page.
//	         *
//			
		}

	}

