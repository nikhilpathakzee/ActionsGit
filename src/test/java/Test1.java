import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1
{
    public WebDriver driver;
    public String baseUrl = "https://www.zee5.com/";
    public String baseUrl2 = "https://www.google.com/";

    @Test
    public void test1() {
//bgoiahgoihaoigoialbbao1234

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");
        System.out.println("Test is running");
        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
        System.out.println("Went to ZEE5");
        driver.close();
        System.out.println("Browser got closed");
    }

    @Test
    public void test2() {
//bgoiahgoihaoigoialbbao1234

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");
        System.out.println("Test is running in test2 method");
        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl2);
        System.out.println("Went to Google in test2 method");
        driver.close();
        System.out.println("Browser got closed in test2 method");
    }
}