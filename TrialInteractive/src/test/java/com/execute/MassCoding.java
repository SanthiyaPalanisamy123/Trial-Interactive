package com.execute;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.TIxpath.TILoginPage;
import com.TIxpath.TIProductionPage;
import com.TIxpath.TIRoomsPage;

import base.UtilityClass;

public class MassCoding extends UtilityClass {
	@Test
	public void test() throws IOException, InterruptedException {
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

		// click the room
		TIRoomsPage p = new TIRoomsPage();
		try {
			p.getRoomName();
			waitUntilElementVisible(driver, p.getRoomName());
			buttonClick(p.getRoomName());
		}

		catch (Exception e) {
			p.getRoomName();
			waitUntilElementVisible(driver, p.getRoomName());
			buttonClick(p.getRoomName());
		}
		insleep();

		// click the TI production icon
		TIProductionPage q = new TIProductionPage();
		buttonClick(q.getkButtonIcon1());
		insleep();

		// select eTMF
		buttonClick(q.geteTMFRoom());
		lowsleep();
		// select eTMF/Documents
		buttonClick(q.geteTMFDocuments());
		lowsleep();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView();", q.getUpload());
		buttonClick(q.getUpload());
		insleep();
//		buttonClick(q.getUser1());
//		insleep();
		buttonClick(q.getCheckBox());
		insleep();
		buttonClick(q.getMass());
		insleep();
		inputText(q.getReason(), "test");
		lowsleep();
		//buttonClick(q.getCalender());
	    // select date 
		js.executeScript("document.getElementById('datepicker-1').value='14/03/2024'", q.getCalender());
		insleep();
		js.executeScript("arguments[0].scrollIntoView();", q.getCategory());

		buttonClick(q.getCategory());

		buttonClick(q.getType());

		Actions a = new Actions(driver);
		a.click(q.getDocType()).perform();
		inputText(q.getSearch(), "JK Test");
		insleep();
		a.click(q.getBox()).perform();
		insleep();
		
		buttonClick(q.getSelect());
		lowsleep();
		buttonClick(q.getSave());
		lowsleep();
		buttonClick(q.getYes());
		lowsleep();
		takeScreenShot();
		System.out.println("Mass coding Updated");
		
	}

}
