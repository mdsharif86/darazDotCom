package TaskList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage_Test extends Base {
	@Test(priority=2)
	public void TestSearchBoxExists() throws InterruptedException {
		// Actual output

		// go to daraz
		driver.get("https://www.daraz.com.bd/");

		Boolean isExists = driver.findElement(By.id("q")).isDisplayed(); // true = if exist or false is not

		Boolean expected = true;
		Assert.assertEquals(isExists, expected);
		// li/ul/li[2]/a[@href="https://www.daraz.com.bd/"]

	}// main
		// @Test
//	public void TestCartOptionExists() {
//		Boolean isExists = driver.findElement(By.xpath("//span[@class='cart-icon']")).isDisplayed();
//		
//		System.out.println("Actual ouput for the cart options:" + isExists);
//		
//		Boolean expected = true;
//		
//		Assert.assertEquals(isExists, expected);
//		
//	}
	// @Test
//	public void TestCatoriesTypes() {
//		
//		List<WebElement>TestCatoriesTypes = driver.findElements(By.xpath("//a[@class=\"card-categories-li-content\"]"));
//		
//		int total =  TestCatoriesTypes.size();
//		System.out.println("Total catogory List :"  + TestCatoriesTypes.size());
//		
//		Assert.assertEquals(total, 16);
//	}

	@Test(priority=1)
	public void TestCategoriesNames() throws InterruptedException {
		Thread.sleep(5000);
		List<WebElement> TestCatoriesList = driver.findElements(By.xpath("//div[@class='card-categories-ul']/div/a"));
		
		int total = TestCatoriesList.size();
		System.out.println("Total catogory List :" + total);

		Assert.assertEquals(total, 16);

		int index = 1;
		for (WebElement category : TestCatoriesList) {
			String categoryName = category.findElement(By.xpath(".//span")).getText();
			System.out.println("category Name [" + index + "] : " + categoryName);

			index++;
		}
	}
}// class
