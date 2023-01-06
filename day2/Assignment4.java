package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml#");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(" //h5[text()='Type your name']/following::input")).sendKeys("JAYANTHI");
        boolean enabled = driver.findElement(By.xpath(" //h5[text()='Verify if text box is disabled']/following::input")).isEnabled();
        if(enabled==true)
        {
        System.out.println("text box is enabled");
        }
        else
        {
        	System.out.println("text box is disabled");
        }
        
        String text = driver.findElement(By.xpath("//h5[contains(text(),'Clear the typed text')]/following::input")).getAttribute("value");
        System.out.println(text);
        driver.findElement(By.xpath("//h5[contains(text(),'Clear the typed text')]/following::input")).clear();
        String text1 = driver.findElement(By.xpath("//h5[contains(text(),'Clear the typed text')]/following::input")).getAttribute("value");
        System.out.println(text1);
         driver.findElement(By.xpath("//h5[contains(text(),'Retrieve the typed text')]/following::input")).sendKeys("JAI");
         String text2 = driver.findElement(By.xpath("//h5[contains(text(),'Retrieve the typed text')]/following::input")).getAttribute("value");
         System.out.println(text2);
         driver.findElement(By.xpath("//h5[contains(text(),'Type email and Tab. Confirm control moved to next element.')]/following::input")).sendKeys("jayanthikannann@gmail.com",Keys.TAB);
      
        
        
               
         
         
         //driver.close();
        
	}

}
