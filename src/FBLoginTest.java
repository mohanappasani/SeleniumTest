import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLoginTest {
	WebDriver driver = null;

	@Before
	public void beforeEach() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
	}

	@After
	public void after() {
		driver.close();
	}

	@Test
	public void testLoginWithInvalidCredentials() throws InterruptedException {
		WebElement emailElement = driver.findElement(By.id("email"));
		WebElement passElement = driver.findElement(By.id("pass"));
		WebElement loginElement = driver.findElement(By.name("login"));

		emailElement.sendKeys("hari");
		passElement.sendKeys("hari");
		loginElement.click();

		Thread.sleep(9000);
		WebElement errormsgElement = driver.findElement(By.xpath("//*[@id=\"email_container\"]/div[2]"));
		String actualErrorMsg = errormsgElement.getText();
		String expectedMsg = "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";

		assertEquals(expectedMsg, actualErrorMsg);

	}

	@Test
	public void testLoginWithValidCredentials() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);

		WebElement emailElement = driver.findElement(By.id("email"));
		WebElement passElement = driver.findElement(By.id("pass"));
		WebElement loginElement = driver.findElement(By.name("login"));

		emailElement.sendKeys("mohan");
		passElement.sendKeys("mhonan");
		loginElement.click();

		Thread.sleep(9000);
		WebElement errormsgElement = driver.findElement(By.xpath("//*[@id=\"email_container\"]/div[2]"));
		String actualErrorMsg = errormsgElement.getText();
		String expectedMsg = "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";

		assertEquals(expectedMsg, actualErrorMsg);

	}

	@Test
	public void testLoginWithEmptyValues() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);

		WebElement emailElement = driver.findElement(By.id("email"));
		WebElement passElement = driver.findElement(By.id("pass"));
		WebElement loginElement = driver.findElement(By.name("login"));

		loginElement.click();

		Thread.sleep(9000);
		WebElement errormsgElement = driver.findElement(By.xpath("//*[@id=\"email_container\"]/div[2]"));
		String actualErrorMsg = errormsgElement.getText();
		String expectedMsg = "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";

		assertEquals(expectedMsg, actualErrorMsg);

	}

}
