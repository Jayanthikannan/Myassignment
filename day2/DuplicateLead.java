package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
		driver.findElement(By.xpath("(//div[@class='x-tab-panel']//span[text()='Email'])")).click();
		driver.findElement(By.xpath("//label[text()='Email Address:']/following:: input[@name='emailAddress']"))
				.sendKeys("Rajini@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)")).click();
		String Leadname = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		String Title = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		if (Title.equalsIgnoreCase("Duplicate Lead")) {
			System.out.println("Title verified as " + Title);
		}
		driver.findElement(By.name("submitButton")).click();
		String Leadnameduplicateform = driver.findElement(By.id("viewLead_firstName_sp")).getText();

		if (Leadname.equals(Leadnameduplicateform))
			System.out.println("duplicated lead name is same as captured name");
		driver.close();

	}

}
