package generic_script;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class base_test implements framework_constant
{
	public WebDriver driver;
	@BeforeMethod
	public void openappln()
	{
		System.setProperty(gecko_key,gecko_value);
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeappln(ITestResult res) throws IOException, InterruptedException
	{
		if(ITestResult.FAILURE==res.getStatus())
		{
			screenshot_script.getphoto(driver);
		}
		driver.close();
	}

}
