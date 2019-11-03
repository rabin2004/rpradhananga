package rabinPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class FacebookTest {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="http://www.facebook.com";
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.name("firstname")).sendKeys("Rabin");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("Pradhananga");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("123456789");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("XYZ@123");
		Thread.sleep(2000);
		Select drp=new Select(driver.findElement(By.id("month")));
		drp.selectByVisibleText("Jan");
		Thread.sleep(2000);
		Select drp1=new Select(driver.findElement(By.id("day")));
		drp1.selectByVisibleText("1");
		Thread.sleep(2000);
		Select drp2=new Select(driver.findElement(By.id("year")));
		drp2.selectByVisibleText("2000");
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_8")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_9")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_a")).click();
		Thread.sleep(2000);
		driver.close();
		driver.quit();
}
}