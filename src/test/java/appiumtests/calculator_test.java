package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class calculator_test {
static AppiumDriver driver;
	public static void main(String[] args) throws Exception {
		open_calculator();

	}
	
	public static <MobileElement> void open_calculator() throws Exception {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Redmi Note 10 Lite");
		cap.setCapability("udid", "98b8bd16");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11 RKQ1.200826.002");
		
		cap.setCapability("appPackage", "com.miui.calculator");
		cap.setCapability("appAcitivity", "com.miui.calculator.cal.CalculatorActivity");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		
	}

}
