package TaskList;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLandingPage extends Base {
	@Test
	public void TestSearchBoxExists() throws InterruptedException {
		//Actual output
		
		// go to daraz
		//driver.get("https://www.daraz.com/");
		
		
//		Boolean isExists = driver.findElement(By.id("q")).isDisplayed();  //true = if exist or false is not
//		
//		Boolean expected = true;
//		Assert.assertEquals(isExists, expected);
//		//li/ul/li[2]/a[@href="https://www.daraz.com.bd/"]
	
	}
	@Test
	public void testAddToCartOptionExisits() {
		Boolean isDisplayed  = driver.findElement(By.xpath("//div[@class='lzd-nav-cart']")).isDisplayed();
		
		System.out.println("Actual for add to cart :" + isDisplayed);
		Boolean expected = true;
		
		Assert.assertEquals(isDisplayed, expected);
	}
	@Test
	public void testCartOptionActive() {
		Boolean isEnabled = driver.findElement(By.xpath("//div[@class='lzd-nav-cart']")).isEnabled();
		System.out.println("Actual for add to cart active :" +  isEnabled);
		
		Boolean expected = true;
		
		Assert.assertEquals(isEnabled, expected);
	}
}
