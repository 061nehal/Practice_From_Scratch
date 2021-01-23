package ActionClassChildWindowIframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\ITTraining\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.ca/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector("a#nav-link-accountList"))).build().perform();
		

	}

}
