/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SeleniumTests/SeleneseIT.java to edit this template
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Agust y gero
 */
public class ejercicioDeRepaso {

    WebDriver driver;

    @Test
    public void testIdioma() {         
    WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://duckduckgo.com/");
            HomePage_duckduckGo testduck = new HomePage_duckduckGo(driver);
            testduck.abrirConfiguraciones(driver);
            testduck.seleccionarIdioma();
            testduck.comprobarIdioma();
            String idioma = "es_ES";
           
        }
    }




