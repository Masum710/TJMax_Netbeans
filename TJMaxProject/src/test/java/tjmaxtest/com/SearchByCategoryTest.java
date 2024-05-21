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
public class SearchByCategoryTest {
    private static WebDriver driver;
    private static String baseUrl;
    
    public SearchByCategoryTest() {
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
    public void testTJMaxSearchByCategoryTestCases1() throws Exception {
    driver.get("https://www.google.com/search?gs_ssp=eJzj4tTP1TewNE8yLlZgNGB0YPBiK8nKTayoAABBwAYF&q=tjmaxx&oq=&gs_lcrp=EgZjaHJvbWUqDwgAEC4YJxjHARjqAhjRAzIPCAAQLhgnGMcBGOoCGNEDMg8IARAuGCcYxwEY6gIY0QMyDwgCEC4YJxjHARjqAhjRAzIPCAMQLhgnGMcBGOoCGNEDMgkIBBAjGCcY6gIyCQgFECMYJxjqAjIJCAYQIxgnGOoCMgkIBxAjGCcY6gLSAQoyODE1MzhqMGoxqAIIsAIB&sourceid=chrome&ie=UTF-8");
    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/div/span/a/h3")).click();
    driver.get("https://tjmaxx.tjx.com/store/index.jsp");
    driver.findElement(By.id("usmm-tl-cat260062")).click();
    driver.get("https://tjmaxx.tjx.com/store/shop/women/_/N-2107733895?tn=2");
    driver.findElement(By.xpath("//div[@id='endeca-main']/div[2]/div/div[2]/ul/li[5]/a")).click();
    driver.get("https://tjmaxx.tjx.com/store/shop/womens-beauty/_/N-3242054037?ln=5:1");
    driver.findElement(By.xpath("//div[@id='endeca-main']/div[2]/div/div[2]/ul/li[5]/a")).click();
    driver.get("https://tjmaxx.tjx.com/store/shop/womens-perfume/_/N-944410246?ln=5:2");
    driver.findElement(By.xpath("//span[@id='product-brand-1000891758']/span")).click();
    driver.findElement(By.xpath("//img[@alt='Made In France 6.7oz Aqua Allegoria Pera Granita Pear Eau De Toilette']")).click();
    driver.get("https://tjmaxx.tjx.com/store/jump/product/women-beauty-perfume/Made-In-France-6.7oz-Aqua-Allegoria-Pera-Granita-Pear-Eau-De-Toilette/1000891758?colorId=NS1003538&pos=1:2&N=944410246");
    driver.findElement(By.id("addItemToOrder")).click();
    driver.findElement(By.linkText("VIEW BAG")).click();
    driver.get("https://tjmaxx.tjx.com/store/checkout/cart.jsp");
  }

}
