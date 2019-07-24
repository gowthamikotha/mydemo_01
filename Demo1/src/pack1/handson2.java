package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class handson2 {
	WebDriver driver;
	  @Test(dataProvider = "dp")
	  public void f(String s1, String s2) throws InterruptedException {
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(s1);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(s2);
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		
	  }

	  @AfterMethod 
	  public void afterMethod1() {
			WebElement o=driver.findElement(By.xpath("//a[contains(text(),'SignOut')]"));
			o.click();
	  }
	 


	  @DataProvider
	  public Object[][] dp() {
	    return new Object[][] {
	      new Object[] { "asdfgh", "asdfgh" },
	      new Object[] { "qwerty", "qwerty" },
	      new Object[] { "zxcvbn", "zxcvbn" },

	    };
	  }
	  @BeforeClass
	  public void beforeClass() {
			System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://10.232.237.143:443/TestMeApp");
			  driver.manage().window().maximize();

	  }
	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }
}
