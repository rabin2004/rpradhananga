package rabinPackage;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
public class XpathContainsStartsWith {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="https://www.facebook.com/";
		driver.manage().window().maximize();
		driver.get(url);
		List<WebElement> TextField=driver.findElements(By.xpath("//input[@class='inputtext']"));
		System.out.println("Number of TextField: " +TextField.size());
		TextField.get(0).sendKeys("JohnLegend@gmail.com");
		TextField.get(1).sendKeys("JohnLegend$12345");
		Thread.sleep(2000);
		List<WebElement> TextField2=driver.findElements(By.xpath("//input[@data-type='text']"));
		System.out.println("Number of TextField2: " +TextField.size());
		TextField2.get(0).sendKeys("John");
		TextField2.get(1).sendKeys("Legend");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("JohnLegend@gmail.com");
		driver.findElement(By.xpath("//*[@data-type='password']")).sendKeys("JohnLegend$12345");
		Select Month=new Select(driver.findElement(By.xpath("//*[contains(@id,'month')]")));
		Month.selectByVisibleText("May");
		Select Day=new Select(driver.findElement(By.xpath("//*[contains(@id,'day')]")));
		Day.selectByVisibleText("10");
		Select Year=new Select(driver.findElement(By.xpath("//*[contains(@id,'year')]")));
		Year.selectByVisibleText("2009");
		List<WebElement> Radiobutton=driver.findElements(By.xpath("//input[starts-with(@type,'radio')]"));
		System.out.println("Number of Radiobutton: "+Radiobutton.size());
		Radiobutton.get(0).click();
		Thread.sleep(2000);
		Radiobutton.get(1).click();
		Thread.sleep(2000);
		Radiobutton.get(2).click();
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

}
