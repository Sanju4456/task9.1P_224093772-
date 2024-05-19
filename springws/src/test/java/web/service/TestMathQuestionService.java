package web.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.After;

import web.service.MathQuestionService;

public class TestMathQuestionService {

	@Test
	public void testTrueAdd() {
		Assert.assertEquals(MathQuestionService.q1Addition("1", "2"), 3, 0);
	}

		
//	  @Test
//	    public void testAddNumber1Empty() {
//	        assertNull(MathQuestionService.q1Addition("", "6"));
//	    }
//	    

	    public void testQ1AdditionValidInputs() {
	        assertEquals(5.0, MathQuestionService.q1Addition("2", "3"), 0.0);
	        assertEquals(0.0, MathQuestionService.q1Addition("2.5", "-2.5"), 0.0);
	    }

	    @Test
	    public void testQ1AdditionInvalidInputs() {
	        assertThrows(IllegalArgumentException.class, () -> {
	            MathQuestionService.q1Addition("abc", "3");
	        });

	        assertThrows(IllegalArgumentException.class, () -> {
	            MathQuestionService.q1Addition("2", "xyz");
	        });

	        assertThrows(IllegalArgumentException.class, () -> {
	            MathQuestionService.q1Addition("abc", "xyz");
	        });
	    }

	    @Test
	    public void testQ2SubtractionValidInputs() {
	        assertEquals(1.0, MathQuestionService.q2Subtraction("3", "2"), 0.0);
	        assertEquals(5.0, MathQuestionService.q2Subtraction("2.5", "-2.5"), 0.0);
	    }

	    @Test
	    public void testQ2SubtractionInvalidInputs() {
	        assertThrows(IllegalArgumentException.class, () -> {
	            MathQuestionService.q2Subtraction("abc", "2");
	        });

	        assertThrows(IllegalArgumentException.class, () -> {
	            MathQuestionService.q2Subtraction("3", "xyz");
	        });

	        assertThrows(IllegalArgumentException.class, () -> {
	            MathQuestionService.q2Subtraction("abc", "xyz");
	        });
	    }
	    private WebDriver driver;

	    @Before
	    public void setUp() {
	        // Ensure to set the correct path to your chromedriver executable
	        System.setProperty("webdriver.chrome.driver", "C:/Users/sanju/chromedriver-win64 (1)/chromedriver-win64/chromedriver.exe");

	        // Initialize ChromeDriver
	        driver = new ChromeDriver();
	    }

	    @After
	    public void tearDown() {
	        // Quit the WebDriver after each test method
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	    @Test
	    public void testLoginPage() {
	        driver.get("http://localhost:8080/login");

	       
	        
	        WebElement username = driver.findElement(By.name("username"));
	        WebElement password = driver.findElement(By.name("passwd"));
	        WebElement dob = driver.findElement(By.name("dob"));

	        username.sendKeys("user");
	        password.sendKeys("pass");
	        dob.sendKeys("11-01-0001");

	        driver.findElement(By.cssSelector("input[type='submit']")).click();

	        // Check if redirected to Q1 page
	        //sertTrue(driver.getCurrentUrl().contains("http://localhost:8080/q1"));
	    }
	    @Test
	    public void testQ1Page() {
	        // Navigate to Q1 page
	        driver.get("http://localhost:8080/q1");

	        // Fill the Q1 form
	        WebElement number1Field = driver.findElement(By.name("number1"));
	        WebElement number2Field = driver.findElement(By.name("number2"));
	        WebElement resultField = driver.findElement(By.name("result"));
	       

	        number1Field.sendKeys("2");
	        number2Field.sendKeys("3");
	        resultField.sendKeys("5");
	        driver.findElement(By.cssSelector("input[type='submit']")).click();
	        // Check if redirected to Q2 page
	       //ssertTrue(driver.getCurrentUrl().contains("http://localhost:8080/q2"));
	    }

	    @Test
	    public void testQ2Page() {
	        // Navigate to Q2 page
	        driver.get("http://localhost:8080/q2");

	        // Fill the Q2 form
	        WebElement number1Field = driver.findElement(By.name("number1"));
	        WebElement number2Field = driver.findElement(By.name("number2"));
	        WebElement resultField = driver.findElement(By.name("result"));
	     

	        number1Field.sendKeys("5");
	        number2Field.sendKeys("3");
	        resultField.sendKeys("2");
	       
	        driver.findElement(By.cssSelector("input[type='submit']")).click();
	        // Check if redirected to Q3 page
	       //ssertTrue(driver.getCurrentUrl().contains("http://localhost:8080/q3"));
	    }
	   
}
