package Tests;

import HelperMethods.ElementsMetods;
import Pages.CommonPage;
import Pages.FramesPage;
import Pages.HomePage;
import SharedData.TestBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class framesTest extends TestBasePage {

    @Test
    public void metodaTest(){

      //  ChromeOptions options = new ChromeOptions();
//        options.addArguments(
//                "--user-data-dir=C:\\SeleniumChromeProfile"
//        );
//
//        WebDriver driver = new ChromeDriver(options); //se acceseaza chrome
//        driver.manage().window().maximize(); //maximizeaza fereastra
////WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
//        driver.get("https://demoqa.com/");



        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0, 800);"); // 800 pixeli in jos

        HomePage homePage = new HomePage(getDriver());
        homePage.clickAlertsButton();

        CommonPage commonPage = new CommonPage(getDriver());
        commonPage.clickOnSubMenu("Frames");

        FramesPage framesPage = new FramesPage(getDriver());
        framesPage.firstFrameElement();
        framesPage.firstFrameText();

        getDriver().switchTo().defaultContent();

        framesPage.secondFrameElement();
        framesPage.secondFrameText();

        getDriver().switchTo().defaultContent();



       // List<WebElement> cardList = driver.findElements(By.xpath("//*[@class='category-cards']//*[@data-discover='true']"));
        //cardList.get(2).click();

       // List<WebElement> elementsList = driver.findElements(By.xpath("//*[@class='element-list accordion-collapse collapse show']//*[@data-discover='true']"));
      //  elementsList.get(2).click();

       // WebElement iframeElement = driver.findElement(By.id("frame1"));
       // driver.switchTo().frame(iframeElement);
       // WebElement iframeText = driver.findElement(By.id("sampleHeading"));
       // System.out.println("Textul din primul iframe este" + iframeText.getText());

       // driver.switchTo().defaultContent();

        //WebElement iframeElement2 = driver.findElement(By.id("frame2"));
       // driver.switchTo().frame(iframeElement2);
      //  WebElement iframeText2 = driver.findElement(By.id("sampleHeading"));
       // System.out.println("Textul din al doilea iframe este" + iframeText2.getText());

       // driver.switchTo().defaultContent();




    }
}
