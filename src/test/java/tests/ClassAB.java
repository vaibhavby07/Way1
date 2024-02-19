package tests;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassAB
{
	RemoteWebDriver driver=new FirefoxDriver();
	@Test
	public void QW()throws Exception
	{
	System.out.println("Open Chrome browser");
	WebDriverManager.firefoxdriver().setup();
   Thread.sleep(1000);
	}
	@Test
	public void ER()throws Exception
	{
	  System.out.println("Launching Youtube Website");
	  driver.get("https://www.youtube.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  driver.close();
	}
}
