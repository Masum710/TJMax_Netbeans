/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package tjmaxtest.com;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
public class SearchItemTest {
    private static WebDriver driver;
    private static String baseUrl;
    
    public SearchItemTest() {
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
    public void testTJMaxSearchItemTestCases() throws Exception {
    driver.get("https://www.google.com/search?gs_ssp=eJzj4tTP1TewNE8yLlZgNGB0YPBiK8nKTayoAABBwAYF&q=tjmaxx&oq=TjMax&gs_lcrp=EgZjaHJvbWUqFQgBEC4YJxjHARjJAxjRAxiABBiKBTIPCAAQIxgnGOMCGIAEGIoFMhUIARAuGCcYxwEYyQMY0QMYgAQYigUyBggCEEUYOTIKCAMQABiSAxiABDIGCAQQRRg8MgYIBRBFGDwyBggGEEUYPDIGCAcQRRg80gEIMzA0OGowajGoAgCwAgA&sourceid=chrome&ie=UTF-8");
    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/div/span/a/h3")).click();
    driver.get("https://tjmaxx.tjx.com/store/index.jsp");
    driver.findElement(By.id("search-text-input")).click();
    driver.findElement(By.id("search-submit-button")).click();
    driver.get("https://tjmaxx.tjx.com/store/shop/?_dyncharset=utf-8&initSubmit=true&Ntt=plants&qfh_sch=Search");
    driver.findElement(By.xpath("//img[@alt='4ft Rubber Plant In Matte Pot']")).click();
    driver.get("https://tjmaxx.tjx.com/store/jump/product/4ft-Rubber-Plant-In-Matte-Pot/1000847759?colorId=NS1357773&pos=1:3&Ntt=plants");
    driver.findElement(By.id("addItemToOrder")).click();
  }
}
