package com.serenity.Page;



import java.util.List;

import org.openqa.selenium.By;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

@DefaultUrl("https://www.wikipedia.com/")
public class DictionaryPage extends PageObject {
    @FindBy(name="search")
    WebElementFacade search;
    @FindBy(css="button[type='submit']")
    WebElementFacade go;
    public void buscarPalabra(String palabra){
        search.type(palabra);
    }
    public void clickGo(){
        go.click();
    }
    public List<String> getDefinitions(){
        WebElementFacade definitionList = find(By.tagName("ol"));
        return definitionList.findElements(By.tagName("li")).stream().map(element -> element.getText()).collect(Collectors.toList());
    }
}
