package Tests;

import ObjectData.TextBoxObject;
import ObjectData.WebTableObject;
import Pages.CommonPage;
import Pages.HomePage;
import Pages.TextBoxPage;

import Pages.WebTablePage;
import SharedData.TestBasePage;
import XmlReader.XmlDataLoader;
import com.aventstack.chaintest.plugins.ChainTestListener;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.Map;

@Listeners(ChainTestListener.class)
public class WebTableTest extends TestBasePage {

    private Map<String , WebTableObject> webTableObjectMap;

    @Test
    public void metodaTest() throws InterruptedException {

        webTableObjectMap = XmlDataLoader.loadData("C:\\Users\\andre\\IdeaProjects\\AutomationItSchool\\src\\test\\resources\\WebTableData.xml", WebTableObject.class);
        WebTableObject data = webTableObjectMap.get("dataSet1");
        WebTableObject dataSecoundEnter =webTableObjectMap.get("dataSet2");
//
//        String firstName = "Andreea";
//        String lastName = "Macra";
//        String age = "25";
//        String userEmail = "test@yahoo.com";
//        String salary = "10000";
//        String department = "QA";

        Thread.sleep(2000);

        HomePage homePage = new HomePage(getDriver());
        homePage.clickElements();
        ChainTestListener.log("The user clicked on submenu");
        CommonPage commonPage = new CommonPage(getDriver());
        commonPage.clickOnSubMenu("Web Tables");
        ChainTestListener.log("The user clicked on submenu");

        WebTablePage webTablePage = new WebTablePage(getDriver());
       // webTablePage.addEntry(firstName, lastName,userEmail,age,salary,department);
        webTablePage.addEntry(data);

        Thread.sleep(2000);

        WebElement rowAdded = getDriver().findElement(By.xpath("(//tr)[5]"));
        String rowAddedText = rowAdded.getText();
        System.out.println(rowAddedText);

        Thread.sleep(2000);
       // webTablePage.verifyEntry(firstName,lastName,userEmail,age,salary,department);


       /* ChromeOptions options = new ChromeOptions();

        options.addArguments(
                "--user-data-dir=C:\\SeleniumChromeProfile"
        );

        WebDriver driver = new ChromeDriver(options);
       // WebDriver driver = new ChromeDriver(); //se acceseaza chrome
        driver.manage().window().maximize(); //maximizeaza fereastra
        driver.get("https://demoqa.com/"); //acceseaza pagina */



         //Metoda Wait(2 sec) deoarece codul ruleaza mai repede decat se incarca pagina
        //sleep - exceptie
       // JavascriptExecutor js = (JavascriptExecutor) ;
       // js.executeScript("window.scrollBy(0, 1000);"); // 800 pixeli in jos


      //  WebElement elementsButton = driver.findElement(By.xpath("//h5[text()='Elements']")); // gaseste elementul
      //  js.executeScript("arguments[0].click();", elementsButton);
       // js.executeScript("window.scrollBy(0, -800);");
        //h5[text()='Elements']
        //html/body/div/div/div/div[2]/div/a[1]/div/div/div[3]/h5
        //*[@id="root"]/div/div/div[2]/div/a[1]/div/div/div[3]/h5
        //*[@class='element-list accordion-collapse collapse show']//*[@ class= 'btn btn-light ' and contains(@id, 'item-3')
        //*[text()= 'Web Tables']


        // (//li[@id='item-3'])[1] - varianta cea mai simpla

       // Thread.sleep(2000);

        //WebElement webTableButton = driver.findElement(By.xpath("//span[text() = 'Web Tables'] "));
      //  js.executeScript("arguments[0].click();", webTableButton);
        //js.executeScript("window.scrollBy(0, -800);");



        //Thread.sleep(2000);

        //WebElement addButton = driver.findElement(By.id("addNewRecordButton"));
       // addButton.click();

       // WebElement firstNameField = driver.findElement(By.id("firstName"));
      //  firstNameField.sendKeys(firstName);

       // WebElement lastNameField = driver.findElement(By.id("lastName"));
       // lastNameField.sendKeys(lastName);

        //WebElement userEmailField = driver.findElement(By.id("userEmail"));
       // userEmailField.sendKeys(userEmail);

      //  WebElement ageField = driver.findElement(By.id("age"));
      //  ageField.sendKeys(age);


        //WebElement salaryField = driver.findElement(By.id("salary"));
       // salaryField.sendKeys(salary);

        //WebElement departmentField = driver.findElement(By.id("department"));
       // departmentField.sendKeys(department);

       // WebElement submitButton = driver.findElement(By.id("submit"));
       // submitButton.click();


       /* webTablePage.clickOnAddButton();
        webTablePage.enterFirstName(firstName);
        webTablePage.enterLastName(lastName);
        webTablePage.enterAge(age);
        webTablePage.enterUserEmail(userEmail);
        webTablePage.enterSalary(salary);
        webTablePage.enterDepartment(department);
        webTablePage.clickOnSubmitButton();*/



//       Assert.assertTrue(rowAddedText.contains("Andreea"));
//        Assert.assertTrue(rowAddedText.contains("Macra"));
       //Assert.assertTrue(rowAddedText.contains("25"));
        //Assert.assertTrue(rowAddedText.contains("test@yahoo.com"));
//        Assert.assertTrue(rowAddedText.contains("10000"));
//        Assert.assertTrue(rowAddedText.contains("QA"));

      /*  WebElement firstNameColumn = driver.findElement(By.xpath("(//tr)[5]//td[1]"));
        WebElement lastNameColumn = driver.findElement(By.xpath("(//tr)[5]//td[2]"));
        WebElement ageColumn = driver.findElement(By.xpath("(//tr)[5]//td[3]"));
        WebElement userEmailColumn = driver.findElement(By.xpath("(//tr)[5]//td[4]"));
        WebElement salaryColumn = driver.findElement(By.xpath("(//tr)[5]//td[5]"));
        WebElement departmentColumn = driver.findElement(By.xpath("(//tr)[5]//td[6]"));

        String firstNameColumnText = firstNameColumn.getText();
        String lastNameColumnText =  lastNameColumn.getText();
        String ageColumnText = ageColumn.getText();
        String useremailColumnText = userEmailColumn.getText();
        String salaryColumnText = salaryColumn.getText();
        String departmentColumnText = departmentColumn.getText();

       Assert.assertTrue(firstNameColumnText.equals(firstName));
       Assert.assertTrue(lastNameColumnText.equals(lastName));
       Assert.assertTrue(ageColumnText.equals(age));
       Assert.assertTrue(useremailColumnText.equals(userEmail));
       Assert.assertEquals(salaryColumnText,salary);
       Assert.assertTrue(departmentColumn.getText().equals(department));
       Assert.assertEquals(departmentColumn.getText(),department);*/

    }

}
