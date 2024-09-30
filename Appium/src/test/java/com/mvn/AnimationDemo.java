package com.mvn;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class AnimationDemo extends BaseTest{
	
@Test
	public void animation() throws InterruptedException {
	
	driver.findElement(AppiumBy.accessibilityId("Animation")).click();
	Thread.sleep(2000);
	
//	driver.findElement(AppiumBy.accessibilityId("Bouncing Balls")).click();
//	Thread.sleep(5000);
//	
//	driver.navigate().back();
//	Thread.sleep(2000);
//	
//	driver.findElement(AppiumBy.accessibilityId("Cloning")).click();
//	Thread.sleep(2000);
//	
//	driver.findElement(AppiumBy.accessibilityId("Run")).click();
//	Thread.sleep(5000);
//	
//	driver.navigate().back();
//	Thread.sleep(2000);
//	
//	driver.findElement(AppiumBy.accessibilityId("Custom Evaluator")).click();
//	Thread.sleep(2000);
//	
//	driver.findElement(AppiumBy.accessibilityId("Play")).click();
//	Thread.sleep(5000);
//	
//	driver.navigate().back();
//	Thread.sleep(2000);
//	
//	driver.findElement(AppiumBy.accessibilityId("Default Layout Animations")).click();
//	Thread.sleep(2000);
//	
//	for (int i = 0; i < 6; i++) {
//		
//		driver.findElement(AppiumBy.accessibilityId("Add Button")).click();;
//		Thread.sleep(1000);
//	}
//	
//	driver.navigate().back();
//	Thread.sleep(2000);
//	
//	driver.findElement(AppiumBy.accessibilityId("Events")).click();
//	Thread.sleep(2000);
//	
//	driver.findElement(AppiumBy.accessibilityId("Play")).click();
//	driver.findElement(AppiumBy.accessibilityId("Cancel")).click();
//	Thread.sleep(3000);
//	
//	driver.findElement(AppiumBy.accessibilityId("Play")).click();
//	Thread.sleep(1000);
//	driver.findElement(By.id("io.appium.android.apis:id/endButton")).click();
//	Thread.sleep(3000);
//	
//	driver.findElement(AppiumBy.accessibilityId("End Immediately")).click();
//	driver.findElement(AppiumBy.accessibilityId("Play")).click();
//	Thread.sleep(3000);
//	
//	driver.navigate().back();
//	Thread.sleep(2000);
//	
//	driver.findElement(AppiumBy.accessibilityId("Hide-Show Animations")).click();
//	Thread.sleep(2000);
//	
//	driver.findElement(AppiumBy.accessibilityId("Custom Animations")).click();
//	Thread.sleep(3000);
//	
//	for (int i = 0; i < 4; i++) {
//		
//		driver.findElement(By.xpath("//android.widget.Button[@text='"+i+"']")).click();
//	}
//	
//	driver.findElement(AppiumBy.accessibilityId("Show Buttons")).click();
//	Thread.sleep(3000);
//	
//	driver.findElement(AppiumBy.accessibilityId("Custom Animations")).click();
//	Thread.sleep(3000);
//	
//	driver.findElement(AppiumBy.accessibilityId("Hide (GONE)")).click();
//	Thread.sleep(3000);
//	
//	for (int i = 0; i < 4; i++) {
//		
//		driver.findElement(By.xpath("//android.widget.Button[@text='"+i+"']")).click();
//	}
//	
//	driver.findElement(AppiumBy.accessibilityId("Show Buttons")).click();
//	Thread.sleep(3000);
//	
//	driver.navigate().back();
//	Thread.sleep(2000);
//	
//	driver.findElement(AppiumBy.accessibilityId("Layout Animations")).click();
//	Thread.sleep(3000);
//	
//	driver.findElement(AppiumBy.accessibilityId("Custom Animations")).click();
//	Thread.sleep(2000);
//	
//	for (int i = 0; i <=10; i++) {
//		
//		driver.findElement(AppiumBy.accessibilityId("Add Button")).click();
//		Thread.sleep(1000);
//	}
//	
//	driver.navigate().back();
//	Thread.sleep(2000);
//	
//	driver.findElement(AppiumBy.accessibilityId("Loading")).click();
//	Thread.sleep(3000);
//	
//	driver.findElement(AppiumBy.accessibilityId("Run")).click();
//	Thread.sleep(2000);
//	
//	driver.navigate().back();
//	Thread.sleep(2000);
//	
//	driver.findElement(AppiumBy.accessibilityId("Multiple Properties")).click();
//	Thread.sleep(3000);
//	
//	driver.findElement(AppiumBy.accessibilityId("Run")).click();
//	Thread.sleep(2000);
//	
//	driver.navigate().back();
//	Thread.sleep(2000);
//	
//	driver.findElement(AppiumBy.accessibilityId("Reversing")).click();
//	Thread.sleep(3000);
//	
//	driver.findElement(AppiumBy.accessibilityId("Play")).click();
//	Thread.sleep(2000);
//	
//	driver.findElement(AppiumBy.accessibilityId("Reverse")).click();
//	Thread.sleep(2000);
//	
//	driver.navigate().back();
//	Thread.sleep(2000);
//	
	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector())" + ".scrollIntoView(text(\"Seeking\"));"))
	.click();
	Thread.sleep(2000);
	
	WebElement s1= driver.findElement(By.xpath("io.appium.android.apis:id/seekBar"));
	seekbar(s1);
	Thread.sleep(2000);
	
	
	driver.findElement(AppiumBy.accessibilityId("Run")).click();
	Thread.sleep(2000);
	
	driver.navigate().back();
	Thread.sleep(2000);
	
//	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector())" + ".scrollIntoView(text(\"View Flip\"));"))
//	.click();
//	Thread.sleep(2000);
//	
//	driver.findElement(AppiumBy.accessibilityId("Flip")).click();
//	Thread.sleep(2000);
//	driver.findElement(AppiumBy.accessibilityId("Flip")).click();
//	Thread.sleep(2000);
//	
//	driver.navigate().back();
//	Thread.sleep(2000);
	
	}

}
