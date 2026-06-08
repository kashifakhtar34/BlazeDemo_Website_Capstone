package pages;

import java.util.List;

import org.openqa.selenium.*;

public class ReservePage {

    WebDriver driver;

    public ReservePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean verifyFlightsDisplayed() {

        List<WebElement> rows =
        driver.findElements(
        By.xpath("//table/tbody/tr"));

        return rows.size()>0;
    }

    public void chooseFlight() {

        driver.findElement(
        By.xpath("(//input[@value='Choose This Flight'])[1]"))
        .click();
    }
}