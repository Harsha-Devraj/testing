
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App19 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/shreyasgs/Documents/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        // WebDriverWait wait = new WebDriverWait(driver, 3);

        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        //
        driver.findElement(By.id("alertBox")).click();       
        Alert simpleAlert = driver.switchTo().alert();
        System.out.println(simpleAlert.getText());
        Thread.sleep(2000);
        simpleAlert.accept();
        Thread.sleep(2000);
       //
        driver.findElement(By.id("confirmBox")).click();
        Alert confirmAlert = driver.switchTo().alert();
        System.out.println(confirmAlert.getText());
        Thread.sleep(2000);
        confirmAlert.dismiss();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.id("output")).getText());
        //
        driver.findElement(By.id("promptBox")).click();
        Alert promptAlert = driver.switchTo().alert();
        System.out.println(promptAlert.getText());
        promptAlert.sendKeys("Piggy Naidu");
        Thread.sleep(2000);
        promptAlert.accept();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.id("output")).getText());

        driver.quit();
        
    }
}
