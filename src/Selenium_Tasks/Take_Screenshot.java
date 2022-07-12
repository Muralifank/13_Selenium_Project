package Selenium_Tasks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Take_Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\elcot\\eclipse-workspace\\Selenium_ConceptsP\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// Launch chrome
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();// maximize
		Thread.sleep(3000);

		// Screenshot Method
		TakesScreenshot ts = (TakesScreenshot) driver; // Narrowing concept
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\elcot\\eclipse-workspace\\Selenium_ConceptsP\\Driver\\Snaps.png");
		FileUtils.copyFile(source, destination); // throws declaration

	}
}
