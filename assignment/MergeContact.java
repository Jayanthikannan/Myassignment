package week4.assignment;

import java.util.ArrayList;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import week2.day2.LeadBasemethod;

public class MergeContact extends LeadBasemethod {
  @Test
  public void mergeleadcontact() throws InterruptedException {
	  
	  driver.findElement(By.linkText("Contacts")).click();
	  driver.findElement(By.linkText("Merge Contacts")).click();
	  driver.findElement(By.xpath("//input[@name='ComboBox_partyIdFrom']/following::img")).click();
	Set<String> windowHandles = driver.getWindowHandles();
	
	List<String> windowslist=new ArrayList<String>(windowHandles);
	String parent = windowslist.get(0);
	String child = windowslist.get(1);
	
	driver.switchTo().window(child);
	Thread.sleep(3000);
	  driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	  
	  driver.switchTo().window(parent);
	  
	  driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	 Set<String> windowHandles1 = driver.getWindowHandles();
		
	List<String> windowslist1=new ArrayList<String>(windowHandles1);
	String parent1 = windowslist1.get(0);
	String child1 = windowslist1.get(1);
		driver.switchTo().window(child1);
	  driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]")).click();
	  driver.switchTo().window(parent1);
	  driver.findElement(By.linkText("Merge")).click();
	  Alert alert = driver.switchTo().alert();
	  alert.accept();
	  
	  System.out.println(driver.getTitle());
	  
  }
}
