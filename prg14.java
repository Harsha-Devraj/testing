import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;
public class prog14 {
    public static void main(String[] args) throws InterruptedException{
        //WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
        driver.findElement(By.id("firstName")).sendKeys("Nagaraju");
        
        Thread.sleep(2000);
        driver.findElement(By.id("malerb")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("englishchbx")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("hindichbx")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("registerbtn")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Click here to navigate to the home page")).click();
        Thread.sleep(2000);
        driver.quit();


    }   
}
