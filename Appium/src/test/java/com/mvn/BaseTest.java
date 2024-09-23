package com.mvn;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseTest {
public AndroidDriver driver;

@BeforeTest
public void before() throws MalformedURLException, InterruptedException {
	UiAutomator2Options options=new UiAutomator2Options();
	options.setDeviceName("Swara");
//	options.setApp("D:\\Appium\\apk file\\ApiDemos-debug.apk");
	options.setApp("D:\\Appium\\apk file\\General-Store.apk");
	 driver=new AndroidDriver
			(new URL("http://127.0.0.1:4723/"),options);
	 //implicit wait
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Thread.sleep(2000);
}

@AfterTest
public void tearDown() throws InterruptedException {
	driver.quit();
	Thread.sleep(2000);
}
}
