package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SelectSeatInTrainPage {
    public ElementsCollection allSeats = $$(By.xpath("//*[contains(@id, 'Vector')]"));

    public SelenideElement seatsOne = $(By.xpath("//*[@id=\"Vector_1770\"]")),
    chooseReturnButton =$(By.xpath("//p[contains(text(),'დაბრუნების არჩევა')]")),

    selectReturnTicket =$(By.xpath("//*[@id=\"Vector_1812\"]")),
    chooseButton =$(By.xpath("//p[contains(text(),'გაგრძელება')]"));















}
