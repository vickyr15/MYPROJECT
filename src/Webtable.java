import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\vignesh\\SelenPractice\\libr\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement em = driver.findElement(By.id("email"));
		em.sendKeys("vigneshagunathr@gmail.com");
		WebElement pas = driver.findElement(By.id("pass"));
		pas.sendKeys("starvignesh");
		WebElement btn = driver.findElement(By.xpath("//input[@value='Log In']"));
		btn.click();
		System.out.println("Test Case 1 Success");
		driver.close();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\vignesh\\SelenPractice\\libr\\chromedriver.exe");
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://www.facebook.com/");
		WebElement em2 = driver2.findElement(By.id("email"));
		em2.sendKeys("vigneshragunathr@gmail.com");
		WebElement pas2 = driver2.findElement(By.id("pass"));
		pas2.sendKeys("starvignesh");
		WebElement btn2 = driver2.findElement(By.xpath("//input[@value='Log In']"));
		btn2.click();
		System.out.println("Test Case 2 Success");
		driver2.close();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\vignesh\\SelenPractice\\libr\\chromedriver.exe");
		WebDriver driver3 = new ChromeDriver();
		driver3.get("https://www.facebook.com/");
		WebElement em3 = driver3.findElement(By.id("email"));
		em3.sendKeys("vigneshragunathr@gmail.com");
		WebElement pas3 = driver3.findElement(By.id("pass"));
		pas3.sendKeys("stavignesh");
		WebElement btn3 = driver3.findElement(By.xpath("//input[@value='Log In']"));
		btn3.click();
		System.out.println("Test Case 3 Success");
		driver3.close();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\vignesh\\SelenPractice\\libr\\chromedriver.exe");
		WebDriver driver4 = new ChromeDriver();
		driver4.get("https://www.facebook.com/");
		WebElement em4 = driver4.findElement(By.id("email"));
		em4.sendKeys("vigneshragunathr@gmail.com");
		WebElement pas4 = driver4.findElement(By.id("pass"));
		pas4.sendKeys("starvignesh");
		WebElement btn4 = driver4.findElement(By.xpath("//input[@value='Log In']"));
		btn4.click();
		System.out.println("Test Case 4 Success");
		driver4.close();
	}
}
		
