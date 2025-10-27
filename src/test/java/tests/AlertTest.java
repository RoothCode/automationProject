package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertTest {
    public WebDriver driver;


    @Test
    public void metodaTest() {

        // === Deschidem browserul și accesăm URL-ul ===
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        //wait implicit ( vegheaza asupra codului )
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

// === Navigare în meniul Alerts ===
        WebElement alertMeniu = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", alertMeniu);

        WebElement tabButton = driver.findElement(By.xpath("//span[text()='Alerts']"));
        tabButton.click();

// === First Alert ===
        WebElement firstAlertElement = driver.findElement(By.id("alertButton"));
        firstAlertElement.click();

        Alert firstAlert = driver.switchTo().alert();
        firstAlert.accept();

        WebElement secondAlert=driver.findElement(By.id("timerAlertButton"));
        secondAlert.click();

        //wait explicit
        WebDriverWait waitExplicit=new WebDriverWait(driver,Duration.ofSeconds(10));
        waitExplicit.until(ExpectedConditions.alertIsPresent());
        Alert secondAlertElement=driver.switchTo().alert();
        System.out.println(secondAlertElement.getText());
        secondAlertElement.accept();

// === Confirm Alert (Cancel) ===
        WebElement confirmAlertElement = driver.findElement(By.id("confirmButton"));
        confirmAlertElement.click();

        Alert confirmAlert = driver.switchTo().alert();
        confirmAlert.dismiss();

        WebElement textThirdAlert = driver.findElement(By.id("confirmResult"));
        String expectedText = "You selected Cancel";
        String actualText = textThirdAlert.getText();

        if (!actualText.equals(expectedText)) {
            Assert.fail("Eroare: Mesajul dupa apasarea Cancel NU corespunde. Expected: '"
                    + expectedText + "', dar a fost: '" + actualText + "'.");
        }

// === Prompt Alert ===
        WebElement promptAlertElement = driver.findElement(By.id("promtButton"));
        promptAlertElement.click();

        Alert promptAlert = driver.switchTo().alert();
        promptAlert.sendKeys("text123");
        promptAlert.accept();

        WebElement textPromptResult = driver.findElement(By.id("promptResult"));
        String expectedPromptText = "You entered text123";
        String actualPromptText = textPromptResult.getText();

        if (!actualPromptText.equals(expectedPromptText)) {
            Assert.fail("Eroare: Mesajul dupa Prompt NU corespunde. Expected: '"
                    + expectedPromptText + "', dar a fost: '" + actualPromptText + "'.");
        }

// === Delay + Inchidere browser ===
//        try {
//            Thread.sleep(5000); // asteapta 5 secunde
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        driver.quit(); // inchide complet browserul si sesiunea WebDriver

    }


    }

    // === Închidem browserul ===
//        driver.quit();





//        tema pentru data viitoare sa facem un IF pentru assert ( cele doua cazuri de accept )










