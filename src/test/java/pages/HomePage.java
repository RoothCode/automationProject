package pages;

import helpMethods.ElementsMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.text.Element;

public class HomePage {
    public HomePage(WebDriver driver) {
        this.driver = driver;
        elementsMethod=new ElementsMethod(this.driver);

    }

    public WebDriver driver;
    public ElementsMethod elementsMethod;

    @FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
    public WebElement alertFrameWindowMenu;

    public void clickAlertFrameWindow(){
        elementsMethod.javaScriptElement(alertFrameWindowMenu);
    }






}
