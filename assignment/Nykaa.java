package week4.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		Thread.sleep(3000);
		WebElement brands = driver.findElement(By.xpath("(//a[@class='css-1mavm7h'])[2]"));
			
		action.moveToElement(brands).perform();
		
		
	driver.findElement(By.xpath("//div[@id='scroller-container']//div/a[contains(text(),'Oreal Paris')]")).click();
		
	System.out.println(driver.getTitle());
	Thread.sleep(3000);
driver.findElement(By.className("sort-name")).click();
			
			//driver.findElement(By.xpath("//button[@class='top css-n0ptfk']//*[name()='svg']"));
	
	//action.click(sort).perform();
	
	driver.findElement(By.xpath("(//label[@for='radio_customer top rated_undefined']//div)[2]")).click();
	
	//driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
	
		//action.click(Lorel);
WebElement scroll = driver.findElement(By.xpath("//div[@class='filter-open css-1kwl9pj']/span[1]"));
action.scrollToElement(scroll).perform();

Thread.sleep(5000);
WebElement category = driver.findElement(By.xpath("//div[@class='filter-open css-1kwl9pj']/span[1]"));
action.click(category).perform();


	driver.findElement(By.xpath("//span[text()='Hair']")).click();
	driver.findElement(By.xpath("(//ul[@id='custom-scroll']//span)[3]")).click();
	driver.findElement(By.xpath("//label[@for='checkbox_Shampoo_316']")).click();
	driver.findElement(By.xpath("//div[@class='sidebar__inner']//div/div/span[text()='Concern']")).click();
	driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
	List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='css-rtde4j']/div"));
	for (WebElement webElement : findElements) {
		String text = webElement.getText();
		System.out.println(text);
	}
	
	driver.findElement(By.xpath("//div[@class='css-xrzmfa']")).click();
	Set<String> windowHandles = driver.getWindowHandles();
	List<String> wndowllist=new ArrayList<String>(windowHandles);
	
	//String parentwindow = wndowllist.get(0);
	String childwindow = wndowllist.get(1);
	driver.switchTo().window(childwindow);
	WebElement dropdown = driver.findElement(By.xpath("//select[@class='css-2t5nwu']"));
	Select select=new Select(dropdown);
	select.selectByVisibleText("175ml");
	String mrp = driver.findElement(By.xpath("//span[@class='css-1jczs19']")).getText();
	System.out.println("MRP of the product" + mrp);
	driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
	driver.findElement(By.className("cart-count")).click();
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='css-acpm4k']")));
	String grandtotal = driver.findElement(By.xpath("//span[@class='css-1um1mkq e171rb9k3']")).getText();
	System.out.println("The grandTotal" + grandtotal);
	driver.findElement(By.xpath("(//span[@class=' css-1l4d0ex e171rb9k3'])[1]")).click();
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[@class='css-175whwo ehes2bo0']//img[@alt='Image']")).click();
	String price = driver.findElement(By.xpath("//p[@class='css-cla92e eka6zu20']")).getText();
	if(price==grandtotal)
	{
		System.out.println("price validated successfully");
	}
	
	
	
	
	
	//(//div[@class=' css-b5p5ep'])[2]
	}

}
