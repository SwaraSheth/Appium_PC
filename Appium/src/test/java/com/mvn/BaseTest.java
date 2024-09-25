package com.mvn;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseTest {
public AndroidDriver driver;

@BeforeTest
public void before() throws MalformedURLException, InterruptedException {
	UiAutomator2Options options=new UiAutomator2Options();
	options.setDeviceName("Swara");
	options.setApp("D:\\Appium\\apk file\\ApiDemos-debug.apk");
//	options.setApp("D:\\Appium\\apk file\\General-Store.apk");
	 driver=new AndroidDriver
			(new URL("http://127.0.0.1:4723/"),options);
	 //implicit wait
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Thread.sleep(2000);
}

//Drag & Drop
public void dragndrop(WebElement source) {
	((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
		    "elementId", ((RemoteWebElement) source).getId(),
		    "endX", 719,
		    "endY", 960));
}

//Long Press
public void longPressAction(WebElement ele)
{
	((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
			ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
					"duration",2000));
}

@AfterTest
public void tearDown() throws InterruptedException {
	driver.quit();
	Thread.sleep(2000);
}
}
