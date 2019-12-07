package tester;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFb {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\VK\\chromedriver_win32\\chromedriver.exe");
		WebDriver webDriver=new ChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.get("https://www.facebook.com");
	}

}
