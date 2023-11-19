import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class pagenationExample {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		commonMethods cm = new commonMethods();
		WebDriver driver = cm.chromeDriver();
		driver.get("https://www.espncricinfo.com/cricket-news");
		driver.manage().window().maximize();
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("window.scroll(0,4100)");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
		driver.findElement(By.cssSelector("#wzrk-cancel")).click();
		String pageNumber = driver.findElement(By.cssSelector("div[class='ds-py-4'] div p")).getText();
		//Showing 1 - 20  of 145853
		String [] pageNo = pageNumber.split(" ");
		String pageNum = pageNo[5];
		System.out.println(pageNum);
		int count = Integer.parseInt(pageNum);
		System.out.println(count / 20);
		int i = 0;
		while(i < count/20)
		{
			driver.findElement(By.xpath("//div[@class='ds-py-4']/div/div/a[3]")).click();
			Thread.sleep(1000);
			je.executeScript("window.scroll(0,4100)");
		}

}
}
