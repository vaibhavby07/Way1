package tests;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassA 
{
  //private WebDriver driver;
  RemoteWebDriver driver=new FirefoxDriver();
@Test
  public void OpenA() throws Throwable
  {
	  System.out.println("Open Chrome browser");
	  WebDriverManager.firefoxdriver().setup();
	  
	  Thread.sleep(1000);
  }
  @Test
  public void OpenB() throws Throwable
  {
	  System.out.println("Launching Amazon Website");
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  //driver.close();
  }
  @Test
  public void OpenC()throws Exception
  {
	  driver.switchTo().newWindow(WindowType.WINDOW);
	  System.out.println("Launching Flipcart website");
      driver.get("https://www.flipkart.com/");
      Thread.sleep(1000);
      //driver.close();  
      driver.quit();
  }
}
