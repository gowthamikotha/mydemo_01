package demo2.demo2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class excercise1a {

	@Test
	  public void tmethod3() {
		  System.out.println("this is tmethod3");
	  }
	  @Test
	  public void tmethod4() {
		  System.out.println("this is tmethod4");
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
