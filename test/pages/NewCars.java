package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class NewCars {

    WebDriver driver;

    //Elementos formulario
    By submitAdd = By.xpath("//*[@id=\"content\"]/div/form/button");
    By status = By.name("carstatus");
    By carName = By.name("carname");
    //By carDescription = By.xpath("/html/body");
    By carDescription = By.className("cke_editable cke_editable_themed cke_contents_ltr cke_show_borders");
    By stars = By.name("carstars");
    By carsDoors = By.name("doors");
    By carType = By.xpath("//*[@id=\"s2id_autogen21\"]");
    By buttonAdd = By.id("add");

    //Constructor que recibe el objeto driver
    public NewCars(WebDriver driver) {

        this.driver = driver;
    }

    public void clickSubmitNewCars() {
        driver.findElement(submitAdd).click();
    }

    public void setStatus(String strStatus) {
        driver.findElement(status).sendKeys(strStatus);
        //Select selectField= new Select(driver.findElement(status));
    }

    public void setCarName(String strCarName) {
        driver.findElement(carName).sendKeys(strCarName);
    }

//    public void setCarDescription(String strCarDescription) {
//        driver.findElement(carDescription).sendKeys(strCarDescription);
//    }
    public void setStars(String strStars) {
        driver.findElement(stars).sendKeys(strStars);
    }

    public void setCarsDoors(String strCarsDoors) {
        driver.findElement(carsDoors).sendKeys(strCarsDoors);
        //Select selectField= new Select(driver.findElement(carsDoors));
    }

    public void setCarType(String strCarType) {
        driver.findElement(carType).sendKeys(strCarType);
        //Select selectField= new Select(driver.findElement(carType));
    }
    public void clickNewCar() {
        driver.findElement(buttonAdd).click();
    }

    /**
     * This POM method will be exposed in test case to login in the application
     *
     * @param strStatus
     * @param strCarName
     * @param strCarDescription
     * @param strStars
     * @param strCarsDoors
     * @param strCarType
     * @return
     */
    //metodo que se usa en todos los casos de pruebas donde se necesiten guardar datos
    public void NewCarsClass(String strStatus, String strCarName, String strStars,
            String strCarsDoors, String strCarType) {

        this.clickSubmitNewCars();
        this.setStatus(strStatus);
        this.setCarName(strCarName);
        //this.setCarDescription(strCarDescription);
        this.setStars(strStars);
        this.setCarsDoors(strCarsDoors);
        this.setCarType(strCarType);
        this.clickNewCar();
    }
}
