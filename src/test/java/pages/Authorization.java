package pages;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Authorization {
    WebDriver driver;

    @Before
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver","D:\\Java_dev\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(500,TimeUnit.MILLISECONDS);
        driver.get("https://dmoneyapu01.alfa.bank.int:9443/front/dashboard");
    }

    @Test
    public void testTest() throws InterruptedException {
        By fieldUser = By.cssSelector("#user");
        By fieldPass = By.cssSelector("#password");
        By buttonEnter = By.cssSelector(".pure-button.pure-button-secondary.submit");
        By fieldSelectShop = By.cssSelector(".chosen-search-input.ui-autocomplete-input");
        By buttonNextShop = By.cssSelector(".next.back-right");
        By linkGoToInterface = By.xpath("//div[@id='content']/div/div[1]/div[4]/p/a");

        driver.findElement(fieldUser).sendKeys("cfront01");
        driver.findElement(fieldPass).sendKeys("cfront123");
        driver.findElement(buttonEnter).click();
        driver.findElement(fieldSelectShop).sendKeys("IL_aleco_031234");
        driver.findElement(buttonNextShop).click();
        driver.findElement(linkGoToInterface).click();

}



    @After
    public void afterTest(){
    //driver.quit();
    }

}
