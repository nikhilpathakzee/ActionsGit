import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Test2 {
    public WebDriver driver;
    public String baseUrl = "https://www.zee5.com/";

    @Test
    public void simpleTest(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");
        System.out.println("Test is running in Test2 class");
        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
        System.out.println("Went to ZEE5 in Test2 class");
        driver.close();
        System.out.println("Browser got closed in Test2 class");
    }
}
