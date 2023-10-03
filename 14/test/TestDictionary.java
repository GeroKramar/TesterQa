package com.serenity.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.serenity.Steps.DictionarySteps;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit.runners.SerenityRunner;

@RunWith(SerenityRunner.class)
public class TestDictionary {
    @Managed
    WebDriver webdriver;
    @Steps
    DictionarySteps stepsDictionary;

    @Test
    public void testBuscarSignificado(){
        stepsDictionary.openBrowser();
        stepsDictionary.buscarSignificado("serenity");
        stepsDictionary.verifyPageTitle("Serenity - Wikipedia, la enciclopedia libre");

    }
}
