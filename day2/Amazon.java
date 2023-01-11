package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles",Keys.ENTER);
		//driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> mobileprices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		List<Integer> values=new ArrayList<Integer>();
		Set<Integer> setvalue=new HashSet<Integer>();
		for (WebElement eachmobile : mobileprices) {
			
			String text = eachmobile.getText();
			String replaceall=text.replaceAll(",", "");
			if (!replaceall.isEmpty())
			{
			
				int  parseint=Integer.parseInt(replaceall);
			 values.add(parseint);
			boolean add = setvalue.add(parseint);
			
			if(!add)
				
			{
				System.out.println(parseint);
			}
			
			}		
		}
		
		Collections.sort(values);
		
		System.out.println(values);
		System.out.println(setvalue);
		System.out.println("The least values:"+ values.get(0));
		
		if(values.size()!=setvalue.size())
			
		{
			System.out.println("Prices have duplicates");
		}
		
		
		// TODO Auto-generated method stub

	}

}
