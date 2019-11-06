import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robo {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\vignesh\\SelenPractice\\libr\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://demo.guru99.com/test/guru99home/");
		WebElement fra = dr.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		fra.click();
		
		

	}

}
