package pack1;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class NewTest2 {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  System.out.println("username is :"+n);
	  System.out.println("Password is:"+s);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}
