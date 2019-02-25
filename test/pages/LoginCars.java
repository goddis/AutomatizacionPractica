package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginCars {

    WebDriver driver; //objeto driver para la pantalla

    //Elementos de la pantalla
    By Email = By.name("email");
    By password = By.name("password");
    By login = By.xpath("/html/body/div/form[1]/button");

    //Constructor que recibe el objeto driver
    public LoginCars(WebDriver driver) {

        this.driver = driver;
    }

    //Set user name in textbox
    public void setEmail(String strEmail) {
        driver.findElement(Email).sendKeys(strEmail);
    }

    //Set password in password textbox
    public void setPassword(String strPassword) {
        driver.findElement(password).sendKeys(strPassword);
    }

    //Click on login button
    public void clickLoginCars() {
        driver.findElement(login).click();
    }

    /**
     * This POM method will be exposed in test case to login in the application
     *
     * @param strUserName
     * @param strPasword
     * @return
     */
    //metodo que se usa en todos los casos de pruebas donde se necesite el login
    public void login(String strUserName, String strPasword) {

        this.setEmail(strUserName);
        this.setPassword(strPasword);
        this.clickLoginCars();
    }

}
