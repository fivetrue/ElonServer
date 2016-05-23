package com.elontech.web.entry;

import java.util.ArrayList;

import com.elontech.web.vo.MainMessage;
import com.elontech.web.vo.SimpleMessage;

public class ProductsInfo {
	
	private MainMessage title = null;
	private ArrayList<MainMessage> products = new ArrayList<>();
	public MainMessage getTitle() {
		return title;
	}
	public void setTitle(MainMessage title) {
		this.title = title;
	}
	public ArrayList<MainMessage> getProducts() {
		return products;
	}
	public void setProducts(ArrayList<MainMessage> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "ProductsInfo [title=" + title + ", products=" + products + "]";
	}
}
