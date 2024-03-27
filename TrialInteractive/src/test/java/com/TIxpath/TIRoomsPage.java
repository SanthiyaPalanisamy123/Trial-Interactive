package com.TIxpath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.UtilityClass;

public class TIRoomsPage extends UtilityClass{
	public TIRoomsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//*[text()='Irfan Training Room'])[1]")
	private WebElement roomName;
	
	@FindBy(xpath="//*[text()='July Patch']")
	private WebElement roomName2;
	
	@FindBy(xpath="//*[text()='Test Room v10.5']")
	private WebElement roomName3;
	
	public WebElement getRoomName() {
		return roomName;
	}

	public WebElement getRoomName2() {
		return roomName2;
	}

	public WebElement getRoomName3() {
		return roomName3;
	}
	
}
