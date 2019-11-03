
package rabinPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class ObjectIdentification1 {
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chrome driver\\chromedriver.exe");
	WebDriver Driver=new ChromeDriver();
	String url="http://xpr2t.com/Webobjects.html";
	Driver.manage().window().maximize();
	Driver.get(url);
	Driver.findElement(By.id("usernameid"));
	Driver.findElement(By.id("usernameid")).sendKeys("Rabin");
	Driver.findElement(By.id("usernameid")).clear();
	Driver.findElement(By.id("usernameid")).sendKeys("Upama");
	Driver.findElement(By.name("radiobutton1")).click();
	Driver.findElement(By.name("radiobutton2")).click();
	Driver.findElement(By.name("radiobutton3")).click();
	Driver.findElement(By.name("checkthebox")).click();
	Select Dropdown=new Select(Driver.findElement(By.id("test")));
	Dropdown.selectByVisibleText("Red");
	Select List=new Select(Driver.findElement(By.name("dropdown")));
		List.selectByVisibleText("Audi");
	Driver.findElement(By.xpath("/html/body/table[6]/tbody/tr[2]/td[2]/input")).click();
	Driver.findElement(By.linkText("2.Google")).click();
	Driver.navigate().back();
	Driver.navigate().forward();
	Driver.navigate().back();
	Driver.findElement(By.xpath("/html/body/table[6]")).click();
	Driver.findElement(By.linkText("1.Yahoo")).click();
	Driver.navigate().back();
	Driver.switchTo().frame(0);
	//Driver.switchTo().frame(Driver.findElement(By.xpath("/html/body/table[8]/tbody/tr/td/iframe")));
	Driver.findElement(By.linkText("REGISTER")).click();
	Driver.switchTo().defaultContent();
	Driver.switchTo().frame(1);
	//Driver.switchTo().frame(Driver.findElement(By.xpath("/html/body/table[11]/tbody/tr/td/iframe")));
	Driver.findElement(By.id("datepicker")).click();
	Driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[5]/a")).click();
	Driver.switchTo().defaultContent();
	//Driver.findElement(By.xpath("/html/body/table[12]/tbody/tr/td/input")).click();
	Driver.findElement(By.xpath("/html/body/table[9]/tbody/tr/td/button")).click();
	Thread.sleep(2000);
	String PopUpMessage=Driver.switchTo().alert().getText();
	Thread.sleep(2000);
	System.out.println("PopUpMessage: "+PopUpMessage);
	Thread.sleep(2000);
	Driver.switchTo().alert().accept();
	Driver.switchTo().alert().dismiss();
	String WebText = Driver.findElement(By.xpath("/html/body/table[10]/tbody/tr/td")).getText();
	System.out.println("WebText: "+WebText);
	Driver.close();
 	Driver.quit();

}	
}
