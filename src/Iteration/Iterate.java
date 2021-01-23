package Iteration;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iterate {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ITTraining\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/ITTraining/OurWebSite.html");
		driver.findElement(By.partialLinkText("Googl")).click();
		
		Set<String>windowHandles=driver.getWindowHandles();
		Iterator<String>it=windowHandles.iterator();
		
		String mainWindow=it.next();
		String childWindow=it.next();
		driver.switchTo().window(childWindow);
		
		
		driver.findElement(By.name("q")).sendKeys("Software Automation Engineer Salary");
		Thread.sleep(3000);
		
		driver.close();
		

	}

}
