package week4.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Testleafwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowslist=new ArrayList<String>(windowHandles);
		String Parentwindow=windowslist.get(0);
		String ChildWindow=windowslist.get(1);
		driver.switchTo().window(ChildWindow);
		String title = driver.getTitle();
		System.out.println("Child window"+title);
		driver.close();
		driver.switchTo().window(Parentwindow);
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		int size = windowHandles1.size();
		System.out.println("The number of opened window" +size);
		driver.quit();
		
		
		

	}

}
