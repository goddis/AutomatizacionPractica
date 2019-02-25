package test;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.concurrent.TimeUnit;
import javax.xml.parsers.ParserConfigurationException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.xml.sax.SAXException;
import pages.LoginCars;
import pages.SearchCar;
import static test.DeleteCarTest.driver;
import static test.NewCarsTest.driver;

public class SearchCarTest {

    static WebDriver driver;
    LoginCars objLogin = new LoginCars(driver);
    SearchCar objSearch = new SearchCar(driver);

    @BeforeClass
    public static void setUpClass() {
        System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //configura los tiempos implicitos(tiempo de espera para cargar)
    }

    @Before
    public void setUp() {
        driver.get("https://www.phptravels.net/admin/cars");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void test_SearchCarTest() throws ParserConfigurationException, SAXException, IOException {

        objLogin = new LoginCars(driver);
        objLogin.login("admin@phptravels.com", "demoadmin");

        objSearch.SearchCarClass("Name", "BMW");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
