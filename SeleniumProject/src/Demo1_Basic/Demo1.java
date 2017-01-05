package Demo1_Basic;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.WebDriverHandler;

public class Demo1 {
	public static void main(String[] args) 
	{
		FirefoxDriver f = new WebDriver();
		f.close();
	}

}
