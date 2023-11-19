import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FLUENT_WAIT {

	public static void main(String[] args) {
		commonMethods cm = new commonMethods();
		WebDriver driver = cm.chromeDriver();
		driver.get("https://www.espncricinfo.com");
		driver.manage().window().maximize();
		FluentWait wait = new FluentWait(driver);
		By alert = By.cssSelector("button[id='wzrk-cancel']");
		wait.pollingEvery(Duration.ofSeconds(1000,3)).until(ExpectedConditions.elementToBeClickable(alert));
		driver.findElement(alert).click();


	}

}
