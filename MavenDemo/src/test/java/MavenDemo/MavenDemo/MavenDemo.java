package MavenDemo.MavenDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenDemo {
	WebDriver driver;
	@Test
	public void LAUNCHbROWSER()
	{
	String driverPath=System.getProperty("user.dir")+"\\src\\main\\java\\Browser\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", driverPath);
	driver = new ChromeDriver();
	driver.get("https://google.com");
	}
}
