package com.elontech.web.vo;

public class ImageItem {
	
	private String name = null;
	private String linkName = null;
	private String imageUrl = null;
	
	public ImageItem(){}
	
	public ImageItem(String name, String linkName, String imageUrl){
		this.name = name;
		this.linkName = linkName;
		this.imageUrl = imageUrl;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLinkName() {
		return linkName;
	}
	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	@Override
	public String toString() {
		return "ImageItem [name=" + name + ", linkName=" + linkName + ", imageUrl=" + imageUrl + "]";
	}
}
