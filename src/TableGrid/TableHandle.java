package TableGrid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ITTraining\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22759/ind-vs-sl-3rd-t20i-sri-lanka-tour-of-india-2020");
		
		WebElement table=driver.findElement(By.xpath("//div[@id='innings_1']/div[1]"));
		int rowCount=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		
		int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
		for (int i=0; i<count-2; i=i+1)
		{
			System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
		}
		System.out.println("Extra  "+driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[11]/div[2]")).getText());
		System.out.println("Total Run  "+driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[12]/div[2]")).getText());
		
		

	}

}
