/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author Agust
 */
public class HomePage_duckduckGo {
    WebDriver driver;
    @FindBy(className="legacy-homepage_legacyButton__oUMB9")
    private WebElement menuDesplegable;
    @FindBy(xpath = "/html/body/div/main/article/div[1]/header/div/button")
    private WebElement configuracion;
    @FindBy(xpath = "/html/body/div/main/article/div[1]/header/div/div/div/section[1]/ul/li[3]/a")
    private Select desplegableIdiomas;
    @FindBy(xpath="/html/body/div/div[1]/div/div/div[1]/div[1]/div[2]/form/div[2]/div/select")
    private Select españolIdiomas;
    @FindBy(css="a.btn")
    private WebElement guardarYSalir;
    @FindBy(css="h1.badge-link__title")
    private WebElement h1;
     
     
    
    

    public HomePage_duckduckGo(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void abrirConfiguraciones(WebDriver driver){
    WebDriverWait wait = new WebDriverWait(driver, 5);
    //WebElement MenuDesp1 = wait.until(ExpectedConditions.visibilityOf(this.menuDesplegable));
    Actions actions = new Actions(driver);
    actions.moveToElement(menuDesplegable);
    actions.perform();  
    menuDesplegable.click();
    WebElement configClick = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/main/article/div[1]/header/div/div/div/section[1]/ul/li[3]/a")));
    configClick.click();
    }
    public void seleccionarIdioma(){
    this.desplegableIdiomas.selectByValue("es_ES");
    }
	
    public void comprobarIdioma(){
       assertEquals("\u00BFCansado de que te rastreen? Podemos ayudarte.", this.h1.getText());
    
    }
}
