package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class PurchasePage {

    WebDriver driver;

    public PurchasePage(WebDriver driver) {

        this.driver = driver;
    }

    public void enterPassengerDetails(

            String name,
            String address,
            String city,
            String state,
            String zip,
            String cardType,
            String cardNumber,
            String month,
            String year,
            String nameOnCard) {

        driver.findElement(By.name("inputName"))
        .sendKeys(name);

        driver.findElement(By.name("address"))
        .sendKeys(address);

        driver.findElement(By.name("city"))
        .sendKeys(city);

        driver.findElement(By.name("state"))
        .sendKeys(state);

        driver.findElement(By.name("zipCode"))
        .sendKeys(zip);

        Select card =
        new Select(driver.findElement(By.name("cardType")));

        card.selectByVisibleText(cardType);

        driver.findElement(By.name("creditCardNumber"))
        .sendKeys(cardNumber);

        driver.findElement(By.name("creditCardMonth"))
        .clear();

        driver.findElement(By.name("creditCardMonth"))
        .sendKeys(month);

        driver.findElement(By.name("creditCardYear"))
        .clear();

        driver.findElement(By.name("creditCardYear"))
        .sendKeys(year);

        driver.findElement(By.name("nameOnCard"))
        .sendKeys(nameOnCard);

        WebElement remember =
        driver.findElement(By.name("rememberMe"));

        if(!remember.isSelected()) {
            remember.click();
        }
    }

    public void clickPurchaseFlight() {

        driver.findElement(
        By.cssSelector("input[type='submit']"))
        .click();
    }
}