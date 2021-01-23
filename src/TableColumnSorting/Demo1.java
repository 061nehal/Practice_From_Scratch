package TableColumnSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class Demo1 {


	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ITTraining\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//List<WebElement>firstColumn=driver.findElements(By.xpath("//tr/td[2]"));
		List<WebElement>firstColumn=driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		
		ArrayList<String> originalList=new ArrayList<String>();
		
		for(int i=0; i<firstColumn.size(); i=i+1)
		{
			//System.out.println(firstColumn.get(i).getText());
			originalList.add(firstColumn.get(i).getText());
		}
		
		ArrayList<String> copiedList=new ArrayList<String>();
		for(int i=0; i<originalList.size(); i=i+1)
		{
			copiedList.add(originalList.get(i));
		}
		
		Collections.sort(copiedList);
		//System.out.println(copiedList);
		System.out.println("*********************");
		for (String c:copiedList) //enhanced for loop instead of traditional for loop
		{
			System.out.println(c);
		}
		System.out.println("******original list***********");
		for(String o:originalList)
		{
			System.out.println(o);
		}
		
	
		//Assert.assertTrue(originalList.equals(copiedList));
		
		
		

	}

}
