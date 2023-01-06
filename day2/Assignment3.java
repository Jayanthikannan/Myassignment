package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//label[contains(text(),'Email')]/following-sibling::input")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.xpath("//label[contains(text(),'Email')]/following:: input[@id='password']")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//label[contains(text(),'Email')]/following:: button[@type='submit']")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Log Out")).click();
		driver.close();
		
		
		
		
		
		


	}

}
