import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class Testcodehomework {

    @Test
    public void Testcode2() {
        // Test 2
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.darksky.net/");

        By compTemp = By.xpath("//span[@class='feels-like-text']");
        WebElement feelslikeTemp = driver.findElement(compTemp);
        String textTemp = feelslikeTemp.getText();
        int textTp = Integer.valueOf(textTemp.split("˚")[0]);
        System.out.println(textTp);

        By lowTemp = By.xpath("//span[@class='low-temp-text']");
        WebElement lowtp = driver.findElement(lowTemp);
        String lowT = lowtp.getText();
        int textTp1 = Integer.valueOf(lowT.split("˚")[0]);
        System.out.println(textTp1);

        By highTemp = By.xpath("//span[@class='high-temp-text']");
        WebElement highTemp1 = driver.findElement(highTemp);
        String highT = highTemp1.getText();
        int textTp2 = Integer.valueOf(highT.split("˚")[0]);
        System.out.println(textTp2);

        if (textTp > textTp1 && textTp < textTp2) {
            System.out.println("Current temp is higher than low temp and is less than high temp");
        } else {
            System.out.println("Current temp is not higher than low temp and is not less than high temp");
        }
    }

    @Test
    public void Testcode1() {
        int result1 = fact(3);
        System.out.println("Factorial is " + result1);
    }

    @Test
    public void Testcode3 (){
        String []arr1 = {"happY", "king", "peace", "living standard"};
        String []arr2 ={"king kong", "Happy", "PEACE"};
        System.out.println(commString(arr1, arr2));
    }


    // My methods:
    // Test 1 (Factorial)
    public int fact(int input) {
        int reSult = 1;
        for (int i = 2; i <= input; i++) {

            reSult = reSult * i;
        }
        return reSult;
    }

    // Test 3
    public static HashSet<String> commString(String[] val1, String[] val2) {
        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < val1.length; i++) {
            for (int j = 0; j < val2.length; j++) {
                if (val1[i].equalsIgnoreCase(val2[j])) {
                    set.add(val1[i]);
                }
            }
        }
        return set;


    }


    }