package rabinPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class MercuryTour {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="http://www.newtours.demoaut.com/";
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Jonny");
		driver.findElement(By.name("lastName")).sendKeys("Sepherd");
		driver.findElement(By.name("phone")).sendKeys("123456789");
		driver.findElement(By.id("userName")).sendKeys("JonnySepherd@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("254 54th Street");
		driver.findElement(By.name("address2")).sendKeys("9th floor");
		driver.findElement(By.name("city")).sendKeys("NY");
		driver.findElement(By.name("state")).sendKeys("NY");
		driver.findElement(By.name("postalCode")).sendKeys("12345");
		Select drp=new Select(driver.findElement(By.name("country")));
		drp.selectByVisibleText("UNITED STATES");
		driver.findElement(By.name("email")).sendKeys("JonnySepherd@gmail.com");
		driver.findElement(By.name("password")).sendKeys("J@S12345");
		driver.findElement(By.name("confirmPassword")).sendKeys("J@S12345");
		driver.findElement(By.name("register")).click();
		String Registration = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font")).getText();
		System.out.println("Confirmed registration: " +Registration);
		driver.close();
		driver.quit();
}
}