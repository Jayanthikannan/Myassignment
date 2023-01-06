package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//label [text()='Lead ID:']/following::input[@name='firstName']"))
				.sendKeys("Jayanthi");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id(("updateLeadForm_companyName"))).clear();
		driver.findElement(By.id(("updateLeadForm_companyName"))).sendKeys("Jayanthi update");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String updatedtext = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		String replaceAll = updatedtext.replaceAll("[\\d()]","");
		System.out.println(replaceAll);
		
		//String Pattern="\\D()+";
		//Pattern.c
		
		
		if (replaceAll.trim().equalsIgnoreCase("Jayanthi update")) {
			System.out.println("Name updated successfully");
		} else {
			System.out.println("Name not  updated ");
		}

		driver.close();

	}
	
	

}
