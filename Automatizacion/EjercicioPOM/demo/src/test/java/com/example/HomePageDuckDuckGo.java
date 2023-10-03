package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePageDuckDuckGo{
 WebDriver driver;
 @FindBy(className = "header__button--menu")
 private WebElement menuDesplegable;
 @FindBy(css = "a[href=\"/settings\"]")
  private WebElement configuracion;
 @FindBy(id = "setting_kad")
    private Select desplegableIdioma;
 @FindBy(className = "badge-link__title")
    private WebElement h1;
    


 public HomePageDuckDuckGo(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
 public void abrirConfiguracion () {
   this.menuDesplegable.click();
   this.configuracion.click();
    }
public void cambiarIdioma (String idioma){
    this.desplegableIdioma.selectByValue(idioma);
}
public void comprobacionIdioma (){
    this.driver.navigate().to("https://duckduckgo.com/");
    assertEquals("\u00BFCansado de que te rastreen? Podemos ayudarte.", this.h1.getText());
   
}
}