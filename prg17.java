
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class App17 {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","/Users/shreyasgs/Documents/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/upload/");
        WebElement pickElement=driver.findElement(By.id("uploadfile_0"));
        pickElement.sendKeys("/Users/shreyasgs/Desktop/untitled folder/theory of computation.pdf");
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.name("send")).click();

        Thread.sleep(3000);
        driver.quit();
    }
}
