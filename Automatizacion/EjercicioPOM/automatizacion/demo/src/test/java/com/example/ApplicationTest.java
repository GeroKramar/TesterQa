package com.example;
import org.openqa.selenium.Alert;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import io.appium.java_client.android.AndroidElement;
import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ApplicationTest {
    WebDriver driver;

    
    @Test
    public void integrador1AbrirPestaña() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //WebElement btn1=driver.findElement(By.cssSelector("a.button"));
        //btn1.click();
        WebElement pestañaIframe = driver.findElement(By.id("iFrame"));
        pestañaIframe.click();
        driver.switchTo().frame("globalSqa");
        WebElement softwareTesting = driver.findElement(By.cssSelector("[data-attachment-id='1994']"));
        wait.until(ExpectedConditions.visibilityOf(softwareTesting));
        softwareTesting.click();
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
        WebElement softwareManual = driver.findElement(By.cssSelector("[data-attachment-id='1976']"));
        wait.until(ExpectedConditions.visibilityOf(softwareManual));
        softwareManual.click();        
    }
    @Test
    void test1aS(){
    public class GetName { public static void main(String[] args) 
     throws MalformedURLException { 
     DesiredCapabilities cap = new DesiredCapabilities(); 
     cap.setCapability("deviceName", "tu_emulador_o_dispositivo");
     cap.setCapability("platformName", "Android");
     AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
     System.out.println(driver.getDeviceTime()); } }
    }
}
