package com.elontech.web.entry;

import java.util.ArrayList;

import com.fivetrue.db.DatabaseObject;
import com.fivetrue.db.annotation.MemberVariable;

public class Introduce extends DatabaseObject {
	
	private String introduceTitle = null;
	private String introduceMessage = null;
	private String introduceContent = null;
	private String introduceImageUrl = null;
	private String introduceImageUrlName = null;
	private String introduceAuthor = null;
	private String introduceDate = null;
	
	@MemberVariable
	private ArrayList<HistoryItem> histories = null;

	public String getIntroduceTitle() {
		return introduceTitle;
	}

	public void setIntroduceTitle(String introduceTitle) {
		this.introduceTitle = introduceTitle;
	}

	public String getIntroduceMessage() {
		return introduceMessage;
	}

	public void setIntroduceMessage(String introduceMessage) {
		this.introduceMessage = introduceMessage;
	}

	public String getIntroduceContent() {
		return introduceContent;
	}

	public void setIntroduceContent(String introduceContent) {
		this.introduceContent = introduceContent;
	}

	public String getIntroduceImageUrl() {
		return introduceImageUrl;
	}

	public void setIntroduceImageUrl(String introduceImageUrl) {
		this.introduceImageUrl = introduceImageUrl;
	}

	public String getIntroduceImageUrlName() {
		return introduceImageUrlName;
	}

	public void setIntroduceImageUrlName(String introduceImageUrlName) {
		this.introduceImageUrlName = introduceImageUrlName;
	}

	public ArrayList<HistoryItem> getHistories() {
		return histories;
	}

	public void setHistories(ArrayList<HistoryItem> histories) {
		this.histories = histories;
	}
	

	public String getIntroduceAuthor() {
		return introduceAuthor;
	}

	public void setIntroduceAuthor(String introduceAuthor) {
		this.introduceAuthor = introduceAuthor;
	}

	public String getIntroduceDate() {
		return introduceDate;
	}

	public void setIntroduceDate(String introduceDate) {
		this.introduceDate = introduceDate;
	}

	@Override
	public String toString() {
		return "Introduce [introduceTitle=" + introduceTitle + ", introduceMessage=" + introduceMessage
				+ ", introduceContent=" + introduceContent + ", introduceImageUrl=" + introduceImageUrl
				+ ", introduceImageUrlName=" + introduceImageUrlName + ", introduceAuthor=" + introduceAuthor
				+ ", introduceDate=" + introduceDate + ", histories=" + histories + "]";
	}
	
}
