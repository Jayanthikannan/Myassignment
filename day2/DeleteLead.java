package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
		driver.findElement(By.xpath("(//div[@class='x-tab-panel']//span[text()='Phone'])")).click();
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']"))
				.sendKeys("1");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		String attribute = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)")).getAttribute("value");
		System.out.println(attribute);
		String attribute1 = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)")).getText();
		System.out.println(attribute1);
		//int leadnum = Integer.parseInt(attribute1);
		//System.out.println(leadnum);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("//label[text()='Lead ID:']/following::input")).sendKeys(attribute1);
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(3000);
	String text = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
	
	if(text.equals("No records to display"))
	{
		System.out.println("Lead deleted successfully");
	}
	

	}

}
