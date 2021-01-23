package MultiWindowSelfPractice;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ITTraining\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/ITTraining/OurWebSite.html");
		
		driver.findElement(By.partialLinkText("Googl")).click();
		driver.findElement(By.partialLinkText("Page 2")).click();
		
		ArrayList<String>mainWindow=new ArrayList<String>(driver.getWindowHandles());
		ArrayList<String>googleWindow=new ArrayList<String>(driver.getWindowHandles());
		ArrayList<String>page2Window=new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(page2Window.get(3));
		driver.findElement(By.partialLinkText("Facebook")).click();
		
		

	}

}
