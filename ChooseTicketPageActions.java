package actions;

import pages.ChooseTicketPage;

public class ChooseTicketPageActions {
    ChooseTicketPage page = new ChooseTicketPage();
    public void  chooseFirstOptionOfFirstTicket(){
        page.firstOutboundFirstOption.click();
    }
    public void chooseReturnFirstOptionOfFirstTicket(){

       page.firstReturnOutboundFirstOption.click();
    }
     public void submitTicketButton(){
         page.submitTicketButton.click();
     }



}
