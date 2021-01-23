package LinkCount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinkCount {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ITTraining\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//total links count
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//footer links count
		WebElement footer=driver.findElement(By.cssSelector("div#gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		//collumn links count & click
		WebElement column=footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(column.findElements(By.tagName("a")).size());
		
		for (int i=1; i<column.findElements(By.tagName("a")).size(); i=i+1)
		{
			column.findElements(By.tagName("a")).get(i).click();
		}
		
		

	}

}
