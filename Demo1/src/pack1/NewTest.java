package pack1;

import org.testng.annotations.Test;

public class NewTest {
  @Test (priority=2)
  public void Login() {
	  System.out.println("code for login");
	  
  }
  @Test (priority=1,enabled=false)
  public void Registration() {
	  System.out.println("code for registeration");
	  
  }
  @Test (priority=4)
  public void Logout() {
	  System.out.println("code for logout");
	  
  }
  @Test (priority=3)
  public void Addtocart() {
	  System.out.println("code for addtocart");
	  
  }
}
