package week4.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.collect.Ordering;

public class snadeal {
	 static ChromeDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		
		WebElement menswear = driver.findElement(By.xpath("//span[@class='catText']"));
		action.moveToElement(menswear).perform();
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		String text = driver.findElement(By.xpath("//div[@class='sub-cat-count ']")).getText();
		int sportsshoe = Integer.parseInt(text);
		System.out.println("The number of sports shoe"+ sportsshoe);
		//click on the filter and select low to high proce
		driver.findElement(By.xpath("//i[contains(@class,'sd-icon sd-icon-expand-arrow')]")).click();
		driver.findElement(By.xpath("//li[@class='search-li']")).click();
		//list of the elements dislayed
		
		
		driver.findElement(By.name("fromVal")).clear();
		driver.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("900");
		driver.findElement(By.name("toVal")).clear();
		driver.findElement(By.name("toVal")).sendKeys("1200");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()[normalize-space()='GO']]")).click();
		FilterPricevalidation();
		Thread.sleep(3000);
				driver.findElement(By.xpath("//button[contains(@class,'view-more-button')]")).click();
				Thread.sleep(3000);		
		driver.findElement(By.xpath("//label[@for='Color_s-Navy']")).click();
		 List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='filters']"));
	for (WebElement id : findElements) {
		System.out.println(id.getText());
	}
			
		}
	
	private static void FilterPricevalidation() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		List<WebElement> shoeprice = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		
		List<Integer>shoeprice1=new ArrayList<Integer>();
		
		
		for (WebElement each : shoeprice) {
			String replaceAll = each.getText().replaceAll("[^0-9]", "");
			int parseInt = Integer.parseInt(replaceAll);
			shoeprice1.add(parseInt);
			
		}
		
		List<Integer>shoepricetemp=new ArrayList<Integer>(shoeprice1);
		
		Collections.sort(shoepricetemp);
		
		 if (shoepricetemp.equals(shoeprice1) == true) {
	            System.out.println(" price is sorted");
	        }
		
		System.out.println(shoeprice1);
		

	}
}
		
//		

	