package Demo11;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo12 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space(='OrangeHRM Inc']"));
		Set<String> windowsID=driver.getWindowHandles();
		List <String>windowsList=new ArrayList(windowsID);
		String parentwindow=windowsList.get(0);
		System.out.println(parentwindow);
		String childwindow=windowsList.get(1);
		System.out.println(childwindow);
		driver.switchTo().window(childwindow);
		driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
		WebElement username=driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		WebElement loginbutton=driver.findElement(By.xpath("//button[@type='submit']"));
	    loginbutton.click();
	    driver.quit();
		

	}

}
