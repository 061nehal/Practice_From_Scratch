package DropDownPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class e2ePracticeAfain {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ITTraining\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/Default.aspx");
		
		//city select
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.cssSelector("a[value='CCU']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='SXR'])[2]")).click();
		
		//return date validation
		System.out.println(driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();//round trip select
		System.out.println(driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style"));
	
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("Return date is enabled");
		}
		
		driver.findElement(By.className("ui-datepicker-trigger")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[2]/td[4]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='Div1']/button")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[3]/td[2]/a")).click();
		Thread.sleep(2000);
		
		//passenger select
		driver.findElement(By.className("paxinfo")).click();
		
		Select adultPassenger=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		Select childPassenger=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		
		adultPassenger.selectByValue("3");
		childPassenger.selectByVisibleText("2");
		
		Select currency=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		currency.selectByVisibleText("USD");
		
		//checkbox select & validation
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		driver.close();
		
		

	}

}
