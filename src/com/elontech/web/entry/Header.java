package com.elontech.web.entry;

public class Header {
	private String webPageName = null;

	public String getWebPageName() {
		return webPageName;
	}

	public void setWebPageName(String webPageName) {
		this.webPageName = webPageName;
	}

	@Override
	public String toString() {
		return "Header [webPageName=" + webPageName + "]";
	}

}
