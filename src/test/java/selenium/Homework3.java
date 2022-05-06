package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Homework3 {

  @Test
  public void testCase1(){
    //Steps for task 1
    // 1. Open the browser
    // 2. Find webelement F and C
    // 3. Click on F&C webelemebt
    // 4. Choose the appropriate Degree
    // 5. And verify if the correct temperature is displayed
    System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.darksky.net");


     driver.findElement(By.xpath("(//div[@class='options']/div)[1]")).click();
     List<WebElement> findElem = driver.findElements(By.xpath("//div[@class='selectric-scroll']//ul/li"));

    for (WebElement temp: findElem){
        if (temp.getText().contains("˚C, mph")){
            temp.click();
        }





    }


//˚F, mph
//˚C, m/s
//˚C, km/h
//˚C, mph

  }
    /**
     * TC-1:  darksky.net
     * Verify correct temperature value is displayed after changing temperature units
     */
  @Test
  public void testCase2(){
      // Steps for Test 2
      // 1. Open the browser
      // 2. I find Create account button
      // 3. Then I will click the create account button
      // 4. After, I find the Webelement "date"
      // 5. I verify that the date is displayed
      // 6. After I verify the current date
      // 7. After verifying i quit the browser

      System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.facebook.com");

      By findPath = By.xpath("//a[@rel='async']");
      WebElement creatBtton = driver.findElement(findPath);
      creatBtton.click();
      try {
          Thread.sleep(2000);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
      By monthLocator = By.xpath("//*[@id='month']//option[@selected='1']");
      String monthEl = driver.findElement(monthLocator).getText();
      System.out.println(monthEl);

      By dayLocator = By.xpath("//select[@aria-label='Day']//option[@selected='1']");
      String dayEl = driver.findElement(dayLocator).getText();
      System.out.println(dayEl);

      By yearLocator = By.xpath("//select[@aria-label='Year']//option[@selected='1']");
      String yearEl = driver.findElement(yearLocator).getText();
      System.out.println(yearEl);

      Date mydate = new Date();
      SimpleDateFormat date = new SimpleDateFormat("MMM, d, y" );
      String dd = (date.format(mydate));
      String newString = monthEl + ", "+ dayEl +", " + yearEl;
      System.out.println(newString);
      Assert.assertEquals(dd,newString);
      driver.quit();
  }
    @Test
    public void testCase3() {
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://classroomessentialsonline.com");

        By getLink = By.xpath("//a[@href='/church-chairs/']");
        WebElement findlink = driver.findElement(getLink);

        Actions takeAction = new Actions(driver);
        takeAction.moveToElement(findlink).perform();

        By findlink2 = By.xpath("//a[@href='/economy-church-chairs/']");
        WebElement clicklink = driver.findElement(findlink2);
        String myUrl = clicklink.getAttribute("href");
        System.out.println(myUrl);
        clicklink.click();
        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);

        Assert.assertTrue(myUrl.contains(currentURL), "It is false");
        driver.quit();

    }


}
