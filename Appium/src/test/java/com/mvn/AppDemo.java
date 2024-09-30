package com.mvn;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class AppDemo extends BaseTest{
	@Test
	public void app() throws InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.accessibilityId("Action Bar")).click();
		Thread.sleep(2000);
		
			driver.findElement(AppiumBy.accessibilityId("Action Bar Mechanics")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			
			driver.findElement(AppiumBy.accessibilityId("Action Bar Tabs")).click();
			Thread.sleep(2000);
				driver.findElement(AppiumBy.accessibilityId("Add new tab")).click();
				Thread.sleep(2000);
				driver.findElement(AppiumBy.accessibilityId("Remove last tab")).click();
				Thread.sleep(2000);
				driver.findElement(AppiumBy.accessibilityId("Toggle tab mode")).click();
				Thread.sleep(2000);
				driver.findElement(AppiumBy.accessibilityId("Remove all tabs")).click();
				Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			
			driver.findElement(AppiumBy.accessibilityId("Action Bar Usage")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			
			driver.findElement(AppiumBy.accessibilityId("Action Provider")).click();
			Thread.sleep(2000);
				driver.findElement(AppiumBy.accessibilityId("Settings Action Provider")).click();
				Thread.sleep(2000);
				driver.navigate().back();
				Thread.sleep(2000);
				driver.findElement(AppiumBy.accessibilityId("Share Action Provider")).click();
				Thread.sleep(2000);
				driver.navigate().back();
				Thread.sleep(2000);
			
			
			driver.findElement(AppiumBy.accessibilityId("Display Options")).click();
			Thread.sleep(2000);
				driver.findElement(AppiumBy.accessibilityId("DISPLAY_HOME_AS_UP")).click();
				Thread.sleep(2000);
				
				driver.findElement(AppiumBy.accessibilityId("DISPLAY_SHOW_HOME")).click();
				Thread.sleep(2000);
				
				driver.findElement(AppiumBy.accessibilityId("DISPLAY_USE_LOGO")).click();
				Thread.sleep(2000);
				
				driver.findElement(AppiumBy.accessibilityId("DISPLAY_SHOW_TITLE")).click();
				Thread.sleep(2000);
				
				driver.findElement(AppiumBy.accessibilityId("DISPLAY_SHOW_CUSTOM")).click();
				Thread.sleep(2000);
				
				driver.findElement(AppiumBy.accessibilityId("Navigation")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//android.widget.TextView[@text='TAB 1']")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//android.widget.TextView[@text='TAB 2']")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//android.widget.TextView[@text='TAB 3']")).click();
				Thread.sleep(2000);
				
				driver.findElement(AppiumBy.accessibilityId("Cycle Custom View Gravity")).click();
				Thread.sleep(2000);
				driver.navigate().back();
				Thread.sleep(2000);
			
			
		driver.navigate().back();
		Thread.sleep(2000);
		
//		driver.findElement(AppiumBy.accessibilityId("Activity")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
//		driver.findElement(AppiumBy.accessibilityId("Alarm")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
//		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
//		driver.findElement(AppiumBy.accessibilityId("Device Admin")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
//		driver.findElement(AppiumBy.accessibilityId("Fragment")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
//		driver.findElement(AppiumBy.accessibilityId("Launcher Shortcuts")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
//		driver.findElement(AppiumBy.accessibilityId("Loader")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
//		driver.findElement(AppiumBy.accessibilityId("Menu")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
//		driver.findElement(AppiumBy.accessibilityId("Notification")).click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
	}
	
}
