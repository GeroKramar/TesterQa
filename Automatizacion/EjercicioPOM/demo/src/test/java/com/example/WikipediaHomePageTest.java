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


import io.github.bonigarcia.wdm.WebDriverManager;

public class WikipediaHomePageTest {
    
    @Test
    public void navigateToWikipediaHomePage(){
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    WikipediaHomePage homePage = new WikipediaHomePage(driver); 
    homePage.navigateTo(); 
    assertEquals("Wikipedia", driver.getTitle());
    WikipediaHomePage wikihome = new WikipediaHomePage(driver);
    
    wikihome.escribirBucador("Buenos Aires");
    WikipediaBsAs wb = new WikipediaBsAs(driver);
    wb.seleccionarGeo();
    assertTrue(wb.getImagen().isDisplayed());
    driver.quit();

}
@Test
public void testBotonPopUp(){
  // Iniciar el navegador
  WebDriverManager.chromedriver().setup();
  WebDriver driver = new ChromeDriver();
        
   // Navegar a la página
   driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
        
   // Cambiar al iframe que contiene el botón
   driver.switchTo().frame("iframeResult");
        
   // Hacer clic en el botón para activar la alerta
   driver.findElement(By.xpath("/html/body/button")).click();
        
   // Cambiar a la alerta
   Alert alert = driver.switchTo().alert();
        
   // Aceptar la alerta
   alert.accept();
        
   // Cerrar el navegador
   driver.quit();
            
}
@Test
public void testBotonAcptCancel(){
  // Iniciar el navegador
  WebDriverManager.chromedriver().setup();
  WebDriver driver = new ChromeDriver();
        
   // Navegar a la página
   driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
        
   // Cambiar al iframe que contiene el botón
   driver.switchTo().frame("iframeResult");
        
   // Hacer clic en el botón para activar la alerta
   driver.findElement(By.xpath("/html/body/button")).click();
        
   // Cambiar a la alerta
   Alert alert = driver.switchTo().alert();
        
   // Aceptar la alerta
   alert.accept();
   // Cencelar la alerta
   //alert.dismiss();
        
   // Cerrar el navegador
   driver.quit();
            
}
@Test
public void testBotonEnviar(){
  // Iniciar el navegador
  WebDriverManager.chromedriver().setup();
  WebDriver driver = new ChromeDriver();
     
   // Navegar a la página
   driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
        
   // Cambiar al iframe que contiene el botón
   driver.switchTo().frame("iframeResult");
        
   // Hacer clic en el botón para activar la alerta
   driver.findElement(By.xpath("/html/body/button")).click();
        
   // Cambiar a la alerta
   Alert alert = driver.switchTo().alert();
        
   // Enviar text a la alerta
   alert.sendKeys("Gero");
   
   // enviar alerta
   alert.accept();
        
   // Cerrar el navegador
   driver.quit();
            
}

@Test
void ejercicioIframe(){
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_default");

// Cambiar al iframe que contiene el editor
driver.switchTo().frame("iframeResult");

// Encontrar el elemento <h1> y cambiar su contenido
WebElement h1Element = driver.findElement(By.tagName("h1"));
((JavascriptExecutor) driver).executeScript("arguments[0].innerText = '¡JOSE!'", h1Element);

// (Opcional) Cambiar de nuevo al contenido principal fuera del iframe
driver.switchTo().defaultContent();

driver.quit();
}
@Test
void ejercicioIframe2(){
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");

// Cambiar al iframe que contiene el editor
driver.switchTo().frame("howto_iframe");

// Encontrar el elemento <h1> y cambiar su contenido
WebElement pElement = driver.findElement(By.tagName("p"));
((JavascriptExecutor) driver).executeScript("arguments[0].innerText = '¡JOSE!'", pElement);

// (Opcional) Cambiar de nuevo al contenido principal fuera del iframe
driver.switchTo().defaultContent();

driver.quit();
}
@Test
void dropdownGuia(){
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
driver.switchTo().frame("iframeResult");
Select dropdown = new Select(driver.findElement(By.tagName("select")));
dropdown.selectByVisibleText("Opel");
String selectedOption = dropdown.getFirstSelectedOption().getText();
assert selectedOption.equals("Opel");
//driver.findElement(By.xpath("/html/body/form/input")).click();
driver.quit();
}
@Test
void dropdownej1(){
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://getbootstrap.com/docs/4.3/components/dropdowns/#single-button");
WebElement dropdown = driver.findElement(By.id("dropdownMenuButton"));
dropdown.click();
WebElement optionToSelect = driver.findElement(By.linkText("Action"));
optionToSelect.click();
driver.quit();
}

@Test
void dropdownej2(){
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_option");
driver.switchTo().frame("iframeResult");
Select dropdown = new Select(driver.findElement(By.tagName("select")));
dropdown.selectByVisibleText("Volvo");
String selectedOption = dropdown.getFirstSelectedOption().getText();
assert selectedOption.equals("Volvo");
driver.quit();
}
@Test
void IntegradorEj1(){
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
driver.switchTo().frame("iframeResult");
driver.findElement(By.xpath("/html/body/button")).click();
Alert alert = driver.switchTo().alert();
alert.accept();
driver.navigate().to("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_option");
driver.switchTo().frame("iframeResult");
Select dropdown = new Select(driver.findElement(By.tagName("select")));
dropdown.selectByVisibleText("Volvo");
String selectedOption = dropdown.getFirstSelectedOption().getText();
assert selectedOption.equals("Audi");
driver.quit();
}

}




