package AddToCart;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleProductsArrayList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nehal\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String[] itemsNeeded= {"Cucumber", "Beetroot", "Brocolli", "Carrot", "Tomato"};
        int j=0;
        
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();
        
        
        List<WebElement>products=driver.findElements(By.cssSelector("div.product"));
        Thread.sleep(3000);
        
        for(int i=0; i<products.size(); i=i+1) 
        {
        	//formato to get the actual vegetable name
        	//Brocolli - 1 Kg
        	//Boroccli, 1 Kg
        	String[] name= products.get(i).getText().split("-");
        	String formattedName=name[0].trim();
        	 
        	 //covert array into array list as it supports contains method
        	//array uses less memory whereas arraylist used for complicated functions
        	//its easier to check the name i extracted is present in arraylist or not
        	List itemsNeededList=Arrays.asList(itemsNeeded);
                	
        	
        	if (itemsNeededList.contains(formattedName))
        	{ 
        		j=j+1;
        		//driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click(); (text base xpath not recommend)
        		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
        		//if (j==3); hard coded
        		if(j==itemsNeeded.length)
        		{
        		//break;
        		}
        	}
        }
        
        
       // driver.close();

	}

}
