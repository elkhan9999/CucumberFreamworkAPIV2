package Logintest;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MyInfo {

	WebDriver driver;
	
	
	@Test(priority=2,alwaysRun=true)
	void myinfo() {
		
	WebElement Myinfolink=driver.findElement(By.xpath("//span[text()='My Info']"));
	Myinfolink.click();
	boolean Status2= Myinfolink.isDisplayed();
	WebElement pageheading=driver.findElement(By.xpath("//h6[text()='Reset Password']"));
	boolean Status1=pageheading.isDisplayed();
	//System.out.println(Status1,Status2);
	
	}
	
	
	
	@Test(priority=1,alwaysRun=true,dataProvider="dp")
	  void login(String user,String pass) {
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	String title=driver.getTitle();
	System.out.println("Title of the page "+title);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement username=driver.findElement(By.name("username"));
	boolean status=username.isDisplayed();
	System.out.println(status);
	username.sendKeys("Admin");
	WebElement password=driver.findElement(By.name("password"));
	boolean status2=password.isDisplayed();
	password.sendKeys("admin123");
	System.out.println(status2);
	WebElement loginbutton=driver.findElement(By.xpath("//button[@type='submit']"));
	loginbutton.click();
	  }
	@DataProvider(name="dp")
	String [][] Test()
	{String data[][]= {
			{"Admin","admin123"},
			{"Admin1","admin123"},
			{"Admin","admin1234"},
	};
	return data;
	}
	@Test(priority=3,alwaysRun=true)
	  void logout()
	    {System.out.println("After class");
	         driver.close();
	    }
}
