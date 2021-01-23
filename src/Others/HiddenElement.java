package Others;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "‪D:\\ITTraining\\AllDriver\\chromedriver.exe");
		driver.get("file:///D:/ITTraining/OurWebSite.html");
		driver.manage().window().maximize();
		
		List<WebElement>firstName=driver.findElements(By.id("FN"));
		System.out.println("Total first name elements are "+firstName.size());
		
		for (int i=0; i<firstName.size(); i=i+1)
		{
			WebElement ele=firstName.get(i);
			int X1=ele.getLocation().getX();
			
			if (X1!=0)
			{
				ele.sendKeys("Nehal");
			}
		}
		Thread.sleep(2000);
		

	}

}
