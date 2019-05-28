import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NgTest {
	@BeforeClass
	public void LaunchBrowser() {
	System.out.println("Launch");
	}
	@AfterClass
	public void close() {
	System.out.println("close");
	}
	@BeforeMethod
	public void startTime() {
		Date d= new Date();
		
	System.out.println(d);
	}
	@AfterMethod
	public void endTime() {
	Date d=new Date();                                                   
	System.out.println(d);
	}
	@Test(priority = 1)
	public void test1() {
	System.out.println("test 1");
	}
	@Test(enabled = false)
	public void test2() {
	System.out.println("test2");
	}
	@Test(priority = 3)
	public void test3() {
System.out.println("test3");
	}
}
