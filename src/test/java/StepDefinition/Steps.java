package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	WebDriver driver;
	
	@Given("Abrir Chrome")
	public void abrir_Chrome() {
	    
		System.setProperty("webdriver.chrome.driver", "D:\\Iplacex\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/Web-Banco/index.jsp");
	    
	}

	@When("ingresar Username {string} y Password {string}")
	public void ingresar_Username_y_Password(String string, String string2) {
	  
	    driver.findElement(By.id("username")).sendKeys(string);
	    driver.findElement(By.id("password")).sendKeys(string2);
	}

	@Then("inicia session")
	public void inicia_session() {
	  
	    driver.findElement(By.id("buttonLogin")).click();
	}
	
	@Given("Cerrar Chrome")
	public void cerrar_Chrome() {
	   
		driver.close();
	}

	@When("Ingresar Username falso {string} y Password {string}")
	public void ingresar_Username_falso_y_Password(String string, String string2) {	   
		driver.findElement(By.id("username")).sendKeys(string);
	    driver.findElement(By.id("password")).sendKeys(string2);
	}
}
