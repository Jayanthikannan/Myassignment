package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		// Launch URL "http://leaftaps.com/opentaps/control/login"

		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.xpath("//div[@class='fieldgroup']//input[@id='firstNameField']")).sendKeys("SAI");
		driver.findElement(By.xpath("//div[@class='fieldgroup']//input[@id='lastNameField']")).sendKeys("KANNAA");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Learning");
		driver.findElement(By.xpath("//textarea[@class='inputBox']")).sendKeys("create contact");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Jayanthikannann@gmail.com");
		WebElement statedropdown = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));

		Select select = new Select(statedropdown);
		select.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Updated contacts");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println(driver.getTitle());

		 driver.close();

	}

}
