package qaautomation.january2022.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YOPMail extends BasePage {
	@FindBy(xpath = "//input[@id='login']")
	private WebElement emailInput;

	@FindBy(xpath = "//i[@class='material-icons-outlined f36']")
	private WebElement btn;
	
	@FindBy(xpath = "//iframe[@name='ifmail']")
	private WebElement mailFrame;
	
	@FindBy(xpath = "/html[1]/body[1]/header[1]/div[2]/button[1]/span[1]")
	private WebElement icon;

	public YOPMail(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}

	public void inputEmail(String email) {
		emailInput.sendKeys(email);
	}

	public void clickBtn() {
		btn.click();
	}
	
	public String iconText() {
		driver.get().switchTo().frame(mailFrame);
		return icon.getText();
	}

}
