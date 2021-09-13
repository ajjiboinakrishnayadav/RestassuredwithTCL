package com.sample.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class SucessTest3 {
	
	
	AppiumDriver driver;

	@BeforeClass
	public void setUp() throws MalformedURLException, Exception {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("platformVersion", "9");
		desiredCapabilities.setCapability("deviceName", "Android device");
	    desiredCapabilities.setCapability("automationName", "UiAutomator2");
		desiredCapabilities.setCapability(MobileCapabilityType.APP,"D:\\DataDrivenJenkins\\TCLBLProject\\build\\app-release-unsigned_release_220721.apk");
		desiredCapabilities.setCapability("udid", "VG8T4PRO5D7HBY8H");
		desiredCapabilities.setCapability("noReset", "true");
		
		URL remoteUrl = new URL("http://localhost:4723/wd/hub");

		driver = new AndroidDriver(remoteUrl, desiredCapabilities);
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}
	
	@Test
	public void sampletesttt() throws Exception {

			

			System.out.println("START");
			Thread.sleep(57000);
			System.out.println("STARTED....");
			
			//MobileElement username = (MobileElement) driver.findElementById("mat-input-0");
			//username.sendKeys("hlcre");
			
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.EditText").sendKeys("hlcre");
			
			Thread.sleep(3000);
			
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.widget.EditText").sendKeys("Jocata@111");
			Thread.sleep(3000);
			
			
			driver.findElementByClassName("android.widget.Button").click();
			
			Thread.sleep(8000);
			
			System.out.println("STOP");
			
			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[3]/android.widget.Button").click();
	
			/*Thread.sleep(8000);
			

			driver.findElementByXPath("//android.widget.ListView[@text='Branch *']").click();

			Thread.sleep(4000);
			driver.findElementByXPath("//android.view.View[@text='0202 - BARODA ALKA, in list, item 2 of 14']").click();

			Thread.sleep(3000);

			driver.findElementByXPath("//android.widget.ListView[@text='Sourcing Channel *']").click();

			Thread.sleep(4000);
			driver.findElementByXPath("//android.view.View[@text='ALTERNATE CHANNEL, in list, item 2 of 7']").click();

			Thread.sleep(3000);

			driver.findElementByXPath("//android.widget.ListView[@text='SM Name *']").click();

			Thread.sleep(4000);
			driver.findElementByXPath("//android.view.View[@text='hlsm M, in list, item 2 of 2']").click();

			Thread.sleep(3000);

			driver.findElementByXPath("//android.widget.ListView[@text='Product Type *']").click();

			Thread.sleep(4000);
			driver.findElementByXPath("//android.view.View[@text='INSURANCE LOAN, in list, item 2 of 4']").click();

			Thread.sleep(4000);*/
			
			
			
			
			// //android.widget.TextView[contains(@text,'PAN')]
			
			//  //android.widget.TextView[contains(@text,'Mobile Number')]
			
			/*MobileElement panumber = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[6]/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.widget.EditText");
			panumber.sendKeys("AWFPA9541F");
			
			Thread.sleep(3000);
			MobileElement phonenumber = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[7]/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.widget.EditText");
			phonenumber.sendKeys("9030828503");*/
			
			
			
			/*MobileElement panumber = (MobileElement) driver.findElementByXPath("//android.widget.TextView[contains(@text,'PAN')]//following-sibling::android.widget.EditText");
			panumber.sendKeys("AWFPA9541F");
			
			Thread.sleep(4000);
			MobileElement phonenumber = (MobileElement) driver.findElementByXPath("//android.widget.TextView[contains(@text,'Mobile Number')]//following-sibling::android.widget.EditText");
			phonenumber.sendKeys("9030828503");
			*/
			//driver.scrollTo("Loan amount");
			
			
			//Thread.sleep(4000);
			
//			   MobileElement item = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
//				        "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList()" +
//				         ".scrollIntoView(new UiSelector().xpath(\"//android.widget.TextView[@text='Loan amount']//following-sibling::android.widget.EditText\"))"));
//
//			   String visibleText=null;
//			driver.findElementByCssSelector("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))");

			
List<MobileElement>	lists=driver.findElements(By.xpath("//android.widget.TextView"));

for (MobileElement e : lists) {
	
	System.out.println(e.getAttribute("text"));
	
     Dimension dimension = driver.manage().window().getSize();
	int start_x= (int) (dimension.width * 0.5);
	int start_y =(int) (dimension.height * 0.8);
	
	int end_x= (int) (dimension.width * 0.2);
	int end_y = (int) (dimension.width * 0.2);
	
	TouchAction tocuh = new TouchAction(driver);
	tocuh.press(PointOption.point(start_x,start_y))
	.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
	.moveTo(PointOption.point(end_x,end_y)).release().perform();

}
			



			Thread.sleep(4000);
			driver.findElementByXPath("//android.widget.TextView[@text='Loan amount']//following-sibling::android.widget.EditText").sendKeys("5000000");
			Thread.sleep(4000);
			driver.findElementByXPath("//android.widget.TextView[@text='Tenure']//following-sibling::android.widget.EditText").sendKeys("16");

			Thread.sleep(4000);
//			driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.app.Dialog/android.view.View/android.view.View[4]/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.widget.EditText").sendKeys("AWFPA9541F");
//			Thread.sleep(3000);
//	       driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.app.Dialog/android.view.View/android.view.View[5]/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.widget.EditText").sendKeys("8106212194");
//	       Thread.sleep(3000);
//	
//	      driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.app.Dialog/android.view.View/android.view.View[7]/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.widget.EditText").sendKeys("5000000");
//	      Thread.sleep(3000);
//	      driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.app.Dialog/android.view.View/android.view.View[8]/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.widget.EditText").sendKeys("12");
//	      Thread.sleep(3000);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}


}
