package Parrale;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Parralle {
	WebDriver driver;
	
public void Launch(String br)	{
	if(br.equals("chrome"))
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
}
else
{
	driver=new EdgeDriver();
	driver.get("https://www.facebook.com/");

	
	}	
	

}
