package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.*;
import utils.ExcelUtils;

public class FlightBookingTest extends BaseTest {

    @DataProvider(name="bookingData")
    public Object[][] getData() {

        return ExcelUtils.getExcelData();
    }

    @Test(dataProvider="bookingData")
    public void bookFlight(

            String fromPort,
            String toPort,
            String name,
            String address,
            String city,
            String state,
            String zipCode,
            String cardType,
            String cardNumber,
            String month,
            String year,
            String nameOnCard) {

        HomePage home =
        new HomePage(driver);

        home.selectDepartureCity(fromPort);
        home.selectDestinationCity(toPort);
        home.clickFindFlights();

        ReservePage reserve =
        new ReservePage(driver);

        Assert.assertTrue(
        reserve.verifyFlightsDisplayed());

        reserve.chooseFlight();

        PurchasePage purchase =
        new PurchasePage(driver);

        purchase.enterPassengerDetails(
                name,
                address,
                city,
                state,
                zipCode,
                cardType,
                cardNumber,
                month,
                year,
                nameOnCard);

        purchase.clickPurchaseFlight();

        ConfirmationPage confirm =
        new ConfirmationPage(driver);

        Assert.assertEquals(
        confirm.getConfirmationMessage(),
        "Thank you for your purchase today!");
    }
}