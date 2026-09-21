package Tests;

import ObjectData.PracticeFormObject;
import ObjectData.WebTableObject;
import Pages.CommonPage;
import Pages.HomePage;
import Pages.PracticeFormPage;
import SharedData.TestBasePage;
import XmlReader.XmlDataLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Map;

public class PracticeFormTest extends TestBasePage {
    private Map<String , PracticeFormObject> practiceFormObjectMap;
@Test
    public void metodaTest() throws InterruptedException {

    practiceFormObjectMap = XmlDataLoader.loadData("C:\\Users\\andre\\IdeaProjects\\AutomationItSchool\\src\\test\\resources\\PracticeFormData.xml", PracticeFormObject.class);
    PracticeFormObject data = practiceFormObjectMap.get("dataSet_1");


    HomePage homePage = new HomePage(getDriver());
    homePage.clickForms();

    CommonPage commonPage = new CommonPage(getDriver());
    commonPage.clickOnSubMenu("Practice Form");

    PracticeFormPage practiceFormPage = new PracticeFormPage(getDriver());
    practiceFormPage.completeFirstRegionField(data);
    practiceFormPage.completeGender(data);
    practiceFormPage.uploadPicture();
    practiceFormPage.completeStatesAndCity(data);
    practiceFormPage.completeHobbies(data);
    practiceFormPage.completeCalendar(data);
    practiceFormPage.submit();




    }

    //private void comleteFirstRegionField() {
 //   }
//        WebDriver driver = new ChromeDriver(); //se acceseaza chrome
////        driver.manage().window().maximize(); //maximizeaza fereastra
////        driver.get("https://demoqa.com/"); //acceseaza pagina
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0, 800);"); // 800 pixeli in jos
//
//
//
//        WebElement formsButton = driver.findElement(By.xpath("//h5[text() ='Forms']"));// gaseste elementul
//        js.executeScript("arguments[0].click();", formsButton);
//        js.executeScript("window.scrollBy(0, -800);");
//
//        WebElement practiceFormButton = driver.findElement(By.xpath("//span[text()='Practice Form']"));
//        js.executeScript("arguments[0].click();", practiceFormButton);
//        js.executeScript("window.scrollBy(0, -800);");
//
//        String gender = "Male";
//
//        WebElement malegenderButton = driver.findElement(By.xpath("(//*[@class = 'form-check-label'])[1]"));
//
//
//        WebElement femalegenderButton = driver.findElement(By.xpath("(//*[@class = 'form-check-label'])[2]"));
//
//
//        WebElement othergenderButton = driver.findElement(By.xpath("(//*[@class = 'form-check-label'])[3]"));
//
//     //   if (gender.equals("Male")){
//            malegenderButton.click();
//      //  }else if (gender.equals("Female")){
//            femalegenderButton.click();
//
//     //   }else if (gender.equals("Other")){
//            othergenderButton.click();
//       // }
//
//        switch (gender){
//            case "Male" : malegenderButton.click();
//            break;
//            case "Female": femalegenderButton.click();
//            break;
//            case "Other": othergenderButton.click();
//        }
//
//
//
//
//
//    }

}
