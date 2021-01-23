package Others;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\ITTraining\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Bangladesh");
		List<WebElement>list=driver.findElements(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/ul"));
		
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i=i+1)
		{
			System.out.println(i+". "+list.get(i).getText());
			Thread.sleep(3000);
			if (list.get(i).getText().contains("newspapers"))
			{
				list.get(i).click();
				break;
			}
		}
		
		

	}

}
