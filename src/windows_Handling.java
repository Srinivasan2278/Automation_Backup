import java.util.Set;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows_Handling {
	public static void main(String [] args)
	{
	//commonMethods cm = new commonMethods();
	//WebDriver driver = cm.chromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\chrome driver latest\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Windows.html");
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector("div[id='Tabbed'] a button")).click();
	Set<String> windows1 = driver.getWindowHandles();
	Iterator<String> i = windows1.iterator();
	String parentWindow = i.next();
	while(i.hasNext())
	{
	driver.switchTo().window(i.next());

	}

	String title = driver.getTitle();
	System.out.println(title);
	driver.switchTo().window(parentWindow);
	String parentWindowTitle = driver.getTitle();
	System.out.println(parentWindowTitle);
	} 
}
