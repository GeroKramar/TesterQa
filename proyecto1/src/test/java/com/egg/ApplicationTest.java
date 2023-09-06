package com.egg;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

class ApplicationTest {
private WebDriver driver;
    @Test
    void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    void driverManagerChrome() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
        driver.findElement(By.id("APjFqb")).sendKeys("wikipedia", Keys.ENTER);
        driver.findElement(By.tagName("h3")).click();
       // driver.close();
    }
   
    @Test
    void driverManagerChrome2() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.bbc.com/future");
        WebDriverWait wait = new WebDriverWait(driver, 5);

        WebElement imagen = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[title=\"Russia's Luna-25 takes off from Vostochny cosmodrome (Credit: Reuters)\"]")));
        imagen.click();
        driver.quit();
    }
    @Test
    void driverManagerChrom3() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.wikipedia.com/");
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
        .withTimeout(Duration.ofSeconds(10)) // Tiempo máximo de espera
        .pollingEvery(Duration.ofMillis(500)) // Frecuencia de verificación
        .ignoring(NoSuchElementException.class); // Ignorar esta excepción durante la espera 
        WebElement buscador = wait.until((Function<WebDriver, WebElement>) driver1->{
        WebElement element = driver1.findElement(By.id("searchInput"));
        element.sendKeys("Buenos Aires");
        element.submit();
            return element;
        
        });
        
    }

    @Test
    void driverManagerChrom31() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        driver.findElement(By.id("searchInput")).sendKeys("argentina", Keys.ENTER);
        //driver.findElement(By.id("js-link-box-es")).click();

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
        .withTimeout(Duration.ofSeconds(30))
        .pollingEvery(Duration.ofMillis(500))
        .ignoring(NoSuchElementException.class)
        ;
        
        WebElement resultados = wait.until(new Function<WebDriver, WebElement>() 
        {public WebElement apply(WebDriver driver) 
        { return driver.findElement(By.id("content"));
        }});
    }
    @Test
    void integradorp1ej3() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org");
        SoftAssert misoftAssert = new SoftAssert();
        misoftAssert.assertEquals("Wikipedia", driver.getTitle());
        List<WebElement> images = driver.findElements(By.cssSelector("image#mi-imagen"));
        misoftAssert.assertFalse(images.size() > 0);
        misoftAssert.assertAll();
        driver.quit();
    }
    @BeforeEach 
    public void setUp()  {
    WebDriverManager.chromedriver().setup();
     driver = new ChromeDriver(); 
     driver.manage().window().maximize();
     } 
   @Test
    void PracticaEj1() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://pt.wikipedia.org/wiki/Wikip%C3%A9dia:P%C3%A1gina_principal");
        String title= driver.getTitle(); 
        assertEquals("Wikip\u00E9dia, a enciclop\u00E9dia livre", title);   //Comprobacion de titulo en br
        WebElement logo = driver.findElement(By.cssSelector("img.mw-logo-icon"));
        assertTrue(logo.isDisplayed()); //comprobacion de logo
        
    } 
    @AfterEach
    public void tearDown() {
       driver.quit(); 
    } 
    @Test
    void PracticaEj2() {
        driver.get("https://google.com");
        WebElement buscador = driver.findElement(By.id("APjFqb"));
        buscador.sendKeys("Messi es una cabra?", Keys.ENTER);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement link = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".LC20lb.MBeuO.DKV0Md")));
        assertTrue(link.isDisplayed());
        link.click();} 

@Test
    void PracticaEj3() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://wikipedia.org");
        WebElement br = driver.findElement(By.id("js-link-box-pt"));
        br.click();
        String titleBr= driver.getTitle();
        System.out.println(titleBr);
        driver.navigate().back();
        WebElement italiano = driver.findElement(By.id("js-link-box-it"));
        italiano.click();
        String titleIt= driver.getTitle();
        System.out.println(titleIt);
        assertNotEquals(titleBr, titleIt);
    } 

    @Test
    void PracticaEj31() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://wikipedia.org");
        WebElement br = driver.findElement(By.id("js-link-box-pt"));
        br.click();
        String titleBr= driver.getTitle();
        System.out.println(titleBr);
        driver.navigate().back();
        WebElement italiano = driver.findElement(By.id("js-link-box-it"));
        italiano.click();
        String titleIt= driver.getTitle();
        System.out.println(titleIt);
        SoftAssert miSoftAssert = new SoftAssert();
        miSoftAssert.assertNotEquals(titleBr, titleIt);
        miSoftAssert.assertAll();}


}