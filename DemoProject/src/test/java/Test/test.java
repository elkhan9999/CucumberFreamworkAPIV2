package Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test {
	

	
	
	
	
	
	@Test(priority=2)
	void run() {
		System.out.println("hi1");
	}
	
	
	@Test(priority=1)
	void run1() {
		System.out.println("hello1");
	}
	
	
	
	
	

}
