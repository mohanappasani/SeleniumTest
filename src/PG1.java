import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;
public class PG1 {


    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    	//System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		System.setProperty("webdriver.chrome.driver","E:\\workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        By b = By.name("userName");
        WebElement userNameEle = driver.findElement(b);
        userNameEle.sendKeys("Mohan");
        
        WebElement pwdEle = driver.findElement(By.name("password"));
        pwdEle.sendKeys("Mohan");
        
        WebElement submitEle = driver.findElement(By.name("submit"));
        submitEle.click();
        
        WebElement loginSuccessEle = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3"));
        String logMsg = loginSuccessEle.getText();
        
        if (logMsg.contentEquals("Login Successfully")){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        
        //close Fire fox
        driver.close();
       
    }

}