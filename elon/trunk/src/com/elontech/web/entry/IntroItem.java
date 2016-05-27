package com.elontech.web.entry;

import com.fivetrue.db.DatabaseObject;

public class IntroItem extends DatabaseObject{
	
	private String introItemTitle = null;
	private String introItemContent = null;
	
	public IntroItem(String title, String content){
		introItemTitle = title;
		introItemContent = content;
	}
	public String getIntroItemTitle() {
		return introItemTitle;
	}
	public void setIntroItemTitle(String introItemTitle) {
		this.introItemTitle = introItemTitle;
	}
	public String getIntroItemContent() {
		return introItemContent;
	}
	public void setIntroItemContent(String introItemContent) {
		this.introItemContent = introItemContent;
	}
	@Override
	public String toString() {
		return "IntroItem [introItemTitle=" + introItemTitle + ", introItemContent=" + introItemContent + "]";
	}

}
