package com.TIxpath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.UtilityClass;

public class TIProductionPage extends UtilityClass {
	public TIProductionPage() {
		PageFactory.initElements(driver, this);
	} 
	//PDF conversion
	@FindBy(xpath="//*[@class='k-button-icon fa fa-th icon-size ng-star-inserted']")
	private WebElement kButtonIcon1;

	@FindBy(xpath="(//*[@class='context-item mark-active ng-star-inserted'])[12]")
	private WebElement settings;
	
	@FindBy(xpath="//a[@href='#/ti/room/2096/quality-review']")
	private WebElement QR;
	
	@FindBy(xpath="(//span[(text()='Documents')])")
	private WebElement document;
			
	@FindBy(xpath="//span[@class='k-button-icon fa fa-th icon-size ng-star-inserted']")
	private WebElement buttonIcon2;
	
	@FindBy(xpath="//a[@title='eTMF']")
	private WebElement eTMFRoom;
	
	@FindBy(xpath="(//*[@class='sidebar-menu__item'])[1]")
	private WebElement eTMFDocuments;
	
	@FindBy(xpath="//*[text()='Import']")
	private WebElement Import;
	
	@FindBy(xpath="(//*[text()='Documents'])[2]")
	private WebElement uploadDocuments;
	
	@FindBy(xpath="//*[text()='Browse']")
	private WebElement browse;
	
	@FindBy(xpath="//*[text()='Import and Apply Metadata']")
	private WebElement apply;
	
	@FindBy(xpath="//*[text()='Yes']")
	private WebElement yes;
	
	@FindBy(xpath="//div[@class='fa fa-caret-down ng-star-inserted']")
	private WebElement viewBy;
	
	@FindBy(xpath="//*[text()='Posted Date']")
	private WebElement postedDate;
	
	@FindBy(xpath="(//*[@class='k-treeview-item ng-tns-c52-26 ng-star-inserted'])[1]")
	private WebElement box1;
	
	@FindBy(xpath="//*[@class='main-button k-button k-button-md k-rounded-md k-button-flat-primary k-button-flat ng-star-inserted']")
	private WebElement kButton3;
	
	@FindBy(xpath="//*[text()='Processed Documents']")
	private WebElement processedDocs;
	
	@FindBy(xpath="(//*[@class='k-i-caret-alt-right k-icon ng-star-inserted'])[4]")
	private WebElement pdfConversion;
	
	@FindBy(xpath="(//*[@class='tree-node-wrapper ng-star-inserted'])[5]")
	private WebElement pending;
	
	@FindBy(xpath="(//*[@class='tree-node-wrapper ng-star-inserted'])[6]")
	private WebElement inprogress;
	
	@FindBy(xpath="(//*[@class='tree-node-wrapper ng-star-inserted'])[7]")
	private WebElement processed;
	
	@FindBy(xpath="//*[@class='k-treeview-md k-treeview']")
	private WebElement block1;
	
	@FindBy(xpath="(//*[@class='tree-node-wrapper ng-star-inserted'])[13]")
	private WebElement upload;
	//Mass coding
	@FindBy(xpath="(//div[@class='tree-node-wrapper ng-star-inserted'])[81]")
	private WebElement user1;
	
	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	private WebElement checkBox;
	
	@FindBy(xpath="//span[text()='Mass Coding']")
	private WebElement mass;
	
	@FindBy(xpath="//*[@id='mass-coding-reason']")
	private WebElement reason;
	
	@FindBy(xpath="(//*[@class='k-i-calendar k-button-icon k-icon ng-star-inserted'])[1]")
	private WebElement calender;
	
	@FindBy(xpath="(//button[@type='button'])[3]")
    private WebElement category;
	
	@FindBy(xpath="//*[@id='k-2d3727c3-7655-4717-9122-2e64c3f573f3-1']")
	private WebElement general;
	
	@FindBy(xpath="//*[text()='General']")
	private WebElement type;

	
	@FindBy(xpath="//*[@class='k-icon k-i-tag ng-star-inserted']")
	private WebElement DocType;
	
	@FindBy(xpath="//*[@class='doc-info-input k-textbox w-100']")
	private WebElement search;
	
	@FindBy(xpath="//*[@class='k-checkbox-label ng-star-inserted']")
	private WebElement box;
	
	@FindBy(xpath="//*[text()='Select']")
	private WebElement select;
	
	@FindBy(xpath="//*[text()='Save']")
	private WebElement save;
	
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	private WebElement box2;  
	
	@FindBy(xpath="(//input[@type='checkbox'])[3]")
	private WebElement box3;  
	
	//Add to cart
	@FindBy(xpath="(//*[@class='k-i-caret-alt-down k-icon ng-star-inserted'])[1]")
	private WebElement dA; 
	
	@FindBy(xpath="(//*[@class='k-icon ng-star-inserted k-i-caret-alt-right'])[2]")
	private WebElement up;  
	
	@FindBy(xpath="(//*[@class='tree-node-wrapper ng-star-inserted'])[5]")
	private WebElement user;  
	
