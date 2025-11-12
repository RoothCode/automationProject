package pages;

import helpMethods.AlertsMethods;
import helpMethods.ElementsMethods;
import helpMethods.FrameMethods;
import helpMethods.TabMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class BasePage {

    public WebDriver driver;

    public ElementsMethods elementsMethods;
    public AlertsMethods alertsMethods;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        elementsMethods = new ElementsMethods(this.driver);
        alertsMethods alertsMethod = new AlertsMethods(this.driver);
        frameMethods = new FrameMethods(this.driver);
        tabMethods = new TabMethods(this.driver);
        PageFactory.initElements(this.driver, this)
    }

    public TabMethods tabMethods;
    public FrameMethods frameMethods;


}
