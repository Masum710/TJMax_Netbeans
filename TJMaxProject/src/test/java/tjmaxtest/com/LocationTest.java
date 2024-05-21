/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package tjmaxtest.com;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author patel
 */
public class LocationTest {
    private static WebDriver driver;
    private static String baseUrl;
    
    public LocationTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        driver.close();
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void testTjMaxLocationTestCases() throws Exception {
    driver.get("https://www.google.com/search?gs_ssp=eJzj4tTP1TewNE8yLlZgNGB0YPBiK8nKTayoAABBwAYF&q=tjmaxx&oq=Tjmax&gs_lcrp=EgZjaHJvbWUqFQgBEC4YJxjHARjJAxjRAxiABBiKBTIPCAAQIxgnGOMCGIAEGIoFMhUIARAuGCcYxwEYyQMY0QMYgAQYigUyBggCEEUYOTIGCAMQRRhAMgYIBBBFGDwyBggFEEUYPDIGCAYQRRg8MgYIBxBFGDzSAQgzMTE5ajBqMagCALACAA&sourceid=chrome&ie=UTF-8");
    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/div/span/a/h3")).click();
    driver.get("https://tjmaxx.tjx.com/store/index.jsp");
    driver.findElement(By.id("locator-cityStateOrZip")).click();
    driver.findElement(By.id("findStoreSubmit")).click();
    driver.get("https://tjmaxx.tjx.com/store/stores/storeLocator.jsp?_requestid=12220869");
    driver.findElement(By.id("store-location-zip")).click();
    driver.findElement(By.id("store-location-zip")).clear();
    driver.findElement(By.id("store-location-zip")).sendKeys("60090");
    driver.findElement(By.id("store-location-city")).click();
    driver.findElement(By.id("store-location-city")).clear();
    driver.findElement(By.id("store-location-city")).sendKeys("Wheeling");
    driver.findElement(By.id("store-location-state")).click();
    new Select(driver.findElement(By.id("store-location-state"))).selectByVisibleText("Illinois");
    driver.findElement(By.name("submit")).click();
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,500)", "");
  }
}
