package com.elontech.web.entry;

import java.util.ArrayList;
import java.util.List;

import com.elontech.web.vo.ImageItem;
import com.elontech.web.vo.SimpleMessage;
import com.elontech.web.vo.MainMessage;

public class IntroduceContents {
	
	private MainMessage introduceMain = null;
	private List<SimpleMessage> introMessage = new ArrayList<>();
	
	private String companyHistoryTitle = null;
	private List<SimpleMessage> companyHistory = new ArrayList<>();
	
	private ImageItem companyResponsiveImage = null;
	private ImageItem introducResponsiveImage = null;
	
	
	public MainMessage getIntroduceMain() {
		return introduceMain;
	}
	public void setIntroduceMain(MainMessage introduceMain) {
		this.introduceMain = introduceMain;
	}
	public List<SimpleMessage> getIntroMessage() {
		return introMessage;
	}
	public void setIntroMessage(List<SimpleMessage> introMessage) {
		this.introMessage = introMessage;
	}
	
	public ImageItem getCompanyResponsiveImage() {
		return companyResponsiveImage;
	}
	public void setCompanyResponsiveImage(ImageItem companyResponsiveImage) {
		this.companyResponsiveImage = companyResponsiveImage;
	}
	public ImageItem getIntroducResponsiveImage() {
		return introducResponsiveImage;
	}
	public void setIntroducResponsiveImage(ImageItem introducResponsiveImage) {
		this.introducResponsiveImage = introducResponsiveImage;
	}
	
	public String getCompanyHistoryTitle() {
		return companyHistoryTitle;
	}
	public void setCompanyHistoryTitle(String companyHistoryTitle) {
		this.companyHistoryTitle = companyHistoryTitle;
	}
	public List<SimpleMessage> getCompanyHistory() {
		return companyHistory;
	}
	public void setCompanyHistory(List<SimpleMessage> companyHistory) {
		this.companyHistory = companyHistory;
	}
	@Override
	public String toString() {
		return "IntroduceContents [introduceMain=" + introduceMain + ", introMessage=" + introMessage
				+ ", companyHistoryTitle=" + companyHistoryTitle + ", companyHistory=" + companyHistory
				+ ", companyResponsiveImage=" + companyResponsiveImage + ", introducResponsiveImage="
				+ introducResponsiveImage + "]";
	}
}
