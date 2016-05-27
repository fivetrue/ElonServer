package com.elontech.web.entry;

import com.fivetrue.db.DatabaseObject;

public class HistoryItem extends DatabaseObject {
	
	private String historyDate = null;
	private String historyContent = null;
	
	public HistoryItem(String date, String content){
		historyDate = date;
		historyContent = content;
	}
	public String getHistoryDate() {
		return historyDate;
	}
	public void setHistoryDate(String historyDate) {
		this.historyDate = historyDate;
	}
	public String getHistoryContent() {
		return historyContent;
	}
	public void setHistoryContent(String historyContent) {
		this.historyContent = historyContent;
	}
	@Override
	public String toString() {
		return "HistoryItem [historyDate=" + historyDate + ", historyContent=" + historyContent + "]";
	}
}
