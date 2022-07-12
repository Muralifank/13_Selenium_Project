package Selenium_Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\elcot\\eclipse-workspace\\Selenium_ConceptsP\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Casting(Narrowing)

		// WebDriver Methods
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();

		String title = driver.getTitle(); // to get title
		System.out.println(title);

		String currentUrl = driver.getCurrentUrl(); // to get currentUrl
		System.out.println(currentUrl);

		// Navigation Methods
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

		Thread.sleep(3000);
		driver.close();

	}

}
