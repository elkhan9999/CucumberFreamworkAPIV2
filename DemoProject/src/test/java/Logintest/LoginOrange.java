package Logintest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginOrange {
	WebDriver driver;
	
	@Test(priority=1)
    void openapp() {
        driver= new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        String title= driver.getTitle();
        System.out.println("Title of Page is " +title);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        System.out.println("Before class");
    }

    @Test(priority=2,dependsOnMethods= {"openapp"})
    void login() {

        WebElement username=driver.findElement(By.name("username"));
        boolean status =username.isDisplayed();
        System.out.println(status);
        username.sendKeys("Admin");
        WebElement password=driver.findElement(By.name("password"));
        boolean status2 =password.isDisplayed();
        password.sendKeys("admin123");
        System.out.println(status2);
        WebElement loginbutton=driver.findElement(By.xpath("//button[@type='submit']"));
        loginbutton.click();
        System.out.println("Login with Valid Credentials");

    }

    @Test(priority=3,dependsOnMethods= {"openapp"})
    void logout()
    {System.out.println("After class");
         driver.close();
    }
	
	
	
	
	

}
