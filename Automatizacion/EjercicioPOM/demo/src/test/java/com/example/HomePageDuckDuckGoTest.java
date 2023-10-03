package com.example;

import org.openqa.selenium.Alert;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;


public class HomePageDuckDuckGoTest {
    WebDriver driver;
   
   
  @Test
  public void testIdioma (){
    WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://duckduckgo.com/");
        HomePageDuckDuckGo testduck = new HomePageDuckDuckGo(driver);
        testduck.abrirConfiguracion();
        String idioma = "es_ES";
        testduck.cambiarIdioma(idioma);
        testduck.comprobacionIdioma();
    }
}
