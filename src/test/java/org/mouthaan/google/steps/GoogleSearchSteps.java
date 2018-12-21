package org.mouthaan.google.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.mouthaan.google.pages.GoogleSearchPage;

import static com.codeborne.selenide.Selenide.open;

public class GoogleSearchSteps {
    private GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Given("^a web browser is on the Google page$")
    public void aWebBrowserIsOnTheGooglePage() {
        open("https://google.com");
    }

    @When("the search phrase {string} is entered")
    public void theSearchPhraseIsEntered(String phrase) {
        googleSearchPage.search(phrase);
    }
}
