package Pages;

import HelperMethods.ElementsMetods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TextBoxPage {
    WebDriver driver;
    ElementsMetods elementsMetods;

    public TextBoxPage(WebDriver driver)
    {
        this.driver = driver;
        this.elementsMetods =new ElementsMetods(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "userName")
    WebElement firstNameField;
    @FindBy(id = "userEmail")
    WebElement userEmailField;
    @FindBy(id= "currentAddress")
    WebElement currentAddressField;
    @FindBy(id = "permanentAddress")
    WebElement permanentAddressField;
    @FindBy(id="submit")
    WebElement submitButton;


  public void addEntry(String userName, String userEmail, String currentAddress, String permanentAddress)
  {
      enterUserName(userName);
      enterUserEmail(userEmail);
      enterCurrentAddress(currentAddress);
      enterPermanentAddress(permanentAddress);
      clickOnSubmitButton();

  }
  public void enterUserName(String userNameText){
      elementsMetods.enterText(firstNameField,userNameText);
  }
  public void enterUserEmail(String userEmailText){
      elementsMetods.enterText(userEmailField,userEmailText);
  }
  public void enterCurrentAddress(String currentAddressText){
      elementsMetods.enterText(currentAddressField,currentAddressText);
  }
  public void enterPermanentAddress(String permanentAddressText){
      elementsMetods.enterText(permanentAddressField, permanentAddressText);
  }
  public void clickOnSubmitButton(){
      elementsMetods.clickOnElement(submitButton);
  }

}





