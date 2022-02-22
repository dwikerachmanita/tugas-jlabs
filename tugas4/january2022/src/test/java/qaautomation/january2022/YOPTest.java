package qaautomation.january2022;

import org.testng.Assert;
import org.testng.annotations.Test;

import qaautomation.january2022.pages.YOPMail;

public class YOPTest extends YOPBaseTest {

	@Test
	public void test1() {
		YOPMail yopmail = new YOPMail(driver, explicitWait);
		
		yopmail.inputEmail("testautomation");
		yopmail.clickBtn();
		
		Assert.assertTrue(yopmail.iconText().contains("Print"));
	}
}
