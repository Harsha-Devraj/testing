//Prog 18
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class llelEx implements Runnable {
    
    WebDriver driver;
    Boolean type;
    Thread agent;

    llelEx(Boolean type) {
        this.type = type;
        agent = new Thread(this, "Agent for "+type+" case");
    }

    public void run() {
        driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        if(type) {
            driver.findElement(By.id("username")).sendKeys("student");
            driver.findElement(By.id("password")).sendKeys("Password123");
            driver.findElement(By.id("submit")).click();
        } else {
            driver.findElement(By.id("username")).sendKeys("random");
            driver.findElement(By.id("password")).sendKeys("rpass");
            driver.findElement(By.id("submit")).click();
        }
        try {
            System.out.println(driver.findElement(By.className("has-text-align-center")).getText());
        } catch(org.openqa.selenium.NoSuchElementException e) {
            System.out.println("username or password is wrong.");
        }
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {
        llelEx positive = new llelEx(true);
        llelEx negative = new llelEx(false);

        positive.agent.start();
        negative.agent.start();
        positive.agent.join();
        negative.agent.join();
        
    }
}
