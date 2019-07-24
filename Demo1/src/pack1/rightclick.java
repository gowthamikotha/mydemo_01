package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class rightclick {
	WebDriver driver;
  @Test
  public void f() {

	  System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");
	  driver.manage().window().maximize();
	  WebElement e1=driver.findElement(By.xpath("//b[text()='sign-in here']"));
	  Actions a1=new Actions(driver);
	  a1.doubleClick(e1).build().perform();
	  a1.contextClick(e1).build().perform();
	  
  }
}
