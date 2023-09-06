package com.egg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
private WebDriver driver;

public homepage(WebDriver driver, String url) {
    this.driver = driver;
    this.driver.get(url);
    PageFactory.initElements(driver, this);
}

@FindBy(id="APjFqb")
    private WebElement buscador;
@FindBy(tagName = "h3")
    private WebElement primerLink;

public void enviarTexto(String texto){
this.buscador.sendKeys(texto);
this.buscador.submit();
}
public void clicklink(){
this.primerLink.click();
}
public void esperar(int tiempo){
    this.driver.manage().timeouts().implicitlyWait(tiempo, TimeUnit.SECONDS);
}
}
