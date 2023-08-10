package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	@BeforeMethod    
	void before()    
	{
	    System.out.println("Before class");
	}

	 

	@AfterMethod()
	void after()    
	{
	    System.out.println("after class");
	}

	@Test(priority=1)
	void run()
	{
	    System.out.println(" Hi I am the first method");
	}


	 

	@Test(priority=2)
	void run2()
	{
	System.out.println(" Hi I am the second method");
	}    
	

}
