package Pages;

import HelperMethods.ElementsMetods;
import Logger.LoggerUtility;
import ObjectData.WebTableObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class WebTablePage {
    WebDriver driver;
    ElementsMetods elementsMetods;

    public WebTablePage(WebDriver driver) {
        this.driver = driver;
        this.elementsMetods =new ElementsMetods(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "addNewRecordButton")
    WebElement addButton;

    @FindBy(id = "firstName")
    WebElement firstNameField;

    @FindBy(id = "lastName")
    WebElement lastNameField;

    @FindBy(id = "userEmail")
    WebElement userEmailField;

    @FindBy(id = "age")
    WebElement ageField;

    @FindBy(id= "salary")
    WebElement salaryField;

    @FindBy(id = "department")
    WebElement departmentField;

    @FindBy(id= "submit")
    WebElement submitButton;

    public void addEntry(WebTableObject data){

    clickOnAddButton();
        LoggerUtility.infoTestCase("User clicked on add button");
    enterFirstName(data.getFirstName());
        LoggerUtility.infoTestCase("User entered First Name");
    enterLastName(data.getLastName());
        LoggerUtility.infoTestCase("User entered Last Name");
    enterUserEmail(data.getUserEmail());
        LoggerUtility.infoTestCase("User entered the Email");
    enterAge(data.getAge());
        LoggerUtility.infoTestCase("User entered the Age");
    enterSalary(data.getSalary());
        LoggerUtility.infoTestCase("User entered the Salary");
    enterDepartment(data.getDepartment());
        LoggerUtility.infoTestCase("User entered the Department");
    clickOnSubmitButton();
}

public void clickOnAddButton()
{

    elementsMetods.clickOnElement(addButton);
}
public void enterFirstName(String firstNameText)
{
    elementsMetods.enterText(firstNameField,firstNameText);
}
public void enterLastName(String lastNameText)
{
    elementsMetods.enterText(lastNameField,lastNameText);
}
public void enterUserEmail(String userEmailText) {elementsMetods.enterText(userEmailField,userEmailText);}
public void enterAge(String ageText)
{
    elementsMetods.enterText(ageField,ageText);
}
public void enterSalary(String salaryText)
{
    elementsMetods.enterText(salaryField,salaryText);
}
public void enterDepartment(String departmentText)
{
    elementsMetods.enterText(departmentField,departmentText);
}

public void clickOnSubmitButton()
{
    elementsMetods.clickOnElement(submitButton);
}

@FindBy(xpath = "(//tr)[5]//td[1]")
WebElement  firstNameColumn;

@FindBy(xpath = "(//tr)[5]//td[2]")
WebElement lastNameColumn;

@FindBy(xpath ="(//tr)[5]//td[3]")
WebElement ageColumn;

@FindBy(xpath ="(//tr)[5]//td[4]" )
WebElement userEmailColumn;

@FindBy (xpath = "(//tr)[5]//td[5]")
WebElement salaryColumn;

@FindBy(xpath = "(//tr)[5]//td[6]")
WebElement departmentColumn;

public void verifyEntry(String firstName, String lastName,String userEmail, String age, String salary, String department){

    Assert.assertTrue(firstNameColumn.getText().equals(firstName));
    LoggerUtility.infoTestCase("User verifird the First Name");
    Assert.assertTrue(lastNameColumn.getText().equals(lastName));
    LoggerUtility.infoTestCase("User verifird the Last Name");
    Assert.assertTrue(userEmailColumn.getText().equals(userEmail));
    LoggerUtility.infoTestCase("User verifird the Email");
    Assert.assertTrue(ageColumn.getText().equals(age));
    LoggerUtility.infoTestCase("User verifird the Age");
    Assert.assertEquals(salaryColumn.getText(),salary);
    LoggerUtility.infoTestCase("User verifird the Salary");
    Assert.assertTrue(departmentColumn.getText().equals(department));
    LoggerUtility.infoTestCase("User verifird the Department");

}
}




