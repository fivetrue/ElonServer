package com.elontech.web.entry;

import java.util.List;

import com.elontech.web.vo.SimpleMessage;
import com.elontech.web.vo.MainMessage;

public class TopContents {
	
	private String webName = null;
	private MainMessage topMain = null;
	private List<SimpleMessage> topIntros = null;
	
	public String getWebName() {
		return webName;
	}
	public void setWebName(String webName) {
		this.webName = webName;
	}
	public MainMessage getTopMain() {
		return topMain;
	}
	public void setTopMain(MainMessage topMain) {
		this.topMain = topMain;
	}
	public List<SimpleMessage> getTopIntros() {
		return topIntros;
	}
	public void setTopIntros(List<SimpleMessage> topIntros) {
		this.topIntros = topIntros;
	}
	@Override
	public String toString() {
		return "TopContents [webName=" + webName + ", topMain=" + topMain + ", topIntros=" + topIntros + "]";
	}
}
