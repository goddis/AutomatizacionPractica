package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchCar {

    WebDriver driver;

    //Elementos formulario
    By submitSearch = By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/div[1]/div[3]/a");
    By campoBuscar = By.name("phrase");
    By columnSearch = By.name("column");
    By buttonSearch = By.cssSelector(".xcrud-action.btn.btn-primary");

    //Constructor que recibe el objeto driver
    public SearchCar(WebDriver driver) {

        this.driver = driver;
    }

    public void clickSubmitSearch() {
        driver.findElement(submitSearch).click();
    }

    public void setSearch(String strSearch) {
        driver.findElement(campoBuscar).sendKeys(strSearch);
    }

    public void setColumnaBuscar(String strColumnSearch) {
        driver.findElement(columnSearch).sendKeys(strColumnSearch);
    }

    public void clickSearch() {
        driver.findElement(buttonSearch).click();
    }

    /**
     * This POM method will be exposed in test case to login in the application
     *
     * @param strSearch
     * @param strColumnSearch
     * @return
     */
    //metodo que se usa en todos los casos de pruebas donde se necesiten guardar datos
    public void SearchCarClass(String strColumnSearch, String strSearch) {
        this.clickSubmitSearch();
        this.setColumnaBuscar(strColumnSearch);
        this.setSearch(strSearch);
        this.clickSearch();
    }
}
