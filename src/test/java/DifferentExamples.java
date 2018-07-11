import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class DifferentExamples {

    WebDriver driver;
    WebElement webElement;

    @Before
    public void preconditions(){
        System.setProperty("webdriver.chrome.driver","D:\\Java_dev\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
        //driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.MILLISECONDS);
        //driver.get("https://www.ukr.net/");
        driver.get("https://mail.ukr.net/q/start#msglist");

    }

    @Test
    public void differentExamples() throws InterruptedException {

        driver.findElement(By.cssSelector("[name=Login]")).sendKeys("kok3131");
        driver.findElement(By.cssSelector("[type=password]")).sendKeys("rjdshzkrf");
        driver.findElement(By.cssSelector("[class='button is-type-submit is-size-large form__submit']")).click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector((".compose-message-link"))));
        driver.findElement(By.cssSelector(".compose-message-link")).click();
        driver.findElement(By.cssSelector("input[type=text][name=to]")).sendKeys("terraco_kiev@ukr.net");
        driver.findElement(By.cssSelector("[type=text][name=subject]")).sendKeys("Test Subject");
        driver.findElement(By.cssSelector(".fmedit>div:nth-child(2)")).click();
        driver.findElement(By.cssSelector(".fmedit>div:nth-child(2)")).sendKeys("Test text in the body letter");
        //driver.findElement(By.cssSelector("span.upl-fake-button.button>input[type=button]")).click();
        driver.findElement(By.cssSelector(".upl-file-button[type=file]")).sendKeys("D:\\testObj.txt");
        Thread.sleep(500);driver.findElement(By.cssSelector("#sendmsg-page>div:nth-child(6)>span:nth-child(2)>input")).click();
        //WebElement fileInput = driver.findElement(By.cssSelector("span.upl-fake-button.button>input[type=button]"));
        //fileInput.sendKeys("src/test/sources/testObj.txt");
        //river.findElement(By.cssSelector("span.upl-fake-button.button>input[type=button]"))
        //        .sendKeys("D:\\testObj.txt");

       /* By loginForm =  By.cssSelector("[class='login-block__input'][name=Login]");
        By passForm =  By.cssSelector("[class=login-block__input][type=password]");
        By buttonEnter =  By.cssSelector("button[type=submit]");
        By goToEmailsPage = By.partialLinkText("//a[@href='https://mail.ukr.net/q/start#msglist']");
        By newLetter =  By.cssSelector(".compose-message-link");
        By fieldSendTo =  By.cssSelector("input[type=text][name=to]");
        By fieldSubject =  By.cssSelector("[type=text][name=subject]");
        By fieldTextInBody =  By.cssSelector("textarea[name=body]");
        By sendObj =  By.cssSelector("span.upl-fake-button.button>input[type=button]");

        driver.findElement(loginForm).sendKeys("kok3131");
        driver.findElement(passForm).sendKeys("rjdshzkrf");
        driver.findElement(buttonEnter).click();
        //driver.navigate().to("https://mail.ukr.net/q/start#msglist");
        driver.findElement(goToEmailsPage).click();
        //driver.findElement(By.xpath("//a[@href='https://mail.ukr.net/q/start#msglist']")).click();
        //driver.get("https://mail.ukr.net/q/start#msglist");
        driver.findElement(goToEmailsPage).click();
        driver.findElement(newLetter).click();
        driver.findElement(fieldSendTo).sendKeys("terraco_kiev@ukr.net");
        driver.findElement(fieldSubject).sendKeys("Test Subject");
        driver.findElement(fieldTextInBody ).sendKeys("Test text in the body letter");
        driver.findElement(sendObj).sendKeys("D:\\testObj.txt");*/

    }

    @After
    public void afterTest() throws InterruptedException {
        Thread.sleep(5000);
        //driver.quit();
    }
}
