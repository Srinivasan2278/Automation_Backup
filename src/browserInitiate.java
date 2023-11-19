/*import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserInitiate{
 public static WebDriver driver;
	public static void main(String[] args) throws MalformedURLException {
	
		
		browserInitiate bi = new browserInitiate () ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Browser name to Test");
		String browserName = sc.next();
		if(browserName.equalsIgnoreCase("chrome"));

		{
			 driver = bi.chromeBrowser();
			 driver.get("");
		}}
		
		public WebDriver chromeBrowser()
		{
			driver = new ChromeDriver();
			return driver;
			
		}
			

		public WebDriver edgeBrowser()
		{
			driver = new EdgeDriver();
			return driver;
			
		}
		public WebDriver firefoxBrowser()
		{
			driver = new FirefoxDriver();
			return driver;
			
		}
}*/
