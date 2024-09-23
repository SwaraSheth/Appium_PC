package com.mvn;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

@Test
public class GeneralStore extends BaseTest {
public void store() throws InterruptedException {
	
	
	
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.EditText"))
	.sendKeys("Swara");
	Thread.sleep(2000);
	
	driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
	Thread.sleep(2000);
	
	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector())" + ".scrollIntoView(text(\"India\"));"))
	.click();
	Thread.sleep(2000);
	
	
	driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("com.androidsample.generalstore:id/productAddCart")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
	Thread.sleep(2000);
}
}
