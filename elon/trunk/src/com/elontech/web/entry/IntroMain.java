package com.elontech.web.entry;

import java.util.ArrayList;

import com.fivetrue.db.DatabaseObject;
import com.fivetrue.db.annotation.MemberVariable;

public class IntroMain extends DatabaseObject{
	
	private String introTitle = null;
	private String introMessage = null;
	private String introLink = null;
	private String introLinkName = null;
	
	@MemberVariable
	private ArrayList<IntroItem> introItems = null;

	public String getIntroTitle() {
		return introTitle;
	}

	public void setIntroTitle(String introTitle) {
		this.introTitle = introTitle;
	}

	public String getIntroMessage() {
		return introMessage;
	}

	public void setIntroMessage(String introMessage) {
		this.introMessage = introMessage;
	}

	public String getIntroLink() {
		return introLink;
	}

	public void setIntroLink(String introLink) {
		this.introLink = introLink;
	}

	public String getIntroLinkName() {
		return introLinkName;
	}

	public void setIntroLinkName(String introLinkName) {
		this.introLinkName = introLinkName;
	}

	public ArrayList<IntroItem> getIntroItems() {
		return introItems;
	}

	public void setIntroItems(ArrayList<IntroItem> introItems) {
		this.introItems = introItems;
	}

	@Override
	public String toString() {
		return "IntroMain [introTitle=" + introTitle + ", introMessage=" + introMessage + ", introLink=" + introLink
				+ ", introLinkName=" + introLinkName + ", introItems=" + introItems + "]";
	}
	
}
