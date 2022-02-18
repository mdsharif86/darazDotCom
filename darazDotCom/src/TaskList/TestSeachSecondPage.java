package TaskList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSeachSecondPage extends Base {
	@Test
	public void TestTotalSearchResult() {
		//Type HP Laptop core i5 in the search
		////button[@class='search-box__button--1oH7']
		driver.findElement(By.id("q")).sendKeys("HP Laptop core i5");
		driver.findElement(By.xpath("//button[@class='search-box__button--1oH7']")).click();
		
		//total result for the search tag
		String TotalResult= driver.findElement(By.xpath("//div[@class=' c1DXz4']")).getText();
		
		System.out.println("Total seach Result :" + TotalResult);
		
		Assert.assertEquals(TotalResult, "7654 items found for \"HP Laptop core i5\"");
	}
	@Test
	public void testSearchResultForFirstPage() {
		
		driver.findElement(By.id("q")).sendKeys("hp Laptop core i5");
		driver.findElement(By.xpath("//button[@class='search-box__button--1oH7']")).click();
		
		List<WebElement>itemList =  driver.findElements(By.xpath("//div[@class='c2prKC']"));
		System.out.println("in first page, number of search item:"  + itemList.size());
		
		int total = itemList.size();
		
		System.out.println("in First page, number of search items:" + total);
		
		Assert.assertEquals(total, 40);
	}
}
