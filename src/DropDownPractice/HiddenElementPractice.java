package DropDownPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElementPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nehal\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("file:///D:/ITTraining/OurWebSite.html");
        driver.manage().window().maximize();
        
      /* List<WebElement>firstname=driver.findElements(By.id("FN"));
       System.out.println("Total Element is  "+firstname.size());
       
       for (int i=0; i<firstname.size(); i=i+1) {
    	   WebElement ele=firstname.get(i);
    	   int X1=ele.getLocation().getX();
    	   System.out.println("Point "+ X1);
    	   if (X1!=0) {
    		   ele.sendKeys("Anik");
    	   }
       }*/
       
       List<WebElement>male=driver.findElements(By.id("ml"));
       System.out.println("Total Elements are  "+male.size());
       
       for (int i=0; i<male.size(); i=i+1) {
    	   WebElement ele=male.get(i);
    	   int X2=ele.getLocation().getX();
    	   System.out.println("Point "+X2);
    	   if(X2!=0) {
    		   ele.click();
    	   }
       }
       
       
       
       
        
        
        Thread.sleep(2000);
        driver.close();
        
	}

}
