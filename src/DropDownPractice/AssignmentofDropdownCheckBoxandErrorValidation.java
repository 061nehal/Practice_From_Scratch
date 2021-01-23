package DropDownPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class AssignmentofDropdownCheckBoxandErrorValidation {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\ITTraining\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"ORtrip\"]/section[2]/div[1]/dl/dd/div/a/i")).click();
		driver.findElement(By.cssSelector("a[class='ui-state-default ui-state-highlight ui-state-active ']")).click();
		
		
		Select adult=new Select(driver.findElement(By.id("Adults")));
		Select children=new Select(driver.findElement(By.id("Childrens")));
		
		adult.selectByValue("3");
		children.selectByVisibleText("2");
		Thread.sleep(2000);
		
		driver.findElement(By.id("MoreOptionsLink")).click();
		
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Emirates");
		
		driver.findElement(By.id("SearchBtn")).click();
		
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
		
	
	}
	
}

		
