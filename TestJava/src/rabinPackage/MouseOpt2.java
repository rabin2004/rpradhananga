package rabinPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
public class MouseOpt2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="https://www.bankrate.com/";
		driver.manage().window().maximize();
		driver.get(url);
		Actions action=new Actions(driver);
		action.contextClick();
		Thread.sleep(2000);
		action.doubleClick();
		Thread.sleep(2000);
		WebElement Mortgage=driver.findElement(By.linkText("Mortgages"));
		action.clickAndHold(Mortgage);
		Thread.sleep(2000);
		action.release();
		Thread.sleep(2000);
		action.keyDown(Keys.ALT).perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.CANCEL).perform();
		Thread.sleep(2000);
		action.keyUp(Keys.ALT).perform();
		Thread.sleep(2000);
		WebElement Creditcard=driver.findElement(By.linkText("Credit Cards"));
		action.moveToElement(Creditcard).perform();
		Thread.sleep(2000);
		WebElement WellsFargo=driver.findElement(By.linkText("Wells Fargo"));
		action.moveToElement(WellsFargo).click().perform();
		Thread.sleep(2000);
		WebElement Retirement=driver.findElement(By.linkText("Retirement"));
		action.moveToElement(Retirement).perform();
		WebElement WhatIsIRA=driver.findElement(By.linkText("What is an IRA?"));
		action.moveToElement(WhatIsIRA).click().perform();
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

}
