package AddToCart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleProductAddList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\ITTraining\\AllDriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();
        
        List<WebElement>products=driver.findElements(By.cssSelector("div.product"));
        
        for(int i=0; i<products.size(); i=i+1) 
        {
        	String name= products.get(i).getText();
        	
        	if (name.contains("Cucumber"))
        	{
        		driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
        	
        		break;
        	}
        }
        
        
        driver.close();
        
	
	}



	}


