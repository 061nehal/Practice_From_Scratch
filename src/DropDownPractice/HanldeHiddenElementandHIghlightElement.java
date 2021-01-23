package DropDownPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HanldeHiddenElementandHIghlightElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nehal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/ITTraining/OurWebSite.html");
		driver.manage().window().maximize();
		
		List<WebElement>fname=driver.findElements(By.id("FN"));
		
		for (int i=0; i<fname.size(); i=i+1) {
			WebElement ele=fname.get(i);
			int Y1=ele.getLocation().getX();
		
			if (Y1!=0) {
				WebElement fname1=driver.findElement(By.id("FN"));
				JavascriptExecutor jse=((JavascriptExecutor)driver);
				jse.executeScript("arguments[0].setAttribute('style', 'background: yellow; border:4px solid red;');", fname1);
			}
		}
		
		driver.close();
		
	}

}
