package Tests;

import ObjectData.TextBoxObject;
import Pages.CommonPage;
import Pages.HomePage;
import Pages.TextBoxPage;
import SharedData.TestBasePage;
import XmlReader.XmlDataLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

public class TextBoxTest extends TestBasePage {
    private Map<String ,TextBoxObject> textBoxObjectMap;


    @Test
    public void metodaTest() throws InterruptedException {
        textBoxObjectMap = XmlDataLoader.loadData("C:\\Users\\andre\\IdeaProjects\\AutomationItSchool\\src\\test\\resources\\TextBoxData.xml", TextBoxObject.class);
        TextBoxObject data = textBoxObjectMap.get("dataSet_2");

        JavascriptExecutor js = (JavascriptExecutor) getDriver();

//        js.executeScript("window.scrollBy(0, 400);"); // 800 pixeli in jos
//        String userName = "Andreea";
//        String userEmail = "andreea.macra@gmail.com";
//        String currentAddress = "Campia Turzii";
//        String permanentAddress = "Campia Turzii";

        HomePage homePage = new HomePage(getDriver());
        homePage.clickElements();

        Thread.sleep(2000);
        CommonPage commonPage = new CommonPage(getDriver());
        commonPage.clickOnSubMenu("Text Box");

        TextBoxPage textBoxPage  = new TextBoxPage(getDriver());
        textBoxPage.entryTextBox(data);

        WebElement name = getDriver().findElement(By.id("name"));
        WebElement email = getDriver().findElement(By.id("email"));
        List<WebElement>infoList = getDriver().findElements(By.xpath("//*[@class='mb-1']"));

        WebElement submitButton = getDriver().findElement(By.id("submit"));
        submitButton.click();




//        ChromeOptions options = new ChromeOptions();
//
//       options.addArguments(
//              "--user-data-dir=C:\\SeleniumChromeProfile"
//       );
//        WebDriver driver = new ChromeDriver(options); //se acceseaza chrome
//        driver.manage().window().maximize(); //maximizeaza fereastra
//        driver.get("https://demoqa.com/");


        //*[@class='category-cards']//*[@data-discover='true']

       // List<WebElement> cardList = driver.findElements(By.xpath("//*[@class='category-cards']//*[@data-discover='true']"));
        //cardList.getFirst().click();



       // js.executeScript("window.scrollBy(0, -800);"); // 800 pixeli in jos
        //List<WebElement> elementList = driver.findElements(By.xpath("//*[@class='element-list accordion-collapse collapse show']//*[@data-discover='true']"));
        //elementList.getFirst().click();

       // textBoxPage.addEntry("Andreea", "andreea.macra@gmail.com","Campia Turzii", "Campia Turzii");

       /* WebElement firstNameColumn = driver.findElement(By.id("userName"));
        WebElement userEmailColumn = driver.findElement(By.id("userEmail"));
        WebElement currentAdressColumn = driver.findElement(By.id("currentAddress"));
        WebElement permanentAdressColumn = driver.findElement(By.id("permanentAddress"));

        firstNameColum.sendKeys("Andreea");
        userEmailColum.sendKeys("andreea.macra@gmail.com");
        currentAdressColum.sendKeys("Campia Turzii");
        permanentAdressColum.sendKeys("Campia Turzii");*/





        //textBoxPage.addEntry("Andreea","andreea.macra@gmail.com", "Campia Turzii","Campia Turzii");



        //assert name.getText().equals("Name:Andreea");
      //  assert email.getText().equals("Email:andreea.macra@gmail.com");
       // assert infoList.get(2).getText().equals("current address:Campia Turzii");
       // assert infoList.get(3).getText().equals("permanent address:Campia Turzii");


        /* WebElement name = driver.findElement(By.id("name"));
        assert name.getText().equals("Name:Andreea Macra");

        WebElement email = driver.findElement(By.id("email"));
        assert email.getText().equals("Email:andreea.macra@gmail.com");

        List<WebElement> infoList = driver.findElements(By.xpath("//*[@class='mb-1']"));
        assert infoList.get(2).getText().equals("Current Address :Campia Turzii");
        assert infoList.get(3).getText().equals("Permanenet Address :Campia Turzii");
*/
    }



}
