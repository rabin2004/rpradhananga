package rabinPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
public class MouseOperation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="https://www.bankrate.com/";
		driver.manage().window().maximize();
		driver.get(url);
		Actions action=new Actions(driver);
		action.contextClick();
		action.doubleClick();
		action.clickAndHold();
		action.keyDown(Keys.SHIFT).perform();
		WebElement Banking=driver.findElement(By.linkText("Banking"));
		action.moveToElement(Banking).perform();
		Thread.sleep(2000);
		WebElement ClickSavingCalculator=driver.findElement(By.linkText("Savings calculator"));
		action.moveToElement(ClickSavingCalculator).click().perform();
		//driver.navigate().back(); Didn't work
		Thread.sleep(2000);
		WebElement Loans=driver.findElement(By.linkText("Loans"));
		action.moveToElement(Loans).perform();
		Thread.sleep(2000);
		WebElement PersonalLoan=driver.findElement(By.linkText("Personal loans"));
		action.moveToElement(PersonalLoan).click().perform();
		Thread.sleep(2000);
		WebElement BankRate=driver.findElement(By.xpath("//*[@id=\'csstyle\']/div[3]/header/a"));
		action.moveToElement(BankRate).click().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'authenticatedAppMenu\']/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create account")).click();
		//driver.navigate().back(); Didn't work
		driver.findElement(By.id("first_name")).sendKeys("John");
		Thread.sleep(2000);
		action.keyDown(Keys.SHIFT).perform();
		action.sendKeys(Keys.F7).perform();
		action.keyDown(Keys.SHIFT).perform();
		action.release().perform();
		driver.findElement(By.id("email")).sendKeys("John000@gmail.com");
		driver.findElement(By.id("password")).sendKeys("John@123456789");
		Thread.sleep(2000);
		driver.findElement(By.id("create-account")).click();
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

}
