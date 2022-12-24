package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbaseclass {
	public static WebDriver driver;
   
    public static void launchBrowser() throws Exception
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\nitin\\eclipse-workspace\\SeleniumProject\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	Thread.sleep(2000);
    	driver.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
    	driver.manage().deleteAllCookies();
    }

}
