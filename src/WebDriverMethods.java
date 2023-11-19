import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title = "Facebook – log in or sign up";
		if(driver.getTitle().equals(title))
		{
			System.out.println("Test Title is passed");
		}
		String url = driver.getCurrentUrl();
		//System.out.println(driver.getPageSource());
		System.out.println(url);
		//close vs quit
		//JavascriptExecutor je = (JavascriptExecutor)driver;
	//	je.executeScript("window.open()");
	//	driver.close(); //Current window will be closed
		//driver.quit(); // Will close the whole browser

	}

}

