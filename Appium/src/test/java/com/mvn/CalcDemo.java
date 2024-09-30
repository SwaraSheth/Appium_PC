package com.mvn;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;

public class CalcDemo {
	@Test
public void openCalc() throws MalformedURLException, InterruptedException {
	DesiredCapabilities cap=new DesiredCapabilities();

	cap.setCapability("deviceName", "oneplus-iv2201");
	cap.setCapability("udid","X4DIIV4TZPWGNJQ4");
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", "13.0");
	cap.setCapability( "appPackage","com.oneplus.calculator");
	cap.setCapability("appActivity","com.android.calculator2.Calculator");
	cap.setCapability("automationName", "UIAutomator2");

	URL url=new URL("http://127.0.0.1:4723/");
	
	AppiumDriver driver=new AppiumDriver(url, cap);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
//	Addition
	
	driver.findElement(By.id("com.oneplus.calculator:id/digit_1")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.id("com.oneplus.calculator:id/img_op_add")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.id("com.oneplus.calculator:id/digit_2")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.id("com.oneplus.calculator:id/eq")).click();
	Thread.sleep(1000);
	
	String ansString=driver.findElement(By.id("com.oneplus.calculator:id/result")).getText();
	
	System.out.println("Ans is : "+ansString);
	Thread.sleep(1000);
	
	driver.quit();
	
}
}
