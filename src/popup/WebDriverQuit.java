package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverQuit {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\TP\\new CD\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(5000);
		//driver.close();
		
		driver.quit();
		
	}

}
