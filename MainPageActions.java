package actions;

import com.codeborne.selenide.SelenideElement;
import pages.MainPage;

public class MainPageActions {
    MainPage page = new MainPage();
    public void fromFieldClick(){
        page.fromField.click();
    }
    public void selectTbilisi(){
        for (SelenideElement loc : page.locations) {
            if (loc.getText().contains("თბილისი")) {
                loc.click();
                break;


            }

        }

    }
    public void toFieldClick(){
        page.toField.click();
    }
    public void selectBatumi(){
        for (SelenideElement loc : page.destination) {
            if (loc.getText().contains("ბათუმი")) {
                loc.click();
                break;


            }

        }
    }
    public void departureFieldClick(){
       page.departureField.click();
    }
    public void chooseDesiredDate (){
        while (page.departureHeader.getText().contains("August")==false||page.departureHeader.getText().contains("აგვისტო")==false||page.departureHeader.getText().contains("август ")==false) {
            page.switchMonthsButton.click();
            if(page.departureHeader.getText().contains("August")||page.departureHeader.getText().contains("აგვისტო")||page.departureHeader.getText().contains("август ")) {
                page.dateForDeparture.click();
                break;

            }

        }
    }
    public void  clickReturnField(){
        page.addReturnField.click();
    }
    public void selectReturnDate(){
        page.dateForReturn.click();
    }
    public void clickSearchButton(){
        page.searchButton.click();
    }



}
