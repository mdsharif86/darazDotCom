package TaskList;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Base {
	WebDriver driver;

	@BeforeSuite
	public void driverSetUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Java\\Chromedrive\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@BeforeMethod
	public void gotoDaraz() {
		driver.get("https://www.daraz.com/");
//		driver.findElement(By.xpath("//a[text()='Shop with us']")).click();
//
//		driver.findElement(By.xpath("//li/ul/li[2]/a[@href=\"https://www.daraz.com.bd/\"]")).click();

	}
	public void sendKeys(By by , String value ) {
		driver.findElement(by).sendKeys(value);
	}
	public void Click(By by) {
		driver.findElement(by).click();
	}
//	@AfterSuite
//	public void driverClose() {
//		System.out.println("hello");
//		driver.close();
//	}

}
