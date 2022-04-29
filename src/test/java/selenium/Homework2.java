package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework2 {

    @Test
    public void myctestcase() {
        // Test case 1

        // 1. I will open the browser first
        // 2. Then I will launch Facebook page
        // 3. Go to messenger
        // 4. Verify text on login email
        // 5. Go to messenger web
        // 7. Enter the login button
        // 6. Verify if the email or phone number and button is enabled

        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.messenger.com/");
        By myName = By.className("uiInputLabelInput");
        WebElement bigname = driver.findElement(myName);
        boolean isSelected = bigname.isSelected();
        Assert.assertFalse(isSelected,"It is selected");

        By mylogin = By.name("login");
        WebElement findlogin = driver.findElement(mylogin);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.id("close")).click();
        findlogin.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        By mytext = By.xpath("//button[@name='login']");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement findEl = driver.findElement(mytext);
        boolean isDisplaced = findEl.isDisplayed();
        Assert.assertTrue(isDisplaced, "Is not displayed");

        By isenabled = By.name("login");
        WebElement enbaledButton = driver.findElement(isenabled);
        boolean enabledTrue = enbaledButton.isDisplayed();
        Assert.assertTrue(enabledTrue, "Is not enabled");

    }

    @Test
    public void myTestcase2() {
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        By uniqueText = By.linkText("Create new account");
        WebElement findElement = driver.findElement(uniqueText);
        boolean isDisplayed = findElement.isDisplayed();
        Assert.assertTrue(isDisplayed, "Is not enabled");

        By linktext = By.linkText("Create new account");
        WebElement findCreButtn = driver.findElement(linktext);
        findCreButtn.sendKeys("Find the button");
        findCreButtn.click();

        By firstName = By.xpath("//input[@placeholder='First name']");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement textName = driver.findElement(firstName);
        textName.sendKeys("Masrur");

        By lastName = By.xpath("//input[@name='lastname'] ");
        WebElement enterLastName = driver.findElement(lastName);
        enterLastName.sendKeys("Karimov");

        By enterEmail = By.xpath("//input[@aria-label='Mobile number or email']");
        WebElement enterEmailMobile = driver.findElement(enterEmail);
        enterEmailMobile.sendKeys("technosoft@gmail.com");

        By reenterEmail = By.xpath("//input[@aria-label='Re-enter email']");
        WebElement reenterEmailMobile = driver.findElement(reenterEmail);
        reenterEmailMobile.sendKeys("technosoft@gmail.com");

        By enterpass = By.xpath("//input[@aria-label='New password']");
        WebElement entnewPass = driver.findElement(enterpass);
        entnewPass.sendKeys("technosoft");

        By verGender = By.xpath("//button[@name='websubmit']");
        WebElement findgenderbutton = driver.findElement(verGender);
        findgenderbutton.click();

       By verDisplay = By.xpath("//div[text()='Please choose a gender. You can change who can see this later.']");
       WebElement genderDisplayed = driver.findElement(verDisplay);
       boolean genderIsdisplayed = genderDisplayed.isDisplayed();
       Assert.assertTrue(genderIsdisplayed, "Is not displayed");





    }




}