package org.mouthaan.google.pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$$;

public class GoogleResultsPage {
    private ElementsCollection searchResults = $$("#ires .g");

    public void checkResults(String result) {
        searchResults.shouldHave(CollectionCondition.sizeGreaterThan(0));
        searchResults.forEach(res -> res.shouldHave(text(result)));
    }

    public void checkResult(int index, String result) {
        searchResults.get(index - 1).shouldHave(text(result));
    }
}
