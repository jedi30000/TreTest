import com.codeborne.selenide.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ChooseTicketPage;
import pages.MainPage;
import pages.SelectSeatInTrainPage;
import utility.BaseTest;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestTre extends BaseTest {
    @BeforeMethod
    public void start() {
        setUp("https://tre.ge/");

    }

    @Test
    public void testPurchase() throws InterruptedException {
        MainPage mainPage = new MainPage();
        ChooseTicketPage ticketPage = new ChooseTicketPage();
        SelectSeatInTrainPage selectSeat = new SelectSeatInTrainPage();

        mainPage.fromField.click();
        for (SelenideElement loc : mainPage.locations) {
            if (loc.getText().contains("თბილისი")) {
                loc.click();
                break;


            }

        }
        mainPage.toField.click();
        for (SelenideElement loc : mainPage.destination) {
            if (loc.getText().contains("ბათუმი")) {
                loc.click();
                break;


            }

        }
        mainPage.departureField.click();
        while (mainPage.departureHeader.getText().contains("August")==false||mainPage.departureHeader.getText().contains("აგვისტო")==false||mainPage.departureHeader.getText().contains("август ")==false) {
         mainPage.switchMonthsButton.click();
         if(mainPage.departureHeader.getText().contains("August")||mainPage.departureHeader.getText().contains("აგვისტო")||mainPage.departureHeader.getText().contains("август ")) {
             mainPage.dateForDeparture.click();
             break;

         }

        }
        mainPage.addReturnField.click();
       mainPage.dateForReturn.click();
       mainPage.searchButton.click();
       ticketPage.firstOutboundFirstOption.click();
       ticketPage.firstReturnOutboundFirstOption.click();
       ticketPage.submitTicketButton.click();

       Thread.sleep(3333);
//      selectSeat.seatsOne.click();
       // SelenideElement svgContainer=$(By.xpath("//*[@id=\"svg-map-container\"]"));
        ElementsCollection vagonebi = $$(By.xpath("//*[contains(@id, 'vagoni')]"));

        System.out.println(vagonebi.size());

        if (vagonebi.size() > 2 && vagonebi.get(2).isDisplayed()) {
            SelenideElement vagon = vagonebi.get(2);
            ElementsCollection paths = vagon.findAll(By.tagName("path"));

            for (SelenideElement path : paths) {
                if (path.isDisplayed() && path.isEnabled()) {
                    path.scrollIntoView(true).click();
                    selectSeat.chooseReturnButton.click();

                }
            }
        }

       Thread.sleep(4000);


       //selectSeat.selectReturnTicket.click();
       //selectSeat.chooseButton.click();









        Thread.sleep(8444);
    }
    @AfterMethod
    public void cleanUp(){
        tearDown();
    }
}