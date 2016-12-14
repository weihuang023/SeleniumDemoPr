package seleniumDemoPk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class SeleniumDemoClass {
	
    public static void main(String[] args) {
   
    System.setProperty("webdriver.gecko.driver","C:\\Users\\loadtest\\Desktop\\Eclipse\\geckodriver.exe");
	// declaration and instantiation of objects/variables
    WebDriver driver = new FirefoxDriver();
    WebDriverWait myWaitVar = new WebDriverWait(driver,10);
    
    String baseUrl = "http://www.facebook.com";
    String expectedTitle = "Facebook - Log In or Sign Up";
    String actualTitle = "";

    // launch FF and direct it to the Base URL
    driver.get(baseUrl);
    // get the actual value of the title
    actualTitle = driver.getTitle();
    System.out.println(driver.getCurrentUrl());

    // Open in Selenium
    driver.get(baseUrl);
    // Type
    myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
   
    WebElement textbox_email = driver.findElement(By.id("email"));
    try{
    if(textbox_email.isEnabled()){
    	textbox_email.sendKeys("weih81888@gmail.com");
    }
    }
    catch(NoSuchElementException nsee){
    	System.out.println(nsee.toString());
    }
    
    
    //do {
    driver.findElement(By.id("pass")).sendKeys("wh3651728");
    driver.findElement(By.id("loginbutton")).click();
   //} while (driver.findElement(By.id("pass")).isDisplayed());
    
    

    /*
     * compare the actual title of the page witht the expected one and print
     * the result as "Passed" or "Failed"
     */
  
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    
    if (actualTitle.contentEquals(expectedTitle)){
        System.out.println("Test Passed!");
    } else {
        System.out.println("Test Failed");
    }
//    driver.navigate().refresh();
//    driver.navigate().forward();
//    driver.navigate().back();
    //close Firefox

    //driver.get("http://www.popuptest.com/popuptest2.html");
    //driver.close();
//    driver.get("http://demo.guru99.com/selenium/deprecated.html");
//    driver.switchTo().frame("classFrame");
//    driver.findElement(By.linkText("Deprecated")).click();
    
    String alertMessage = "";
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    
    driver.get("http://jsbin.com/usidix/1");
    driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
    if (myWaitVar.until(ExpectedConditions.alertIsPresent())!= null){
    System.out.println("Alert is present!");
    }
    alertMessage = driver.switchTo().alert().getText();
    driver.switchTo().alert().accept();
   
    System.out.println(alertMessage);
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    
    driver.quit();
    
    
    // exit the program explicitly
    // System.exit(0);
    
    }
}
