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
		products.setTitle("보유 기술");
		products.setDescription("");
		products.setProductsLink("http://naver.com");
		products.setProductsLinkName("DETAIL");
		return products;
	}

}