	@FindBy(xpath="(//div[@class='ng-star-inserted'])[9]")
	private WebElement AddToCart;  
	
	@FindBy(xpath="//*[@id='docsCart']")
	private WebElement DCart;  
	
	@FindBy(xpath="//*[@class='btn-docs-actions k-button k-button-md k-rounded-md k-button-solid-primary k-button-solid']")
	private WebElement actions;  
	
	@FindBy(xpath="//*[text()='Merge']")
	private WebElement merge;  
	
	@FindBy(xpath="//*[@class='k-button k-button-md k-rounded-md k-button-solid-primary k-button-solid']")
	private WebElement NewDoc;  
	
	@FindBy(xpath="(//span[@class='k-button-text'])[7]")
	private WebElement saveDoc;   
	
	@FindBy(xpath="//*[@id='CodingTypeId']")
	private WebElement selectCatagory;  
	
	@FindBy(xpath="(//*[@class='ti-textarea__complex focusable k-textarea k-input k-input-md k-rounded-md k-input-solid k-autofill'])[1]")
	private WebElement textarea;  
	
	@FindBy(xpath="(//*[@role='searchbox'])")
	private WebElement searchDoc;  
	
	@FindBy(xpath="//input[@id='Title']")
	private WebElement subDate;  
	
	@FindBy(xpath="(//*[@title='Toggle calendar'])[1]")
	private WebElement calenderIcon;  
	
	@FindBy(xpath="//td[@title='Thursday, March 14, 2024']")
	private WebElement DocDate;  
	
	@FindBy(xpath="//*[@class='k-button k-button-md k-rounded-md k-button-solid-primary k-button-solid']")
	private WebElement finish;  
	
	
	//Create Site
	@FindBy(xpath="(//*[@class='sidebar-menu__item']/parent::li[@class='ng-star-inserted'])[3]")
	private WebElement site;
	
	@FindBy(xpath="(//div[@class='ng-star-inserted'])[3]")
	private WebElement add;
	
	@FindBy(xpath="(//*[@id='TopicName'])")
	private WebElement insti;
	
	@FindBy(xpath="(//*[@type='checkbox'])[4]")
	private WebElement selectInsti;
	
	@FindBy(xpath="//*[text()='OK']")
	private WebElement ok;
	
	@FindBy(xpath="(//*[@class='k-button-text'])[27]")
	private WebElement CRA;
	
	@FindBy(xpath="//*[text()='mdirfanullah1995@outlook.com']")
	private WebElement selectCRA;
	
	@FindBy(xpath="(//*[text()='Add'])[4]")
	private WebElement addCRA;
	
	@FindBy(xpath="(//*[@class='k-button-text'])[28]")
	private WebElement ssu;
	
	@FindBy(xpath="(//*[@class='k-table-td k-touch-action-auto ti-compact ng-star-inserted'])[1]")
	private WebElement selectSSU;
	
	@FindBy(xpath="//*[@id='SiteNumber']")
	private WebElement siteNo;
	
	@FindBy(xpath="(//*[@class='k-checkbox-label k-label'])[1]")
	private WebElement checkbox1;
	
	@FindBy(xpath="//*[@id='$AutoSiteName$']")
	private WebElement siteName;
	
	@FindBy(xpath="//*[@id='$AutoSiteNameDisablingReason$']")
	private WebElement reasonSN;
	
	@FindBy(xpath="//*[@id='datepicker-1']")
	private WebElement IRBDate;
	
	@FindBy(xpath="(//*[text()='Add']//ancestor::button)[3]")
	private WebElement Add1;
	
	@FindBy(xpath="(//*[text()='Add'])[2]")
	private WebElement AddSite;
	
	@FindBy(xpath="//*[text()='Add Existing']")
	private WebElement PI;
	
	@FindBy(xpath="(//*[@type='text'])[2]")
	private WebElement searchPI;
	
	@FindBy(xpath="(//*[@type='checkbox'])[7]")
	private WebElement checkbox2;
	
	@FindBy(xpath="//*[text()='Add 1 Contacts']")
	private WebElement Add2;
	
	@FindBy(xpath="(//*[@class='k-i-caret-alt-down k-icon ng-star-inserted'])[6]")
	private WebElement down;
	
	@FindBy(xpath="(//*[text()='Add'])[3]")
	private WebElement AddContacts;
	
	@FindBy(xpath="//*[@class='fa fa-clipboard routes-menu__icon']")
	private WebElement auditTrail;
	
	@FindBy(xpath="//*[@id='datepicker-1']")
	private WebElement startDate;
	
	@FindBy(xpath="//*[@id='datepicker-2']")
	private WebElement EndDate;
	
	@FindBy(xpath="//*[text()='Apply']")
	private WebElement applyDate;
	
	@FindBy(xpath="(//*[@type='checkbox'])[51]")
	private WebElement scroll;
//	
//	@FindBy(xpath="//*[@name='accept-all']")
//	private WebElement all;
//	
//	@FindBy(xpath="//*[@id='Email']")
//	private WebElement email;
//	
//	@FindBy(xpath="//*[@id='SubmitLogin']")
//	private WebElement sl;
//	
//	@FindBy(xpath="//*[@id='Password']")
//	private WebElement pass;
	
	
	

