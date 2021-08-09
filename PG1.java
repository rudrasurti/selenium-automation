import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PG1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/rudra/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://apps.shopify.com/custom-fields-2");

		// Click on the search text box
		driver.findElement(By.xpath("//button[.='Search']")).click();

		// Type value in search box
		Actions action = new Actions(driver);
		action.sendKeys("finances").sendKeys(Keys.ENTER).perform();

		// click on first search result
		driver.findElement(By.xpath("//div[@id='SearchResultsListings']//a")).click();

		driver.findElement(By.xpath("//a[.='Add app']")).click();
	}
}