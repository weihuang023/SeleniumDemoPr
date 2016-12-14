package seleniumDemoPk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemoClass {
	
    public static void main(String[] args) {
   
    System.setProperty("webdriver.gecko.driver","C:\\Users\\weih8\\git\\Selenium-Driver\\geckodriver-v0.11.1-win64\\geckodriver.exe");
	// declaration and instantiation of objects/variables
    WebDriver driver = new FirefoxDriver();
    String baseUrl = "http://www.facebook.com";
    String expectedTitle = "Facebook - Log In or Sign Up";
    String actualTitle = "";
    // launch Firefox and direct it to the Base URL
    driver.get(baseUrl);
    // get the actual value of the title
    actualTitle = driver.getTitle();

    // Open in Selenium
    driver.get(baseUrl);
    // Type
    driver.findElement(By.id("email")).sendKeys("weih81888@gmail.com");
    driver.findElement(By.id("pass")).sendKeys("wh3651728");
    driver.findElement(By.id("loginbutton")).click();
    /*
     * compare the actual title of the page witht the expected one and print
     * the result as "Passed" or "Failed"
     */
    if (actualTitle.contentEquals(expectedTitle)){
        System.out.println("Test Passed!");
    } else {
        System.out.println("Test Failed");
    }
   
    //close Firefox
    driver.close();
   
    // exit the program explicitly
    System.exit(0);
    
    }
}
