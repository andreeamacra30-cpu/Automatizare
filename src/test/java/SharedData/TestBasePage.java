package SharedData;

import Logger.LoggerUtility;

import SharedData.Browser.BrowserFactory;
import org.apache.logging.log4j.ThreadContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.ILoggerFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

public class TestBasePage {

    private WebDriver driver;
    public String testName;

    @BeforeMethod
    //Se executa inainte de @Test de fiecare data
    public void initialiseBrowser() throws InterruptedException {

        ThreadContext.put("testName", this.getClass().getSimpleName());

//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--user-data-dir=C:\\SeleniumChromeProfile");

        testName = this.getClass().getSimpleName();
        driver = new BrowserFactory().getBrowserFactory();
        LoggerUtility.infoTestCase("===== The browser started successfully");
        LoggerUtility.startTestCase(testName);
        driver.get("https://demoqa.com/");
    }

    @AfterMethod
    public void clearBrowser(ITestResult result){
        driver.quit();
        LoggerUtility.infoTestCase("the browser was closed successfully");
        if (result.getStatus() == ITestResult.FAILURE){
            LoggerUtility.errorLog(result.getThrowable().getMessage());
        }
        LoggerUtility.infoTestCase("===== The browser closed successfully");
        LoggerUtility.endTestCase(testName);

    }

    @AfterSuite
    public void finishLogFiles(){
        LoggerUtility.mergeFiles();
    }

    public WebDriver getDriver() {

        return driver;
    }
}

