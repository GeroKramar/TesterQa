package com.example;
import org.junit.jupiter.api.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import java.io.PrintStream;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


/* withTimeout(Duration duration): Establece la cantidad máxima de tiempo para esperar una condición. 
La espera terminará y lanzará una excepción si la condición no se cumple dentro del período de tiempo especificado.

pollingEvery(Duration duration): Establece la frecuencia con la que se debe verificar la condición. Por ejemplo, 
si la configuras en 500 milisegundos, la condición se verificará cada 500 milisegundos.

ignoring(Class<? extends Throwable> exceptionType): Le dice a Fluent Wait que ignore ciertas excepciones mientras 
espera que se cumpla una condición. Esto es útil si esperas que una excepción ocurra comúnmente y no quieres que termine la espera.

until(Function<? super T, V> isTrue): Este método acepta una instancia de Function que debe devolver un valor diferente 
de null o false si la condición se cumple. La espera continuará hasta que se cumpla esta condición o se alcance el tiempo máximo de espera.

withMessage(String message): Este método permite establecer un mensaje personalizado que se incluirá en la excepción 
si se alcanza el tiempo de espera sin que se cumpla la condición.

until(Predicate<T> isTrue): Similar a until(Function<? super T, V> isTrue), pero acepta un Predicate y continúa 
la espera hasta que el predicado devuelva true.

Aquí tienes un ejemplo que utiliza varios de estos métodos:

Wait<WebDriver> wait = new FluentWait<WebDriver>(driver) 
.withTimeout(Duration.ofSeconds(30)) // Tiempo máximo de espera 
.pollingEvery(Duration.ofSeconds(5)) // Frecuencia de verificación 
.ignoring(NoSuchElementException.class) // Ignorar esta excepción 
.withMessage("Elemento no encontrado en el tiempo especificado"); 
// Mensaje personalizado 
WebElement element = wait.until(new Function<WebDriver, WebElement>() { public WebElement apply(WebDriver driver) { 
    return driver.findElement(By.id("someElement")); 
} 
});
 */
            




         class ApplicationTest {
            
            @BeforeEach 
            public void setUp()  {
            WebDriverManager.chromedriver().setup();
            }
           

        
            @Test       
            public void ronitequiero(){
                
                WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.com/search?q=ronny+solano&sca_esv=556106327&source=hp&ei=EbzWZPLwCNze1sQP8t6ViA4&iflsig=AD69kcEAAAAAZNbKIU5OoWjfah-s0C_cXC4I1msv7hLb&ved=0ahUKEwiyvbK52dWAAxVcr5UCHXJvBeEQ4dUDCAk&uact=5&oq=ronny+solano&gs_lp=Egdnd3Mtd2l6Igxyb25ueSBzb2xhbm8yBhAAGBYYHjIGEAAYFhgeSONtUI1VWKBqcAJ4AJABAJgBaqAB3giqAQM5LjO4AQPIAQD4AQGoAgDCAgUQLhiABMICCxAuGIAEGMcBGNEDwgIFEAAYgATCAgsQLhiABBjHARivAcICBxAuGIAEGArCAgcQABiABBgKwgIHEAAYDRiABMICBhAAGB4YDQ&sclient=gws-wiz");
    
            Wait<WebDriver> wait = new FluentWait<>(driver)
                    .withTimeout(Duration.ofSeconds(10))
                    .pollingEvery(Duration.ofMillis(500))
                    .ignoring(NoSuchElementException.class);
    
            WebElement loginButton = wait.until(new Function<WebDriver, WebElement>() {
                public WebElement apply(WebDriver driver) {
                    return driver.findElement(By.cssSelector("h3.LC20lb"));

                }
            });
    
            loginButton.click();
            WebElement ronny = driver.findElement(By.cssSelector("h1.top-card-layout__title"));
           
            System.out.println(ronny.getText());
             System.out.println(loginButton);
            
            driver.quit();
        }

        
        @Test 
        void logoWikifede(){

   WebDriver driver = new ChromeDriver();
    driver.get("https://www.wikipedia.org");

    Wait<WebDriver> wait = new FluentWait<>(driver)
            .withTimeout(Duration.ofSeconds(10))
            .pollingEvery(Duration.ofMillis(500))
            .ignoring(NoSuchElementException.class);

    WebElement logowiki = wait.until(new Function<WebDriver, WebElement>() {
        public WebElement apply(WebDriver driver) {
            return driver.findElement(By.cssSelector("img.central-featured-logo"));
        }
    });

    driver.quit();
}


@Test
    void unplashImagefede(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://unsplash.com/es");

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        WebElement image= wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.partialLinkText("Azul"));
            }
        });
        
        image.click();

        driver.quit();
        

    }

    @Test
    void bbcBanner(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bbc.com/mundo");

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        WebElement banner= wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.partialLinkText("Tecnología"));
            }
        });
        System.out.println(banner.getText());
        banner.click();
        

    }

        @Test
    void cnn(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://edition.cnn.com/");

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        WebElement stories= wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                //return driver.findElement(By.cssSelector("div.container__headline"));
                return driver.findElement(By.partialLinkText("Women\u2019s World Cup"));
            }
        });
        System.out.println(stories.getText());
        stories.click();
        driver.quit();
        

    }

    @Test
    void cnn1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://edition.cnn.com/");

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        WebElement stories= wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.cssSelector("div.container__headline"));
                //return driver.findElement(By.partialLinkText("Women\u2019s World Cup"));
            }
        });
        System.out.println(stories.getText());
        stories.click();
        driver.quit();
        

    }


    @Test
    void cnnTopStores(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cnn.com/");

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        WebElement stories= wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.partialLinkText("Residents return to Lahaina as death toll climbs to 67"));
            }
        });
        System.out.println(stories.getText());
        stories.click();
        driver.quit();

    }

    }
    

    