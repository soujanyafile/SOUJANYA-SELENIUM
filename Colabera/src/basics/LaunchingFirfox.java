package basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingFirfox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lichi\\Downloads\\chromedriver_win32\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	}

}
