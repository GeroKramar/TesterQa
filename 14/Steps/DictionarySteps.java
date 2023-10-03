package com.serenity.Steps;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import com.serenity.Page.DictionaryPage;

import net.serenitybdd.annotations.Step;

public class DictionarySteps {
    private DictionaryPage dictionaryPage;
    private WebDriver driver;

    @Step
    public void openBrowser() {
        dictionaryPage.open();
    }

    @Step
    public void buscarPalabra(String palabra) {
        dictionaryPage.buscarPalabra(palabra);
    }

    @Step
    public void clickGo() {
        dictionaryPage.clickGo();
    }

    @Step
    public void buscarSignificado(String palabra) {
        buscarPalabra(palabra);
        clickGo();
    }

    @Step
    public void verifyPageTitle(String expectedTitle) {
        String actualTitle = dictionaryPage.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }
}

