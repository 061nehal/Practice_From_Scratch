package ActionClassChildWindowIframe;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeveralWindowPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ITTraining\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/ITTraining/OurWebSite.html");
		
		
		
		
		driver.findElement(By.partialLinkText("Page 2")).click();
		ArrayList<String>tab1=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab1.get(1));
		driver.findElement(By.xpath("/html/body/a")).click();
		ArrayList<String>tab2=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab2.get(2));
		driver.findElement(By.name("firstname")).sendKeys("Nehal");
		
		ArrayList<String>mainWindow=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(mainWindow.get(0));
		driver.findElement(By.partialLinkText("Goo")).click();
		
		ArrayList<String> googleTab=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(googleTab.get(3));
		driver.findElement(By.name("q")).sendKeys("Software automation Testing");
		
		driver.switchTo().window(tab2.get(2));
		driver.findElement(By.name("lastname")).sendKeys("Hasnain");
		
		
		

	}

}
