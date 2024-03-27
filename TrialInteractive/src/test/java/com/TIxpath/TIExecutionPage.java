package com.TIxpath;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.checkerframework.checker.units.qual.g;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.UtilityClass;

public class TIExecutionPage extends UtilityClass {
  
	public static void main() throws IOException, InterruptedException, AWTException {
        //launch the browser
		browserLaunch("https://secure.trialinteractive.com/");
        //maximize the browser
		maximize();
		//wait for all script
		time();
		
        //Enter the login credentials
		TILoginPage t = new TILoginPage();
		inputText(t.getUser(), stringData(1, 0));
		buttonClick(t.getLoginUser());
		
		inputText(t.getPass(), stringData(1, 1));
		buttonClick(t.getLogin());
		
        //click the room
		TIRoomsPage p = new TIRoomsPage();
		try {
			p.getRoomName();
			waitUntilElementVisible(driver, p.getRoomName()); 
			buttonClick(p.getRoomName());
		}
		
		
		catch(Exception e) {
		p.getRoomName();
		waitUntilElementVisible(driver, p.getRoomName()); 
		buttonClick(p.getRoomName());
		}
		lowsleep();
		
        //click the TI production icon
		TIProductionPage q = new TIProductionPage();
		buttonClick(q.getkButtonIcon1());
		lowsleep();
		
		
		
		//select eTMF 
		try {
		    buttonClick(q.geteTMFRoom());
		}
		catch(Exception e) {
			buttonClick(q.geteTMFRoom());
		}
		lowsleep();
        //select eTMF/Documents
		buttonClick(q.geteTMFDocuments());
		lowsleep();
        //upload the documents
		q.getImport();

		Actions a = new Actions(driver);
		a.click(q.getImport()).perform();
		
		lowsleep();
        buttonClick(q.getUploadDocuments());
		lowsleep();
		buttonClick(q.getBrowse());
		
		Robot r = new Robot();
		r.delay(2000);
		
		//Copy the path
		StringSelection s = new StringSelection("C:\\Users\\santhiya.palanisamy\\Downloads\\Today.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
		//paste the path
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		//Enter the path
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		r.delay(2000);
		
		buttonClick(q.getApply());
		//takeScreenShot for Uploaded Documents
		takeScreenShot();
		insleep();
		try {
		    buttonClick(q.getYes());
		}catch(Exception e) {
			buttonClick(q.getYes());
		}
		insleep();
		try {
		    buttonClick(q.getViewBy());
		}catch(Exception e) {
			buttonClick(q.getViewBy());
		}
		r.delay(4000);
		//click Posted Date
		Actions b = new Actions(driver);
		b.doubleClick(q.getPostedDate()).perform();
		lowsleep();
		buttonClick(q.getBox1());
		lowsleep();
    	buttonClick(q.getkButton3());
    	r.delay(4000);
    	//click Processed Documents
    	Actions d = new Actions(driver);
		d.doubleClick(q.getProcessedDocs()).perform();
    	insleep();
    	//click PdfConversion
    	buttonClick(q.getPdfConversion());
        lowsleep();
        buttonClick(q.getPending());
        refresh();
        r.delay(2000);
        refresh();
        r.delay(2000);
        refresh();
        buttonClick(q.getInprogress());
        refresh();
        refresh();
        
        buttonClick(q.getProcessed());
        lowsleep();
        //close the browser
		closeBrowser();
	}

}
