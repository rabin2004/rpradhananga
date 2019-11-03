package rabinPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HDFCbank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chrome driver\\chromedriver.exe");
		String url="https://www.hdfcbank.com/personal/HNW_Banking/hnw_banking";
		WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get(url);
		  /*driver.switchTo().alert();
		  driver.switchTo().alert().dismiss();
		  Actions action=new Actions(driver);
		  WebElement CloseAlert=driver.findElement(By.xpath("//img[@class='popupCloseButton']"));
		  action.moveToElement(CloseAlert).click().perform();
		  */
		  String AlertTxt=driver.switchTo().alert().getText();
		  System.out.println("Alert text: "+AlertTxt);
		  driver.switchTo().alert().accept();
		  driver.findElement(By.linkText("Important Messages")).click();
		  WebElement ClickHere=driver.findElement(By.linkText("Click here"));
		  ClickHere.click();
		  driver.close();
		  driver.quit();
	}

}
