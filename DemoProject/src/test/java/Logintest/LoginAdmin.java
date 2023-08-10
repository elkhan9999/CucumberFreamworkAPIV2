package Logintest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginAdmin {

	
	
	WebDriver driver;
	
	@Test(groups= {"Regression"})
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

	
//driver.findElement(By.linkText("Admin")).click();
	//System.out.println("user entered admin page");
	//Thread.sleep(3000);
	//WebElement usercheckbox=driver.findElement(By.xpath("//div[@class='oxd-checkbox-wrapper']"));
	//usercheckbox.click();
//	WebElement userdelete=driver.findElement(By.xpath("//button[@type='button' and @class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-horizontal-margin']"));
//	userdelete.click();
//	JavascriptExecutor js=(JavascriptExecutor)driver;
//    js.executeScript("window.scrollTo( 0, document.body.scrollHeight)");
//   System.out.println("scroll to the end");
//   WebElement linktext=driver.findElement(By.linkText("OrangeHRM, Inc"));
//   System.out.println(linktext.getText());
//    Thread.sleep(3000);

    @Test(priority=3,dependsOnMethods= {"openapp"})
    void logout()
    {System.out.println("After class");
         driver.close();
    }
	
	
	
	
	
	
	
	

}}
