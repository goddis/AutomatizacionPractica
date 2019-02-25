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
import pages.DeleteCar;
import pages.LoginCars;
import static test.NewCarsTest.driver;

public class DeleteCarTest {

    //objetos
    static WebDriver driver;
    public String customerId;
    //inicialización de los objetos
    LoginCars objLogin = new LoginCars(driver);
    DeleteCar objEliminarCustomer = new DeleteCar(driver);

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
    public void test_DeleteCars() throws ParserConfigurationException, SAXException, IOException {

        objLogin = new LoginCars(driver);
        objLogin.login("admin@phptravels.com", "demoadmin");

        Alert alerta = driver.switchTo().alert();
        alerta.accept();
        //String ConfirmacionDelete = driver.switchTo().alert().getText() ;
        //Assert.assertTrue(ConfirmacionDelete.contains("Customer deleted Successfully"));
        //alerta.accept();
    }
}
