+package ActionClassChildWindowIframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5Frame {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ITTraining\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		
		
		driver.findElement(By.linkText("Nested Frames")).click();
		//System.out.println(driver.findElements(By.tagName("frame")).size());
		
	    
		//driver.switchTo().frame("frame-top");
		driver.switchTo().frame
		//System.out.println(driver.findElements(By.tagName("frame")).size());
		driver.switchTo().frame("frame-middle");
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.cssSelector("div[id='content']")).getText());
		

	}

}
