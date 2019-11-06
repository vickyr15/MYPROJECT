import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Practise {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\vignesh\\SelenPractice\\libr\\chromedriver.exe");
		WebDriver fx = new ChromeDriver();
		fx.get("https://facebook.com");
		fx.manage().window().maximize();
		WebElement fir = fx.findElement(By.xpath("//input[@name='firstname']"));
		WebElement sur = fx.findElement(By.xpath("//input[@name='lastname']"));
		JavascriptExecutor tk=(JavascriptExecutor)fx;
		tk.executeScript("arguments[0].setAttribute('value','vignesh')",fir );
		tk.executeScript("arguments[0].setAttribute('value','ragunathan')",sur );
		Object st = tk.executeScript("return arguments[0].getAttribute('value')", fir);
		Object ob = tk.executeScript("return arguments[0].getAttribute('value')", sur);
		  String s= (String)st;
		  System.out.println(s);
		  String d = (String)ob;
		  System.out.println(d);
		

	}

}
