 package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","E:\\selenium\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		//open URL-ORANGE-HRM
		driver.get("http://localhost/orangehrm/web/index.php/auth/login");

	}

}
