package com.execute;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.TIxpath.TILoginPage;
import com.TIxpath.TIProductionPage;
import com.TIxpath.TIRoomsPage;

import base.UtilityClass;
import screen.BaseClassRec;

public class Audit extends UtilityClass {

	@BeforeClass
	public void test() throws InterruptedException, IOException {
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
	public void t1() throws Exception {

		BaseClassRec.startRecord("t1");

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
		lowsleep();

		// click the TI production icon
		TIProductionPage q = new TIProductionPage();
		buttonClick(q.getkButtonIcon1());
		minisleep();
		buttonClick(q.getQR());
		lowsleep();
		buttonClick(q.getAuditTrail());
		minisleep();

		// Date picker

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('datepicker-1').removeAttribute('readonly',0)", q.getStartDate());
		js.executeScript("document.getElementById('datepicker-1').value='05/03/2024'", q.getStartDate());

		js.executeScript("document.getElementById('datepicker-2').removeAttribute('readonly',0)", q.getEndDate());
		js.executeScript("document.getElementById('datepicker-2').value='11/03/2024'", q.getEndDate());

		minisleep();
		buttonClick(q.getApplyDate());
		minisleep();
		js.executeScript("arguments[0].scrollIntoView(true)", q.getScroll());
		buttonClick(q.getScroll());
		minisleep();

		BaseClassRec.stopRecord();
	}

	@AfterClass
	public void after() throws Exception {
		// BaseClass.stopRecord();
		driver.close();
	}

}
