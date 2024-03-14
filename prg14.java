
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import io.github.bonigarcia.wdm.WebDriverManager;
public class App14 {
    public static void main(String[] args) throws InterruptedException{
        //WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver","/Users/shreyasgs/Documents/chromedriver-mac-arm64/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
        driver.findElement(By.id("firstName")).sendKeys("abcd");
        driver.findElement(By.id("femalerb")).click();
        driver.findElement(By.id("englishchbx")).click();
        driver.findElement(By.id("hindichbx")).click();
        driver.findElement(By.id("registerbtn")).click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("Click here to navigate to the home page")).click();
        
        driver.manage().window().maximize();
        WebElement courseNameElement = driver.findElement(By.id("course"));
        Select courseName_dd = new Select(courseNameElement);
        courseName_dd.selectByIndex(1);
        Thread.sleep(3000);
        courseName_dd.selectByValue("net");
        Thread.sleep(3000);

        WebElement ideNameElement  = driver.findElement(By.id("ide"));
        Select ideName_dd = new Select(ideNameElement );

        ideName_dd.selectByIndex(0);
        Thread.sleep(3000);

        ideName_dd.selectByValue("ij");
        Thread.sleep(3000);

        ideName_dd.selectByVisibleText("NetBeans");

        ideName_dd.deselectByIndex(0);
        Thread.sleep(3000);

        ideName_dd.deselectByValue("ij");
        Thread.sleep(3000);

        ideName_dd.deselectByVisibleText("NetBeans");
        Thread.sleep(3000);

        List<WebElement> coursesAvailable = courseName_dd.getOptions();
        System.out.println("coursesAvailable::");
        for(WebElement webElement : coursesAvailable){
            System.out.println(webElement.getText());
        }
        System.out.println();

        List<WebElement> idesSelected = ideName_dd.getAllSelectedOptions();
        System.out.println("idesSelected::");
        for(WebElement webElement : idesSelected){
            System.out.println(webElement.getText());
        }
        System.out.println();
        System.out.println("SelecyedOptions::");
        System.out.println(courseName_dd.getFirstSelectedOption().getText());
        driver.quit();


    }   
}//Form Filling Automation
