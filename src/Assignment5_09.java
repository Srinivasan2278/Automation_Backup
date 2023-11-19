import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Assignment5_09 {

	public static void main(String[] args) throws InterruptedException  {
		commonMethods cm = new commonMethods();
		WebDriver driver = cm.chromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.tagName("input")).sendKeys("srinivasan");
		driver.findElement(By.cssSelector("input[placeholder=\"Last Name\"]")).sendKeys("ranjan");
		driver.findElement(By.cssSelector("input[ng-model=\"EmailAdress\"]")).sendKeys("2america12@gmail.com");
		driver.findElement(By.cssSelector("input[ng-model=\"Phone\"]")).sendKeys("123456789");
		
		// Handling radio button
		List<WebElement> radioOptions =  driver.findElements(By.xpath("//input[@type='radio']"));
		for(WebElement option : radioOptions)
		{
			System.out.println(option.getAttribute("value"));
			if(option.getAttribute("value").equalsIgnoreCase("Male"))
			{
				option.click();
			}	
		}
		
		
		// Handling checkbox
		WebElement Hobbies  = driver.findElement(By.xpath("//input[@value='Cricket']"));
		Hobbies.click();
		Thread.sleep(3000);
		WebElement Hobbies2= driver.findElement(By.xpath("//input[@value='Hockey']"));
		Hobbies2.click();
		Thread.sleep(3000);
 
   
		
		 
	}

}
