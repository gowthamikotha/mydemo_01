package demo2.demo2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class excercise1 {
	@Test(priority=2)
	  public void tmethod1() {
		  System.out.println("this is method1");
	  }
	  @Test(priority=1)
	  public void tmethod2() {
		  System.out.println("this is method2");
	  }
	  @Test(priority=3)
	  public void tmethod5() {
		  System.out.println("this is method5");
	  }
	  @BeforeMethod
		 public void beforemethod() {
			 System.out.println("this is executed after every test ");
		 }
		 @AfterClass
		 public void afterclass() {
			 System.out.println("this is executed after all methods");
		 }
}
