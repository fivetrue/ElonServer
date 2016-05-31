package com.elontech.web.entry;

import java.util.ArrayList;

import com.fivetrue.db.DatabaseObject;
import com.fivetrue.db.annotation.MemberVariable;

public class Products extends DatabaseObject {
	
	private String title = null;
	private String description = null;
	private String productsLink = null;
	private String productsLinkName = null;
	private String productImageUrl = null;
	private String productImageUrlName = null;
	
	@MemberVariable
	private ArrayList<ProductDetail> productDetails = null;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProductsLink() {
		return productsLink;
	}

	public void setProductsLink(String productsLink) {
		this.productsLink = productsLink;
	}

	public String getProductsLinkName() {
		return productsLinkName;
	}

	public void setProductsLinkName(String productsLinkName) {
		this.productsLinkName = productsLinkName;
	}

	public ArrayList<ProductDetail> getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(ArrayList<ProductDetail> productDetails) {
		this.productDetails = productDetails;
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
		return "Products [title=" + title + ", description=" + description + ", productsLink=" + productsLink
				+ ", productsLinkName=" + productsLinkName + ", productImageUrl=" + productImageUrl
				+ ", productImageUrlName=" + productImageUrlName + ", productDetails=" + productDetails + "]";
	}
	
}
