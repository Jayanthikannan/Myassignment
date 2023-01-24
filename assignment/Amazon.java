package week4.assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
		String text = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
System.out.println(text);
//WebElement rating = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]/preceding::span[@class='a-size-base s-underline-text']"));
//
//System.out.println(rating.getText());
driver.findElement(By.xpath("//span[@class='a-price-whole']")).click();
String parentwindow = driver.getWindowHandle();
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
Thread.sleep(5000);
driver.findElement(By.id("add-to-cart-button")).click();
Thread.sleep(5000);
String text3 = driver.findElement(By.xpath("(//div[@id='sw-subtotal']//span[2])[3]")).getText();



System.out.println(text3);
	}
}
