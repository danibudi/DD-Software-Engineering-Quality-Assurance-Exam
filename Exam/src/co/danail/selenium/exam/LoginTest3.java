package co.danail.selenium.exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest3 {

	public static void main(String[] args) {
		//Test Case 2: Correct User Name but Incorrect Password
		
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Danail\\Documents\\Software Quality Assurance Exam\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://the-internet.herokuapp.com/login");
				driver.manage().window().maximize();
				driver.get("https://the-internet.herokuapp.com/login");
				driver.manage().window().maximize();
				driver.findElement(By.id("username")).sendKeys("tomsmith");
				driver.findElement(By.id("password")).sendKeys("SuperSecretAndWrongPassword!");
				driver.findElement(By.className("radius")).click();	
				String actualPopupText = driver.findElement(By.id("flash")).getText();
				String expectedPopupKeyword1 = "password";
				String expectedPopupKeyword2 = "invalid";
						
				if((actualPopupText.toLowerCase().indexOf(expectedPopupKeyword1.toLowerCase()) != -1)&& (actualPopupText.toLowerCase().indexOf(expectedPopupKeyword2.toLowerCase()) != -1)) {
					System.out.println("Test Case 3 Successful");
				} else {
					System.out.println("Test Case 3 Failed");
				}
						
				driver.close();
	}

}
