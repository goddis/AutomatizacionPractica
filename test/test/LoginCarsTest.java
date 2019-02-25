package test;

import java.util.concurrent.TimeUnit;
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
import org.openqa.selenium.support.ui.WebDriverWait;
//import pages.HomePage;
import pages.LoginCars;

public class LoginCarsTest {

    //objetos de login
    static WebDriver driver;
    LoginCars objLogin;
    // HomePage objHomePage;

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
    public void test_Home_Page_Appear_Correct() {
        objLogin = new LoginCars(driver);
        objLogin.login("admin@phptravels.com", "demoadmin");
    }

}
