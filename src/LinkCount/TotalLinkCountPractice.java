package LinkCount;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinkCountPractice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ITTraining\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		
		//total link
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//footer link count
		WebElement footer=driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		//column link 
		
	     WebElement column=footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	     System.out.println(column.findElements(By.tagName("a")).size());
	     
	     for (int i=1; i<column.findElements(By.tagName("a")).size(); i=i+1)
	     {
	    	 String clickOnLink=Keys.chord(Keys.CONTROL, Keys.ENTER);
	    	 column.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
	     }
	     
	     Thread.sleep(3000);
	     //driver.close();
	     driver.quit();
		

	}

}
