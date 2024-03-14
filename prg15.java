// Prog 15
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prog {

    static void testBrowser(String user, String pass) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");

        driver.findElement(By.id("username")).sendKeys(user);
        driver.findElement(By.id("password")).sendKeys(pass);
        driver.findElement(By.id("submit")).click();
        Thread.sleep(2000);
        try {
            System.out.println(driver.findElement(By.className("has-text-align-center")).getText());
        } catch(org.openqa.selenium.NoSuchElementException e) {
            System.out.println(user+" or "+pass+" is wrong. ");
        }
        driver.quit();
    }
        
    public static void main(String[] args) throws IOException, InterruptedException {
        String fileName = "src/dataDriven.csv";
        BufferedReader buff = new BufferedReader(new FileReader(fileName));
            
        String record, user, pass;
        while ((record = buff.readLine()) != null) {
            user = record.split(",")[0];
            pass = record.split(",")[1];
            testBrowser(user, pass);
            Thread.sleep(2000);
        }
        buff.close();
    }
}
