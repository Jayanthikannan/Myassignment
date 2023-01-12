package week3day4;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment1 {

	public static void main(String[] args)  {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://buythevalue.in/");
		
		driver.findElement(By.xpath("(//div[@class= 'searchbox'] //input[@placeholder='Search product'])[1]")).sendKeys("Hamdard Hing - 50GM");
		
		driver.findElement(By.xpath("//span//button[@type='submit']")).click();
		
		String parentwindow = driver.getWindowHandle();
		
	
		driver.findElement(By.partialLinkText("Hamdard Hing - 50GM")).click();
		
		Set<String> allwindows = driver.getWindowHandles();
		
			
		System.out.println("Total number of window" + allwindows.size() );
		
		if(allwindows.size()>1)
		{
		for (String child : allwindows) {
			
			if(!parentwindow.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
			}
			
		}
		}
		
driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='hubspot-messages-iframe-container']//iframe")));
		
		driver.findElement(By.xpath("//div[@class='initial-message-bubble']/button")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.name("wk_zipcode")).sendKeys("600116");
		
		WebElement m = driver.findElement(By.xpath("//input[@class='btn']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", m);
		
		String text = driver.findElement(By.xpath("//div[@class='wk_availability_msg']")).getText();
		
		System.out.println("The avilablility msg is " + text);
		
		//if(text.contains("is Available"))		
		{
			String attribute = driver.findElement(By.id("quantity")).getAttribute("value");
					
			int  quantity=Integer.parseInt(attribute);
			
			if(quantity==1)
				
			{
				WebElement findElement = driver.findElement(By.xpath("//button[@id='product-add-to-cart']//span"));
								js.executeScript("arguments[0].click();", findElement);
				
			}
			
			
		}
		
		driver.findElement(By.xpath("(//p[@class='success-message show-cart']//a)[2]")).click();
		
		WebElement findElement1 = driver.findElement(By.id("checkout"));
		
		js.executeScript("arguments[0].click();", findElement1);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("agree")).click();
		
//		else
//		{
//			System.out.println("Delivery add available pls try other pincode");
//			
//		}
//		
		
		
		
		
//		driver.close();
		
//		 List<WebElement> findElements = driver.findElements(By.xpath("//a[@class='product-title']"));
//		 String r
		

	}

}
