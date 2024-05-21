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
public class ContinueShoppingTest {
    private static WebDriver driver;
    private static String baseUrl;
    
    public ContinueShoppingTest() {
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
    public void testContinueShoppingTestCases1() throws Exception {
    driver.get("https://www.google.com/search?gs_ssp=eJzj4tTP1TewNE8yLlZgNGB0YPBiK8nKTayoAABBwAYF&q=tjmaxx&oq=TjMax&gs_lcrp=EgZjaHJvbWUqFQgBEC4YJxjHARjJAxjRAxiABBiKBTIPCAAQIxgnGOMCGIAEGIoFMhUIARAuGCcYxwEYyQMY0QMYgAQYigUyBggCEEUYOTIGCAMQRRhAMgYIBBBFGDwyBggFEEUYPDIGCAYQRRg8MgYIBxBFGDzSAQgyODAwajBqMagCALACAA&sourceid=chrome&ie=UTF-8");
    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/div/span/a/h3")).click();
    driver.get("https://tjmaxx.tjx.com/store/index.jsp");
    driver.findElement(By.id("usmm-tl-cat5830001p")).click();
    driver.findElement(By.linkText("Carry-On Luggage")).click();
    driver.get("https://tjmaxx.tjx.com/store/shop/beauty-accessories-luggage-travel-carry-on-luggage/_/N-2327021090?mm=beauty+%26+accessories%3Af%3A+%3A2%3ACarry-On+Luggage%3ALuggage+%26+Travel");
    driver.findElement(By.xpath("//div[@id='style-1000891705']/div/div/a/img[2]")).click();
    driver.get("https://tjmaxx.tjx.com/store/jump/product/beauty-accessories-luggage-travel-carry-on-luggage/19in-Hardside-Carry-on-Spinner/1000891705?colorId=NS1003495&pos=1:3&N=2327021090");
    driver.findElement(By.id("addItemToOrder")).click();
    driver.findElement(By.linkText("KEEP SHOPPING")).click();
    driver.get("https://tjmaxx.tjx.com/store/shop/beauty-accessories-luggage-travel-carry-on-luggage/_/N-2327021090?mm=beauty+%26+accessories%3Af%3A+%3A2%3ACarry-On+Luggage%3ALuggage+%26+Travel");
    driver.findElement(By.xpath("//*[@id=\"style-1000916188\"]/div/div[1]/a/img[2]")).click();
    driver.get("https://tjmaxx.tjx.com/store/jump/product/beauty-accessories-luggage-travel-carry-on-luggage/21in-Tokyo-Hardside-Carry-on-Spinner/1000916190?colorId=NS1104086&pos=1:7&N=2327021090");
    driver.findElement(By.id("addItemToOrder")).click();
  }
}
