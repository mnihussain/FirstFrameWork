package DisCoDenCer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Mithun {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\mdnas\\eclipse-workspace\\ProjectSelenium1\\driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        /*String url = "https://www.youtube.com";
        driver.get(url);*/
        driver.get("https://www.youtube.com");
        driver.findElement(By.name("search_query")).sendKeys("Bollywood", Keys.ENTER);
        driver.close();

    }
}
