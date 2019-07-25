package FirstMavenProject1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ListenerTest {
    
    @Test
    public void screenShot()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\a241693\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://www.google.com");
        
        driver.findElement(By.id("abc")).sendKeys("text");        
        
    }

}
