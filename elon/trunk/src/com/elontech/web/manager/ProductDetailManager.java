package com.elontech.web.manager;

import java.util.ArrayList;

import com.elontech.web.Constants;
import com.elontech.web.entry.ProductDetail;
import com.elontech.web.entry.SkillDetail;
import com.elontech.web.vo.MainMessage;
import com.fivetrue.db.manager.DatabaseManagerImpl;

public class ProductDetailManager extends DatabaseManagerImpl<ProductDetail>{
	
	private static ProductDetailManager sInstance = null;
	
	public static ProductDetailManager getInstance(){
		if(sInstance == null){
			sInstance = new ProductDetailManager();
		}
		return sInstance;
	}

	protected ProductDetailManager() {
		super(Constants.DB_SERVER, Constants.DB_NAME, Constants.DB_ID, Constants.DB_PASS);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Class<? extends ProductDetail> getDatabaseObjectClass() {
		// TODO Auto-generated method stub
		return ProductDetail.class;
	}
	
	public ArrayList<ProductDetail> getProductsInfos(){
		ArrayList<ProductDetail> detail = getSelectQueryData(null, null);
		return detail != null && detail.size() > 0 ? detail : getDefaultProductDetails();
	}
	
	@Override
	public ProductDetail getDefaultData(){
		ProductDetail details = new ProductDetail("VISION", "주요 VISION<br>핸드폰 배터리 레이저 용접 두께 측정 비젼 시스템 / "
				+ "LCD Grinder Align / "
				+ "LCD Burr Checker / "
				+ "LCD Seal 단선 검사 / "
				+ "BGA Ball Attach / "
				+ "반도체 칩 Lazer Marking 검사 / "
				+ "ITO 필름 합착기 / "
				+ "LED 외관검사 이물, 깨짐, 칩, 와이어 외", null, null);
		return details;
	}
	
	public ArrayList<ProductDetail> getDefaultProductDetails(){
		ArrayList<ProductDetail> details = new ArrayList<>();
		details.add(new ProductDetail("VISION", "주요 VISION<br>핸드폰 배터리 레이저 용접 두께 측정 비젼 시스템 / "
				+ "LCD Grinder Align / "
				+ "LCD Burr Checker / "
				+ "LCD Seal 단선 검사 / "
				+ "BGA Ball Attach / "
				+ "반도체 칩 Lazer Marking 검사 / "
				+ "ITO 필름 합착기 / "
				+ "LED 외관검사 이물, 깨짐, 칩, 와이어 외", null, null));
		
		details.add(new ProductDetail("LED HEAT CHECKER CONTROLLER", "엘론의 독자적인 Speed 머신기술을 체택하여 제작되었으며" 
				+ "귀사 제품의 불량률 감소 및 검사시간 단축, 제품의 신뢰성을 높여드리는 엘론의 핵심 제품입니다.", null, null));
		
		details.add(new ProductDetail("LED LIGHT", "", null, null));
		
		details.add(new ProductDetail("LED LIGHT CONTROLLER", "", null, null));
		
		details.add(new ProductDetail("MOTOR", "STM17 Series / " 
		+ "STM23 Series / "
				+ "STM24 Series", null, null));
		
		
		details.add(new ProductDetail("SMPS", "MF50N Series / " 
				+ "MF100A Series"
				+ "MF150A Series / " 
				+ "MF320A Series", null, null));
		return details;
	}
}