	public WebElement getMerge() {
		return merge;
	}
	public WebElement getScroll() {
		return scroll;
	}
	public WebElement getdA() {
		return dA;
	}
	public WebElement getIRBDate() {
		return IRBDate;
	}
	public WebElement getAddSite() {
		return AddSite;
	}
	public WebElement getSelectInsti() {
		return selectInsti;
	}
	public WebElement getOk() {
		return ok;
	}
	public WebElement getSite() {
		return site;
	}
	public WebElement getAdd() {
		return add;
	}
	public WebElement getInsti() {
		return insti;
	}
	public WebElement getCRA() {
		return CRA;
	}
	public WebElement getSelectCRA() {
		return selectCRA;
	}
	public WebElement getAddCRA() {
		return addCRA;
	}
	public WebElement getSsu() {
		return ssu;
	}
	
	public WebElement getSelectSSU() {
		return selectSSU;
	}
	
	public WebElement getSiteNo() {
		return siteNo;
	}
	public WebElement getCheckbox1() {
		return checkbox1;
	}
	public WebElement getSiteName() {
		return siteName;
	}
	public WebElement getReasonSN() {
		return reasonSN;
	}
	public WebElement getAdd2() {
		return Add2;
	}
	public WebElement getPI() {
		return PI;
	}
	public WebElement getSearchPI() {
		return searchPI;
	}
	public WebElement getCheckbox2() {
		return checkbox2;
	}
	public WebElement getAdd1() {
		return Add1;
	}
	public WebElement getDown() {
		return down;
	}
	public WebElement getAddContacts() {
		return AddContacts;
	}
	
	public WebElement getUp() {
		return up;
	}
	public WebElement getUser() {
		return user;
	}
	public WebElement getAddToCart() {
		return AddToCart;
	}
	public WebElement getBox3() {
		return box3;
	}
	public WebElement getBox2() {
		return box2;
	}
	public WebElement getSave() {
		return save;
	}
	public WebElement getCalender() {
		return calender;
	}
	public WebElement getDocType() {
		return DocType;
	}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getBox() {
		return box;
	}
	public WebElement getSelect() {
		return select;
	}
	public WebElement getCategory() {
		return category;
	}
	public WebElement getReason() {
		return reason;
	}
	public WebElement getCheckBox() {
		return checkBox;
	}
	public WebElement getBlock1() {
		return block1;
	}
	public WebElement getUpload() {
		return upload;
	}
	public WebElement getMass() {
		return mass;
	}
	public WebElement getUser1() {
		return user1;
	}
	public WebElement getkButtonIcon1() {
		return kButtonIcon1;
	}
	public WebElement getSettings() {
		return settings;
	}
	public WebElement getQR() {
		return QR;
	}
	
	public WebElement getDocument() {
		return document;
	}
	public WebElement getButtonIcon2() {
		return buttonIcon2;
	}
	public WebElement geteTMFRoom() {
		return eTMFRoom;
	}
	public WebElement geteTMFDocuments() {
		return eTMFDocuments;
	}
	public WebElement getImport() {
		return Import;
	}
	public WebElement getUploadDocuments() {
		return uploadDocuments;
	}
	public WebElement getBrowse() {
		return browse;
	}
	public WebElement getApply() {
		return apply;
	}
	public WebElement getYes() {
		return yes;
	}
	public WebElement getViewBy() {
		return viewBy;
	}
	public WebElement getPostedDate() {
		return postedDate;
	}
	public WebElement getBox1() {
		return box1;
	}
	public WebElement getkButton3() {
		return kButton3;
	}
	public WebElement getProcessedDocs() {
		return processedDocs;
	}
	public WebElement getPdfConversion() {
		return pdfConversion;
	}	
	public WebElement getPending() {
		return pending;
	}
	public WebElement getInprogress() {
		return inprogress;
	}
	public WebElement getProcessed() {
		return processed;
	}
	public WebElement getType() {
		return type;	
	}
	public WebElement getAuditTrail() {
		return auditTrail;	
	}
	
	public WebElement getStartDate() {
		return startDate;	
	}
	public WebElement getEndDate() {
		return EndDate;
	}
	public WebElement getApplyDate() {
		return applyDate;
	}
	public WebElement getDCart() {
		return DCart;
	}
	public WebElement getActions() {
		return actions;
	}
	public WebElement getNewDoc() {
		return NewDoc;
	}
	public WebElement getSaveDoc() {
		return saveDoc;
	}
	public WebElement getSelectCatagory() {
		return selectCatagory;
	}
	public WebElement getTextarea() {
		return textarea;
	}
	public WebElement getSearchDoc() {
		return searchDoc;
	}
	public WebElement getSubDate() {
		return subDate;
	}
	public WebElement getDocDate() {
		return DocDate;
	}
	public WebElement getFinish() {
		return finish;
	}
	public WebElement getCalenderIcon() {
		return calenderIcon;
	}
	public WebElement getGeneral() {
		return general;
	}
	
	
}
