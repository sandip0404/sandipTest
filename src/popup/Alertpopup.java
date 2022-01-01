package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\TP\\new CD\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		
		Alert alt = driver.switchTo().alert();
		
		System.out.println(alt.getText());
		Thread.sleep(2000);
//		alt.dismiss();
//		Thread.sleep(2000);
		alt.accept();
		Thread.sleep(2000);
		alt.accept();
		Thread.sleep(2000);
		
        driver.close();
		
		
	}

}
