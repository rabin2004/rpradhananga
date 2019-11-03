package rabinPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="http://www.newtours.demoaut.com/";
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.xpath(".//*[@name='firstName']")).sendKeys("John");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Legend");
		driver.findElement(By.xpath("//*[@name='phone']")).sendKeys("123456789");
		driver.findElement(By.xpath(".//input[@name='userName']")).sendKeys("johnlegend@gmail.com");
		driver.findElement(By.xpath("//*[@name='address1']")).sendKeys("504, 42nd street");
		driver.findElement(By.xpath("//*[@name='address2']")).sendKeys("13th floor");
		driver.findElement(By.xpath(".//input[@name='city']")).sendKeys("NY");
		driver.findElement(By.xpath("//*[@name='state']")).sendKeys("NY");
		driver.findElement(By.xpath(".//input[@name='postalCode']")).sendKeys("12345");
		Select drp=new Select(driver.findElement(By.xpath(".//select[@name='country']")));
		drp.selectByVisibleText("UNITED KINGDOM ");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("johnlegend@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("johnlegend$12345");
		driver.findElement(By.xpath(".//*[@name='confirmPassword']")).sendKeys("johnlegend$12345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='image']")).click();
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

}
