package Others;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElementPractice {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\ITTraining\\AllDriver\\chromedriver.exe");
		driver.get("file:///D:/ITTraining/OurWebSite.html");
		driver.manage().window().maximize();
		
		List<WebElement>firstName=driver.findElements(By.id("FN"));
		
		for (int i=0; i<firstName.size(); i=i+1)
		{
			WebElement ele=firstName.get(i);
			int X1=ele.getLocation().getX();
			if(X1!=0)
			{
				ele.sendKeys("Nehal");
			}
		}
		Thread.sleep(3000);
		
		File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(s, new File("D:\\ITTraining\\ScreenShot\\Practice.jpg"));
		
		driver.findElement(By.partialLinkText("Google")).click();
		
		String mainWindow=driver.getWindowHandle();
		Set<String>googleWindow=driver.getWindowHandles();
		
		for(String child:googleWindow)
		{
			driver.switchTo().window(child);
		}
		
		driver.findElement(By.name("q")).sendKeys("Software Test Automation ");

	}

}
