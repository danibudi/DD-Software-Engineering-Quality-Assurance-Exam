package co.danail.selenium.exam;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		
		//Test Case 1: Successful Login
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Danail\\Documents\\Software Quality Assurance Exam\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.className("radius")).click();
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://the-internet.herokuapp.com/secure";
		
		
		if(actualUrl.equals(expectedUrl)) {
			System.out.println("Test Case 1 Successful");
		}else {
			System.out.println("Test Case 1 Failed");
		}
		driver.close();
	}	
}
