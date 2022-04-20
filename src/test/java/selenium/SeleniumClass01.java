package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumClass01 {

    @Test
    public void myctestcase () {

        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

    }

    }







