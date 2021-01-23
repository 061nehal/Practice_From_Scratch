package DropDownPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EndToEndDropDownPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nehal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/Default.aspx");
		
		//clicking dynamic drop down
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BOM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		
		//Validating Retuen date & selecting Round trip button
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click(); //roundtrip selection
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		 if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"));
		 {
			 System.out.println("Retuen Date is Enabled");
		 }
		 
		Thread.sleep(2000);
		
		driver.findElement(By.className("ui-datepicker-trigger")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[1]/td[5]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"Div1\"]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[3]/td[2]/a")).click();
		
		Thread.sleep(2000);
		//passenger selction
		driver.findElement(By.xpath("//*[@id='divpaxinfo']")).click();
		
		Select adultPassenger=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		Select childPassenger=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		
		adultPassenger.selectByValue("2");
		childPassenger.selectByVisibleText("3");
		
		Thread.sleep(2000);
		
		Select curr=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		curr.selectByVisibleText("USD");
		
		Thread.sleep(2000);
		
		//Select, count and validate check box
		System.out.println(driver.findElement(By.xpath("//*[@type='checkbox']")).isSelected());//validation before click
		driver.findElement(By.cssSelector("#ctl00_mainContent_chk_friendsandfamily")).click();
		//driver.findElement(By.cssSelector("input[name*='SeniorCitizenDiscount']")).click();
		//driver.findElement(By.cssSelector("input#ctl00_mainContent_chk_StudentDiscount")).click();
		System.out.println(driver.findElement(By.xpath("//*[@type='checkbox']")).isSelected()); //validation after click
		
		System.out.println(driver.findElements(By.xpath("//*[@type='checkbox']")).size());
		
		driver.findElement(By.cssSelector("input[id*='FindFlights']")).click();
		
		driver.close();
		

	}

}
