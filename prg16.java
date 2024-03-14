
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class App16{
    public static void main(String[] args) throws InterruptedException{
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ankitha A Kantli\\Desktop\\aecc\\testing\\src\\drivers\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.get("https://store.steampowered.com/news/");
       new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(new By.ByXPath("//div[starts-with(@class, 'eventcalendar_FilterSettings')]//div[contains(., 'Options and Filters')]"))).click();
       Thread.sleep(4000);
       driver.quit();
    }
}
