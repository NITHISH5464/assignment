package assignment7;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ACMEloginAssmnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver login=new ChromeDriver();
		login.manage().window().maximize();
		login.get("https://acme-test.uipath.com/login");
		login.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		login.findElement(By.id("password")).sendKeys("leaf@12");
		login.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("ACME System 1 -  Dashboard");
		login.findElement(By.linkText("Log In")).click();
		
		
		
		

	}

}
