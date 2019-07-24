package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class frames {
	WebDriver driver;
	@Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	  driver.manage().window().maximize();
	  driver.switchTo().frame(driver.findElement(By.name("iframeResult")));
	  driver.findElement(By.xpath("//button[text()='Try it']")).click();
	  String s=driver.switchTo().alert().getText();
	  System.out.println(s);
	  driver.switchTo().alert().accept();
	  driver.switchTo().defaultContent();
	  String t=driver.findElement(By.xpath("//span[text()='JavaScript Alert']")).getText();
	  System.out.println(t);
	  driver.close();
  }
}
