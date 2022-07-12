package Selenium_Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Types {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\elcot\\eclipse-workspace\\Selenium_ConceptsP\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();

		// Single frame
		WebElement single = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(single); //from window to frame
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Single Frame");
		Thread.sleep(3000);
		driver.switchTo().defaultContent(); //from frame to window
		// Multiple Frame
		driver.findElement(By.xpath("//a[@href='#Multiple']")).click();

		WebElement Parent = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(Parent);
		WebElement Child = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
		driver.switchTo().frame(Child);
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Selenium");
	}

}
