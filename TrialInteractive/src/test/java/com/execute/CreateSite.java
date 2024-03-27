package com.execute;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.TIxpath.TILoginPage;
import com.TIxpath.TIProductionPage;
import com.TIxpath.TIRoomsPage;

import base.UtilityClass;

import screen.BaseClassRec;

public class CreateSite extends UtilityClass {
	@BeforeClass
	
	public void before() throws IOException {
		
		// launch the browser
		browserLaunch("https://secure.trialinteractive.com/");
		// maximize the browser
		maximize();
		// wait for all script
		time();

		// Enter the login credentials
		TILoginPage t = new TILoginPage();
		inputText(t.getUser(), stringData(1, 0));
		buttonClick(t.getLoginUser());

		inputText(t.getPass(), stringData(1, 1));
		buttonClick(t.getLogin());
	 }
	
	@Test
		public void test() throws Exception{
		BaseClassRec.startRecord("test");
		// click the room
		TIRoomsPage p = new TIRoomsPage();
		try {

			waitUntilElementVisible(driver, p.getRoomName2());
			buttonClick(p.getRoomName2());
		}

		catch (Exception e) {

			waitUntilElementVisible(driver, p.getRoomName2());
			buttonClick(p.getRoomName2());
		}
		insleep();

		// click the TI production icon
		TIProductionPage q = new TIProductionPage();
		try {
			buttonClick(q.getSite());
		} catch (Exception e) {
			buttonClick(q.getSite());
		}
		lowsleep();
		buttonClick(q.getAdd());
		lowsleep();
		inputText(q.getInsti(), "TI");

		buttonClick(q.getCRA());

		Actions a = new Actions(driver);
		a.doubleClick(q.getSelectCRA()).perform();

		buttonClick(q.getAddCRA());
		buttonClick(q.getSsu());
		a.doubleClick(q.getSelectSSU()).perform();
		buttonClick(q.getAddCRA());

		Robot r = new Robot();

		inputText(q.getSiteNo(), "333");
		buttonClick(q.getCheckbox1());
		inputText(q.getSiteName(), "TIsite");
		inputText(q.getReasonSN(), "Test");
		
		/*buttonClick(q.getIRBDate());
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("document.getElementById('datepicker-1').value='12 Nov 2011'", q.getIRBDate());
		inputText(q.getIRBDate(), "12");
		lowsleep();
		buttonClick(q.getIRBDate());
		insleep();
		inputText(q.getIRBDate(), "Ma");
		lowsleep();
		buttonClick(q.getIRBDate());
		inputText(q.getIRBDate(), "2024");
		lowsleep();*/
		
		buttonClick(q.getAdd1());
		buttonClick(q.getAddSite());
		buttonClick(q.getPI());
		inputText(q.getSearchPI(), "Irfan");
		lowsleep();
		buttonClick(q.getCheckbox2());
		buttonClick(q.getAdd2());
		lowsleep();
		buttonClick(q.getDown());
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		// Enter the path
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		buttonClick(q.getAddContacts());
		insleep();
		takeScreenShot();
		minisleep();
		BaseClassRec.stopRecord();
	}
	
	@AfterClass
		public void After() {
			driver.close();

		}
	}
