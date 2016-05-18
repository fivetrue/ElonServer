package com.elontech.web.vo;

public class SimpleMessage {
	
	private String title = null;
	private String content = null;
	
	public SimpleMessage(){};
	
	public SimpleMessage(String title, String content){
		this.title = title;
		this.content = content;
	}
	
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
	@Override
	public String toString() {
		return "SimpleMessage [title=" + title + ", content=" + content + "]";
	}
}
