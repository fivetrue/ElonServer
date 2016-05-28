package com.elontech.web.manager;

import java.util.ArrayList;

import com.elontech.web.Constants;
import com.elontech.web.entry.Products;
import com.elontech.web.entry.Skills;
import com.elontech.web.vo.MainMessage;
import com.fivetrue.db.manager.DatabaseManagerImpl;

public class ProductsManager extends DatabaseManagerImpl<Products>{
	
	private static ProductsManager sInstance = null;
	
	public static ProductsManager getInstance(){
		if(sInstance == null){
			sInstance = new ProductsManager();
		}
		return sInstance;
	}

	protected ProductsManager() {
		super(Constants.DB_SERVER, Constants.DB_NAME, Constants.DB_ID, Constants.DB_PASS);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Class<? extends Products> getDatabaseObjectClass() {
		// TODO Auto-generated method stub
		return Products.class;
	}
	
	public Products getProductsInfo(){
		ArrayList<Products> infos = getSelectQueryData(null, null);
		Products product = null;
		if(infos != null && infos.size() > 0){
			product = infos.get(0);
		}else{
			product = getDefaultData();
		}
		product.setProductDetails(ProductDetailManager.getInstance().getProductsInfos());
		return product;
	}
	
	@Override
	public Products getDefaultData(){
		Products products = new Products();
		products.setTitle("주요제품소개");
		products.setDescription("");
		products.setProductsLink("https://s3-ap-northeast-1.amazonaws.com/fivetrue-drip/%5B%E1%84%8B%E1%85%A6%E1%86%AF%E1%84%85%E1%85%A9%E1%86%AB%E1%84%90%E1%85%A6%E1%86%A8%5D%E1%84%8C%E1%85%AE%E1%84%8B%E1%85%AD%E1%84%8C%E1%85%A6%E1%84%91%E1%85%AE%E1%86%B7%E1%84%89%E1%85%A9%E1%84%80%E1%85%A2%E1%84%89%E1%85%A5+2016%E1%84%82%E1%85%A7%E1%86%AB.pdf");
		products.setProductsLinkName("DETAIL");
		return products;
	}

}
