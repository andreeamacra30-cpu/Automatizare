package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


@Test
public class PracticeFormTest {

    public void metodaTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver(); //se acceseaza chrome
        driver.manage().window().maximize(); //maximizeaza fereastra
        driver.get("https://demoqa.com/"); //acceseaza pagina

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 800);"); // 800 pixeli in jos



        WebElement formsButton = driver.findElement(By.xpath("//h5[text() ='Forms']"));// gaseste elementul
        js.executeScript("arguments[0].click();", formsButton);
        js.executeScript("window.scrollBy(0, -800);");

        WebElement practiceFormButton = driver.findElement(By.xpath("//span[text()='Practice Form']"));
        js.executeScript("arguments[0].click();", practiceFormButton);
        js.executeScript("window.scrollBy(0, -800);");

        String gender = "Male";

        WebElement malegenderButton = driver.findElement(By.xpath("(//*[@class = 'form-check-label'])[1]"));


        WebElement femalegenderButton = driver.findElement(By.xpath("(//*[@class = 'form-check-label'])[2]"));


        WebElement othergenderButton = driver.findElement(By.xpath("(//*[@class = 'form-check-label'])[3]"));

     //   if (gender.equals("Male")){
            malegenderButton.click();
      //  }else if (gender.equals("Female")){
            femalegenderButton.click();

     //   }else if (gender.equals("Other")){
            othergenderButton.click();
       // }

        switch (gender){
            case "Male" : malegenderButton.click();
            break;
            case "Female": femalegenderButton.click();
            break;
            case "Other": othergenderButton.click();
        }





    }

}
