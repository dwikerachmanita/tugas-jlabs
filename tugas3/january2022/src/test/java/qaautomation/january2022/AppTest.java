package qaautomation.january2022;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest extends BaseWebTest {

	@Test
	public void test1() {
		String username = "tomsmith";
		String password = "SuperSecretPassword!";

		driver.get().findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(username);
		driver.get().findElement(By.id("password")).sendKeys(password);
		driver.get().findElement(By.xpath("//button[@type='submit']")).click();
		String actualText = driver.get().findElement(By.xpath("//div[@id='flash']")).getText();
		String expectedText = "You logged into a secure area";
		System.out.println(actualText);
		Assert.assertTrue(actualText.contains(expectedText));
	}

	@Test
	public void test2() {
		String username = "tomsmith";
		String password = "SuperWrongPassword";

		driver.get().findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(username);
		driver.get().findElement(By.id("password")).sendKeys(password);
		driver.get().findElement(By.xpath("//button[@type='submit']")).click();
		String actualText = driver.get().findElement(By.xpath("//div[@id='flash']")).getText();
		String expectedText = "Your password is invalid";
		System.out.println(actualText);
		Assert.assertTrue(actualText.contains(expectedText));
	}
	
	@Test
	public void test3() {
		String username = "tomsmith";
		String password = "SuperSecretPassword!";
		
		driver.get().findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(username);
		driver.get().findElement(By.id("password")).sendKeys(password);
		driver.get().findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.get().findElement(By.xpath("//a[@class='button secondary radius']")).click();
		String actualText2 = driver.get().findElement(By.xpath("//div[@id='flash']")).getText();
		String expectedText2 = "You logged out of the secure area!";
		System.out.println(actualText2);
		Assert.assertTrue(actualText2.contains(expectedText2));
	}

}
