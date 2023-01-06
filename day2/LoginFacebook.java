package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("SAI");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("KANNAA");
		driver.findElement(
				By.xpath("//div[contains(text(),'Mobile number or email address')]/following-sibling::input"))
				.sendKeys("Jayanthi@gmail.com");
		
		
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("Jayanthi@gmail.com");
		
		driver.findElement(By.xpath("//div[contains(text(),'New password')]/following-sibling::input")).sendKeys("Selvam@1");
		WebElement dropdowndate = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		WebElement dropdownmonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		WebElement dropdownyear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select select=new Select(dropdowndate);
		select.selectByValue("5");
		Select select1=new Select(dropdownmonth);
		select1.selectByIndex(1);
				Select select2=new Select(dropdownyear);
				select2.selectByVisibleText("1988");
			driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input"))	.click();
			driver.findElement(By.xpath("//button[@name='websubmit']")).click();
			String title = driver.getTitle();
			System.out.println(title);
				driver.close();
		
		
		
		
				
		

	}

}
