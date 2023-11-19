import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*			Hit the flipkart url 
			Handle the alert pop-up 
			Type the keyword "Samsung LED TV"
			Samsung led tv click from the drop-down 
			Filter min to max   */


public class FLIPKART {

	public static void main(String[] args) {
		 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath( "//span[@role='button']")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/header/div[1]/div[2]/form/div/div/input")).sendKeys("Samsung LED TV" + Keys.ENTER);
		
		WebElement dropdown1= driver.findElement(By.xpath(" //div[@class='_1YAKP4']/select[@class='_2YxCDZ']"));
		Select select1 =  new Select(dropdown1);
		select1.selectByValue("15000");
		
		WebElement dropdown2= driver.findElement(By.xpath("//div[@class='_3uDYxP']/select[@class='_2YxCDZ']"));  // class-->subclass type
		Select select2 =  new Select(dropdown2);
		select2.selectByValue("50000"); 
	}

}
