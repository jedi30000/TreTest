import actions.ChooseTicketPageActions;
import actions.MainPageActions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utility.BaseTest;



public class TestRun extends BaseTest {
    MainPageActions mainPageActions = new MainPageActions();
    ChooseTicketPageActions chooseTicketPageActions = new ChooseTicketPageActions();

    @BeforeMethod
    public void start(){
        setUp("https://tre.ge/ka");


    }
    @Test
    public void testPurchaseProcess() throws InterruptedException {
        mainPageActions.fromFieldClick();
        mainPageActions.selectTbilisi();

        mainPageActions.toFieldClick();
        mainPageActions.selectBatumi();

        mainPageActions.departureFieldClick();
        mainPageActions.chooseDesiredDate();

        mainPageActions.clickReturnField();
        mainPageActions.selectReturnDate();

        mainPageActions.clickSearchButton();

        chooseTicketPageActions.chooseFirstOptionOfFirstTicket();
        chooseTicketPageActions.chooseReturnFirstOptionOfFirstTicket();

        chooseTicketPageActions.submitTicketButton();
        Thread.sleep(4444);




    }

}
