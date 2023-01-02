package week2.Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		login log=new login();
		log.loginLeafTaps();
		log.loginSalesforce();

	}
	
	private void loginLeafTaps() {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
				String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		// TODO Auto-generated method stub

	}
	
	private void loginSalesforce() throws InterruptedException {
		
		EdgeDriver driver=new EdgeDriver();
				
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		driver.findElement(By.id("Login")).click();
		
		driver.wait(6000);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
		// TODO Auto-generated method stub

	}

}
