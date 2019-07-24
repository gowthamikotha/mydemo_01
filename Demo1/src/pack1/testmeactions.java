package pack1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class testmeactions {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		  driver.manage().window().maximize();
		  Actions a1=new Actions(driver);
		  WebElement e1=driver.findElement(By.xpath("//span[text()='AboutUs']"));
		  a1.moveToElement(e1).build().perform();
		  WebElement e2=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/a/span"));		 
		  a1.click(e2).build().perform();
		  WebElement e3=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/ul/li[2]/a/span"));
		  a1.click(e3).build().perform();
		  Thread.sleep(5000);
			Set<String> t_windows=driver.getWindowHandles();
			int c_win=t_windows.size();
			//System.out.println(c_win);
			for(String s:t_windows) {
				driver.switchTo().window(s);
				System.out.println(driver.getWindowHandle());
			}
		  driver.switchTo().frame(driver.findElement(By.name("main_page")));
		  String s=driver.findElement(By.xpath("//address[@id='demo3']")).getText();
		  System.out.println(s);
		  driver.close();
		  




  }
}
