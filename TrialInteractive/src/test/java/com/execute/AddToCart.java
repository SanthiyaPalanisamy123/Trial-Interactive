package com.execute;

import java.awt.Robot;
import java.awt.event.KeyEvent;

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

public class AddToCart extends UtilityClass{
	@BeforeClass
	public void before() throws Exception {
		// launch the browser
		BaseClassRec.startRecord("before");
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
	public void test() throws Exception {
       
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
		buttonClick(q.getkButtonIcon1());
		minisleep();
		buttonClick(q.getQR());
		lowsleep();
		
		buttonClick(q.getUser());
		minisleep();
		//Add Documents to Add to cart
		buttonClick(q.getCheckBox());
		buttonClick(q.getAddToCart());
		minisleep();
		buttonClick(q.getDCart());
        buttonClick(q.getActions());
        //Merge the documents
        buttonClick(q.getMerge());
        minisleep();
        buttonClick(q.getNewDoc());
        buttonClick(q.getCheckBox());
        buttonClick(q.getSaveDoc());
        buttonClick(q.getSelectCatagory());
        lowsleep();
        
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        
        //buttonClick(q.getGeneral());
       /* buttonClick(q.getTextarea());
        inputText(q.getTextarea(), "Test Share");
        //minisleep();
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);*/
        
//        buttonClick(q.getSubDate());
//        buttonClick(q.getDocDate());
        JavascriptExecutor js = (JavascriptExecutor)driver;
		/*js.executeScript("arguments[0].scrollIntoView(true)", q.getCalenderIcon());
		buttonClick(q.getCalenderIcon());
		buttonClick(q.getDocDate());*/
		
        js.executeScript("arguments[0].scrollIntoView(true)", q.getFinish());
        buttonClick(q.getFinish());
        
        System.out.println("Merged the documents was successfully ");
        BaseClassRec.stopRecord();
	}
	
//	  @AfterClass
//	  private void after() {
//		driver.close();
//
//	}
}

