package Pages;

import HelperMethods.AlertsMethods;
import HelperMethods.ElementsMetods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsPage {
    WebDriver driver;
    ElementsMetods elementsMetods;
    AlertsMethods alertsMethods;

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
        this.elementsMetods = new ElementsMetods(driver);
        this.alertsMethods = new AlertsMethods(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy (xpath = "//*[@id='alertButton']")
    WebElement alertButton;
    @FindBy(xpath = "//*[@id ='timerAlertButton']")
    WebElement timerAlertButton;
    @FindBy(xpath = "//*[@id ='confirmButton']")
    WebElement confirmButton;
    @FindBy(xpath = "//*[@id ='promtButton']")
    WebElement promtButton;

    public  void  dealWithAlertOk(){
        elementsMetods.clickOnElement(alertButton);
        alertsMethods.alertOk();

    }
    public void dealAlertDelay(int seconds)
    {
        elementsMetods.clickOnElement(timerAlertButton);
        alertsMethods.alertWithDelay(seconds);
    }
    public void alertConfirm ()
    {
        elementsMetods.clickOnElement(confirmButton);
        alertsMethods.alertConfirm();
    }

    public void alertCancel()
    {
        elementsMetods.clickOnElement(confirmButton);
        alertsMethods.alertCancel();
    }

    public void alertPromt(String value)
    {
        elementsMetods.clickOnElement(promtButton);
        alertsMethods.alertText(value);
    }

}
