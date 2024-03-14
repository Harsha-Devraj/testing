import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class prg_7_19 {
 
public static void main(String[] args) throws Exception {
 
System.setProperty("webdriver.chrome.driver", 
"C:\\Users\\saish\\OneDrive\\Desktop\\computer science\\javapro\\Software 
Testing\\demo\\src\\drivers\\chromedriver.exe");
 
WebDriver driver=new ChromeDriver();

driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
x
 
driver.findElement(By.id("promptBox")).click();
 
Alert promptAlert=driver.switchTo().alert();
 
System.out.println(promptAlert.getText());
 
promptAlert.sendKeys(" ");
 
promptAlert.accept();
 
System.out.println(driver.findElement(By.id("output")).getText());
 
Thread.sleep(2000);
}
}
