import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practical {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\vignesh\\SelenPractice\\libr\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.toolsqa.com/automation-practice-form");
        WebElement ent1 = dr.findElement(By.id("selenium_commands"));
        Select s = new Select(ent1);
        s.selectByVisibleText("Browser Commands");
        s.selectByIndex(2);
        s.selectByIndex(3);
        boolean mul = s.isMultiple();
        System.out.println(mul);
        List<WebElement> li = s.getOptions();
        for(int i=0;i<li.size();i++)
        {
		WebElement x = li.get(i);
		String txt = x.getText();
        System.out.println(txt);
        s.selectByVisibleText(txt);



}
	}
}