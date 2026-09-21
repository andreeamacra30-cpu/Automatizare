package Tests;

import SharedData.TestBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class browserWindowTest extends TestBasePage {

    @Test
    public void metodaTest(){

       // ChromeOptions options = new ChromeOptions();
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

        List<WebElement> cardList = getDriver().findElements(By.xpath("//*[@class='category-cards']//*[@data-discover='true']"));
        cardList.get(2).click();

        List<WebElement> elementsList = getDriver().findElements(By.xpath("//*[@class='element-list accordion-collapse collapse show']//*[@data-discover='true']"));
        elementsList.get(0).click();

        WebElement tabButton = getDriver().findElement(By.id("tabButton"));
        tabButton.click();

        List<String> tabList = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabList.get(1));

        getDriver().switchTo().window((tabList.getFirst()));

        WebElement newTabText = getDriver().findElement(By.id("sampleHeading"));
        System.out.println("Textul din noul  este" + newTabText.getText());

        getDriver().close();
        getDriver().switchTo().window(tabList.getFirst());

        WebElement windowButton = getDriver().findElement(By.id("windowButton"));
        windowButton.click();

        List<String>newWindowList = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window((newWindowList.get(1)));

        WebElement newWindowText = getDriver().findElement(By.id("sampleHeading"));
        System.out.println(" Textul din doul tab este "+ newWindowText.getText());

        getDriver().manage().window().maximize();
        getDriver().close();

}

}
