package Loginresete;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class resetepassword {

	
		WebDriver driver;
	
		
		  void openapp() {	
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String title=driver.getTitle();
		System.out.println("Title of the page "+title);
		}
		
		void forgot() {
		WebElement forgetelement=driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));
		forgetelement.click();
		WebElement pageheading=driver.findElement(By.xpath("//h6[text()='Reset Password']"));
		boolean Status1=pageheading.isDisplayed();
		System.out.println(Status1);
		}
		
		
		 void logout()
		    {System.out.println("After class");
		         driver.close();
		    }
		
		
		
		

	}

	
	


