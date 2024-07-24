package Mouseactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class rightClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.findElement(By.xpath("//span[text()='Copy']"));
		WebElement rightClick=driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act = new Actions(driver);
		act.contextClick(rightClick).perform();
		WebElement copy= driver.findElement(By.xpath("//span[text()='Copy']"));
		copy.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.switchTo().alert().accept();
		driver.quit();

	}

}
