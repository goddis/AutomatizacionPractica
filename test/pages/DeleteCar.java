package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteCar {

    WebDriver driver;

    By carDelete = By.className("btn btn-default btn-xcrud btn-danger");

    //Constructor que recibe el objeto driver
    public DeleteCar(WebDriver driver) {
        this.driver = driver;
    }

    public void clickDeleteCar() {
        driver.findElement(carDelete).click();
    }

    //metodo que se usa en todos los casos de pruebas donde se necesite el login
    public void DeleteCarsClass() {

        this.clickDeleteCar();
    }
}
