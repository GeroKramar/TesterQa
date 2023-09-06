package com.egg;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Text1 {

    @Test
    public void testgoogle(){
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    homepage homepage = new homepage(driver,"https://www.google.com");
    driver.manage().window().maximize();
    homepage.enviarTexto("Wikipedia");
    homepage.clicklink();
    homepage.esperar(5);
     }
}
