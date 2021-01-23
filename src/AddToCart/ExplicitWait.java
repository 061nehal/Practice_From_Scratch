package AddToCart;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ITTraining\\AllDriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebDriverWait w=new WebDriverWait(driver,5);
        
        String[] itemsNeeded= {"Cucumber", "Beetroot", "Brocolli", "Carrot", "Tomato"};
        
        
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();
        
        
        Thread.sleep(3000);
        addItems(driver,itemsNeeded); // this is called utility.
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click(); //static text
        
        w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input.promoCode")));
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();
        
        
        //explicit wait
        //WebDriverWait w=new WebDriverWait(driver,5);
        w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("span.promoInfo")));
        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
        
	}    
      



	public static void addItems(WebDriver driver, String[] itemsNeeded)
	{
		int j=0;
		List<WebElement>products=driver.findElements(By.cssSelector("div.product"));
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


