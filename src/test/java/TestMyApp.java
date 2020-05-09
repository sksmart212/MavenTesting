import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMyApp {
    @Test
    public void main()

    {
        // System.out.println("Testing Completed");
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.navigate().to("http://localhost:9090/KPS/");
    }

}
