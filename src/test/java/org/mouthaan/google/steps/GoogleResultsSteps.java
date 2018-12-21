package org.mouthaan.google.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.mouthaan.google.pages.GoogleResultsPage;

public class GoogleResultsSteps {
    private GoogleResultsPage googleResultsPage = new GoogleResultsPage();

    @Then("results for {string} are shown")
    public void resultsForAreShown(String result) {
        googleResultsPage.checkResults(result);
    }

    @And("the {int} (st|nd) result must be {string}")
    public void theStResultMustBe(int index, String result) {
        googleResultsPage.checkResult(index, result);
    }
}
