import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class prg12 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/shreyasgs/Documents/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        // WebDriverWait wait = new WebDriverWait(driver, 3);

        driver.get("https://app.uizard.io/login");

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("");
        WebElement pass=driver.findElement(By.name("password"));
        pass.sendKeys("");
        WebElement buttoElement=driver.findElement(By.cssSelector("button"));
        buttoElement.click();

        // Wait for the search results to be visible
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("video-title")));

       

        // Wait for some time to allow the video page to load
        Thread.sleep(10000);

        // Close the browser window
        driver.quit();
    }
}
