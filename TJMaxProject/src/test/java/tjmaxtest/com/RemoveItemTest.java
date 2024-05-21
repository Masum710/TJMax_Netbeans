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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
public class RemoveItemTest {
    private static WebDriver driver;
    private static String baseUrl;
    
    public RemoveItemTest() {
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
      public void testManageShoppingBagTestCase() throws Exception {
      driver.get("https://www.google.com/search?gs_ssp=eJzj4tTP1TewNE8yLlZgNGB0YPBiK8nKTayoAABBwAYF&q=tjmaxx&oq=Tjmax&gs_lcrp=EgZjaHJvbWUqFQgBEC4YJxjHARjJAxjRAxiABBiKBTIPCAAQIxgnGOMCGIAEGIoFMhUIARAuGCcYxwEYyQMY0QMYgAQYigUyBggCEEUYOTIGCAMQRRhAMgYIBBBFGDwyBggFEEUYPDIGCAYQRRg8MgYIBxBFGDzSAQgyODA0ajBqMagCALACAA&sourceid=chrome&ie=UTF-8");
      driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/div/span/a/h3")).click();
      driver.get("https://tjmaxx.tjx.com/store/index.jsp");
      WebDriverWait wait=new WebDriverWait(driver, 60);  //60 sec
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search-text-input")));
      driver.findElement(By.id("search-text-input")).click();
      driver.findElement(By.id("search-text-input")).sendKeys("white lamp");
      driver.findElement(By.id("search-submit-button")).click();
      JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("window.scrollBy(0,400)", "");
      Thread.sleep(1000);
      driver.findElement(By.xpath("//img[@alt='Scalloped Table Lamp']")).click();
      WebDriverWait wait1=new WebDriverWait(driver, 60);  //60 sec
      wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("addItemToOrder")));
      driver.findElement(By.id("addItemToOrder")).click();
      WebDriverWait wait2=new WebDriverWait(driver, 60);  //20 sec
      wait2.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("VIEW BAG")));
      driver.findElement(By.linkText("VIEW BAG")).click();
      WebDriverWait wait3=new WebDriverWait(driver, 60);  //20 sec
      wait3.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Remove")));
      driver.findElement(By.linkText("Remove")).click();
    }
}
