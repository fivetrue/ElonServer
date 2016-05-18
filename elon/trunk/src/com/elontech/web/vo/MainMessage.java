package com.elontech.web.vo;

public class MainMessage {
	
	private String title = null;
	private String content = null;
	private String linkName = null;
	private String link = null;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getLinkName() {
		return linkName;
	}
	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	@Override
	public String toString() {
		return "MainMessage [title=" + title + ", content=" + content + ", linkName=" + linkName + ", link=" + link
				+ "]";
	}

}
