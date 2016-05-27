package com.elontech.web.entry;

import com.fivetrue.db.DatabaseObject;

public class ProductDetail extends DatabaseObject {
	
	private String productName = null;
	private String productDescription = null;
	private String productImageUrl = null;
	private String productImageUrlName = null;
	
	public ProductDetail(String name, String desc, String imageUrl, String imageUrlName){
		this.productName = name;
		this.productDescription = desc;
		this.productImageUrl = imageUrl;
		this.productImageUrlName = imageUrlName;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
	public String getProductImageUrl() {
		return productImageUrl;
	}

	public void setProductImageUrl(String productImageUrl) {
		this.productImageUrl = productImageUrl;
	}

	public String getProductImageUrlName() {
		return productImageUrlName;
	}

	public void setProductImageUrlName(String productImageUrlName) {
		this.productImageUrlName = productImageUrlName;
	}

	@Override
	public String toString() {
		return "ProductDetail [productName=" + productName + ", productDescription=" + productDescription + "]";
	}

}
