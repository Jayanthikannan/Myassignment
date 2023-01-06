package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jayanthi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kannan");
		WebElement dropdown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));

		Select select = new Select(dropdown);
		select.selectByIndex(3);
		WebElement dropdown1 = driver.findElement(By.id("createLeadForm_industryEnumId"));

		Select select1 = new Select(dropdown1);
		select1.selectByValue("IND_INSURANCE");

		WebElement dropdown2 = driver.findElement(By.id("createLeadForm_currencyUomId"));

		Select select2 = new Select(dropdown2);
		select2.selectByVisibleText("USD - American Dollar");

		driver.findElement(By.name("submitButton")).click();
		String title1 = driver.getTitle();
		System.out.println(title1);
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		
		if (text.equalsIgnoreCase("Jayanthi"))

		{
			System.out.println("Lead created successfully");
		}
		// driver.close();

		else {
			System.out.println("Lead not created successfully");
		}

	}
}
