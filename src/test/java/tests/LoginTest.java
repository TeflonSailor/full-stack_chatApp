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

        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless=new");

        WebDriver driver = new EdgeDriver(options);

        driver.get("http://localhost:5173");

        System.out.println("Title: " + driver.getTitle());

        driver.quit();
    }
}