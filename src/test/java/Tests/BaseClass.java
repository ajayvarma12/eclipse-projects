package Tests;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	AppiumDriver driver;

	@BeforeTest
	public void setup() {
		try {
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "");
			caps.setCapability(MobileCapabilityType.UDID, "");
			caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
			caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
			URL url = new URL("https://127.0.0.1:4723/wd/hub");

			driver = new AppiumDriver(url, caps);

		} catch (Exception exp) {
			System.out.println("cause is " + exp.getCause());
			System.out.println("messege is " + exp.getMessage());
			exp.getStackTrace();

		}

	}

	@AfterTest

	public void teardown() {
		
		driver.close();
		driver.quit();
	}
}
