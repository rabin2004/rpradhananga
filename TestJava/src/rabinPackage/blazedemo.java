package rabinPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class blazedemo {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="http://blazedemo.com/";
		driver.manage().window().maximize();
		driver.get(url);
		Select drp1=new Select(driver.findElement(By.name("fromPort")));
		drp1.selectByVisibleText("Boston");
		Select drp2=new Select(driver.findElement(By.name("toPort")));
		drp2.selectByVisibleText("New York");
		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input")).click();
		driver.findElement(By.id("inputName")).sendKeys("Jonny Sepherd");
		driver.findElement(By.name("address")).sendKeys("254 54th street 9th");
		driver.findElement(By.name("city")).sendKeys("NY");
		driver.findElement(By.name("state")).sendKeys("NY");
		driver.findElement(By.name("zipCode")).sendKeys("12345");
		Select drp3=new Select(driver.findElement(By.name("cardType")));
		drp3.selectByVisibleText("American Express");
		driver.findElement(By.id("creditCardNumber")).sendKeys("1234-5678-9012-3456");
		driver.findElement(By.id("creditCardMonth")).sendKeys("09");
		driver.findElement(By.id("creditCardYear")).sendKeys("2021");
		driver.findElement(By.id("nameOnCard")).sendKeys("Jonny Sepherd");
		driver.findElement(By.id("rememberMe")).click();
		driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
		String PurchaseConfirmation = driver.findElement(By.xpath("/html/body/div[2]/div/h1")).getText();
		System.out.println("Purchase Confirmation: "+PurchaseConfirmation);
		driver.close();
		driver.quit();
}
}