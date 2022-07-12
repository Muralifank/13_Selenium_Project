package Selenium_Tasks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Types {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\elcot\\eclipse-workspace\\Selenium_ConceptsP\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
		// Simple Alert
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		Thread.sleep(3000);
		Alert a = driver.switchTo().alert();
		a.accept();

		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		Thread.sleep(3000);
		Alert b = driver.switchTo().alert();
		b.dismiss();

		// Prompt Alert
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']")).click();
		Thread.sleep(3000);
		Alert c = driver.switchTo().alert();
		c.sendKeys("Murali's Automation");
		String d = c.getText();
		System.out.println(d);
		c.accept();

	}

}
