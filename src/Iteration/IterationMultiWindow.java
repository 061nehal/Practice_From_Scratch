package Iteration;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IterationMultiWindow {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ITTraining\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/ITTraining/OurWebSite.html");
		
		driver.findElement(By.partialLinkText("Googl")).click();
		driver.findElement(By.partialLinkText("Page 2")).click();
		
		Set<String>windowHandles=driver.getWindowHandles();
		Iterator<String>it=windowHandles.iterator();
		
		while (it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		

	}

}
