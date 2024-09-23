package com.mvn;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class FirstDemo {
public AndroidDriver driver;
@Test
public void test() throws InterruptedException, MalformedURLException {
	UiAutomator2Options options=new UiAutomator2Options();
	options.setDeviceName("Swara");
	options.setApp("D:\\Appium\\apk file\\ApiDemos-debug.apk");
//	options.setApp("H:\\apk file\\General-Store.apk");
	 driver=new AndroidDriver
			(new URL("http://127.0.0.1:4723/"),options);
	 //implicit wait
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Thread.sleep(3000);
	driver.quit();

}
}
