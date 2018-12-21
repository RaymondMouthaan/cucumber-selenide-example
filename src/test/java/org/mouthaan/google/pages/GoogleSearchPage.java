package org.mouthaan.google.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class GoogleSearchPage {
    private SelenideElement searchField = $(By.name("q"));

    public void search(String phrase) {
        searchField.setValue(phrase);
        searchField.pressEnter();
    }
}
