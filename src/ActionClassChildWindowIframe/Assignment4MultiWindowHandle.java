package ActionClassChildWindowIframe;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4MultiWindowHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\ITTraining\\\\AllDriver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.linkText("Click Here")).click();
		
		String mainWindow=driver.getWindowHandle();
		Set<String>childWindow=driver.getWindowHandles();
		
		for (String child:childWindow)
		{
			driver.switchTo().window(child);
		}
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
		
		driver.switchTo().window(mainWindow);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
		
		

	}

}
