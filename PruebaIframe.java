package egg.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PruebaIframe {
    public static void main(String[] args) {
        // Iniciar el navegador
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();  

        // Navegar a la página
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");

        WebDriverWait wait = new WebDriverWait(driver, 10);

        // Cambiar al iframe que contiene el botón
        driver.switchTo().frame("iframeResult");

        // Esperar a que el botón esté presente y sea clickeable
        By botonLocator = By.xpath("/html/body/button");
        wait.until(ExpectedConditions.presenceOfElementLocated(botonLocator));
        wait.until(ExpectedConditions.elementToBeClickable(botonLocator));

        // Cambiar a la alerta
        Alert alert = driver.switchTo().alert();

        // Aceptar la alerta
        alert.accept(); //  alert.dismiss(); cancela la alerta

        // Cerrar el navegador
        driver.quit();
    }
}

    

