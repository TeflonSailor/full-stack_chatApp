package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void openChatApp() {

        System.setProperty("webdriver.edge.driver",
                "C:\\WebDriver\\msedgedriver.exe");

        EdgeOptions options = new EdgeOptions();

        options.addArguments("--headless=new");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new EdgeDriver(options);

        driver.get("http://localhost:5173");

        System.out.println("Page title is: " + driver.getTitle());

        driver.quit();
    }
}