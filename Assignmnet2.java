package week3day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmnet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://dev110326.service-now.com/");
		
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("India@123");
		driver.findElement(By.id("sysverb_login")).click();
		driver.switchTo().defaultContent();
		driver.close();
	}

}
