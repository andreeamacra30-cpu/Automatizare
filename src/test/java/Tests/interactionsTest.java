package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class interactionsTest {
    @Test
    public void metodaTest(){

        ChromeOptions options = new ChromeOptions();

        options.addArguments(
                "--user-data-dir=C:\\SeleniumChromeProfile"
        );

        WebDriver driver = new ChromeDriver(options); //se acceseaza chrome
        driver.manage().window().maximize(); //maximizeaza fereastra
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://demoqa.com/");

        List<WebElement> cardList = driver.findElements(By.xpath("//*[@class='category-cards']//*[@data-discover='true']"));
        cardList.get(4).click();

        List<WebElement> elementsList = driver.findElements(By.xpath("//*[@class='element-list accordion-collapse collapse show']//*[@data-discover='true']"));
        elementsList.get(0).click();

        WebElement oneElement = driver.findElement(By.xpath("//div[@data-handler-id = 'T0']"));
        WebElement fiveElement = driver.findElement(By.xpath("//div[@data-handler-id = 'T8']"));

         Actions actions = new Actions(driver);
        actions.clickAndHold(oneElement).moveToElement(fiveElement, 0, 10).release().build().perform();
    }
    }