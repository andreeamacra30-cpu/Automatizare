package Pages;

import HelperMethods.ElementsMetods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FramesPage {
    WebDriver driver;
    ElementsMetods elementsMetods;

    public FramesPage(WebDriver driver){
        this.driver = driver;
        this.elementsMetods = new ElementsMetods(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "frame1")
    WebElement iframeElement;
    @FindBy(id = "sampleHeading")
    WebElement iframeText;
    @FindBy(id = "frame2")
    WebElement iframeElement2;

    public void firstFrameElement(){
        driver.switchTo().frame((iframeElement));
    }
    public void firstFrameText(){
        Assert.assertEquals(iframeText.getText(),"This is a sample page");
    }
    public void secondFrameElement(){
        driver.switchTo().frame(iframeElement2);
    }
    public void secondFrameText(){
        Assert.assertEquals(iframeText.getText(),"This is a sample page");
    }

}
