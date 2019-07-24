package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class actions {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.spicejet.com/");
	  driver.manage().window().maximize();
	  WebElement e1=driver.findElement(By.xpath("//a[text()='Add-Ons']"));
	  Actions a1=new Actions(driver);
	  a1.moveToElement(e1).build().perform();
  }
}
