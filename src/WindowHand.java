import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHand {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\vignesh\\SelenPractice\\libr\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement input = driver.findElement(By.id("inputValEnter"));
		input.sendKeys("iphone7");
		WebElement clik = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
		clik.click();
		WebElement iph = driver.findElement(By.xpath("(//img[@src='https://n2.sdlcdn.com/imgs/c/2/9/230X258_sharpened/Apple-iPhone-7-32GB-Black-SDL820775791-1-93e75.webp'])[1]"));
		iph.click();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		WebElement cart = driver.findElement(By.xpath("//span[text()='add to cart']"));
		cart.click();
        driver.switchTo().window(parent);
        driver.close();
	}

}
