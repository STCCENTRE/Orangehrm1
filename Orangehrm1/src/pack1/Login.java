package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","C:\\selenium projects\\geckodriver-w0.29.0-win64\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://localhost/orangehrm1/web/index.php/auth/login");
	}

}
