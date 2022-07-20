package Browser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
public static WebDriver driver;
public static WebDriverWait wait;
public static void OpenBrowser() 
{
	try {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	}

   catch(Exception e)
{
	System.out.println(e);
}
}
public static void openurl(String url) 
{
	try {
	driver.get(url);
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("search")));
}
	catch(Exception e) {
		System.out.println(e);
	}
}
public static String GetTitle() throws Throwable {
	String title=driver.getTitle();
	Thread.sleep(2000);
	return title;
	
}
public static void CloseBrowser() throws Exception {
	Thread.sleep(2000);
	driver.quit();
}
}
