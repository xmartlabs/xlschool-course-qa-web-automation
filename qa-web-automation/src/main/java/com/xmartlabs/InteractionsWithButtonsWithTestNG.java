package com.xmartlabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class InteractionsWithButtonsWithTestNG {

    private WebDriver driver;


    @BeforeSuite
    public void initializeSuite(){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();

        System.out.println("Este texto se escribe desde el BeforeSuite.");
    }

    @AfterSuite
    public void dropDownSuite(){
        driver.close();
        driver.quit();

        System.out.println("Este texto se escribe desde el AfterSuite.");
    }

    @BeforeMethod
    public void initializeTest(){
        driver.get("https://demoqa.com/");

        System.out.println("Este texto se escribe desde el BeforeMethod.");
    }

    @AfterMethod
    public void dropDownTest(){

        System.out.println("Mensage que se ejecuta luego de cada test");
        
        System.out.println("Este texto se escribe desde el AfterMethod.");
    }












    @Test
    public void simpleTest() {

        WebElement buttonElements = driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div/div[1]/div/div[3]"));
        buttonElements.click();
        waiter(2000);
        //Llegamos a la pagina de "Elements"
        WebElement buttonRadioButton = driver.findElement(By.xpath("(//*[@id='item-2'])[1]"));
        buttonRadioButton.click();

        waiter(5000);
        //Comenzamos con la interacción con el radiobutton YES
        WebElement radioButtonYes = driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[2]/label"));
        if (radioButtonYes.isSelected() == true){
            System.out.println("El radio YES esta deseleccionado");
            System.out.println("Este texto se escribe desde el Primer test.");
            radioButtonYes.click();
        }else{
            System.out.println("El radio YES esta seleccionad, lo cual esta MAL");
        }
        waiter(5000);
    }

    @Test
    public void simpleTest2() {

        WebElement buttonElements = driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div/div[1]/div/div[3]"));
        buttonElements.click();
        waiter(2000);
        //Llegamos a la pagina de "Elements"
        WebElement buttonRadioButton = driver.findElement(By.xpath("(//*[@id='item-2'])[1]"));
        buttonRadioButton.click();

        waiter(5000);
        //Comenzamos con la interacción con el radiobutton YES
        WebElement radioButtonYes = driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[2]/label"));
        if (radioButtonYes.isSelected() == true){
            System.out.println("El radio YES esta seleccionado");
            System.out.println("Este texto se escribe desde el segundo test.");
            radioButtonYes.click();
        }else{
            System.out.println("El radio YES esta seleccionad, lo cual esta MAL");
        }
        waiter(5000);
    }


    public static void waiter(int pSeconds) {
        try {
            Thread.sleep(pSeconds);
        } catch (Exception e) {
            System.out.println("Algo ocurrió");
        }
    }
}
