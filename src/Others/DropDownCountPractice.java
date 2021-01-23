package Others;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownCountPractice {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "‪D:\\ITTraining\\AllDriver\\chromedriver.exe");
		driver.get("file:///D:/ITTraining/OurWebSite.html");
		driver.manage().window().maximize();
		
		List<WebElement>monthList=driver.findElement(By.id("month")).findElements(By.tagName("option"));
		
		int totalMonth=monthList.size()-1;
		System.out.println("Total number of months are "+totalMonth);
		
		for (int i=1; i<totalMonth; i=i+1)
		{
		  System.out.println(i+". "+monthList.get(i).getText());
		}
		
		
		
		
		

	}

}
