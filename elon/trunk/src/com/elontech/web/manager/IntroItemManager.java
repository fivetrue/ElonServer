package com.elontech.web.manager;

import java.util.ArrayList;

import com.elontech.web.Constants;
import com.elontech.web.entry.IntroItem;
import com.elontech.web.vo.MainMessage;
import com.fivetrue.db.manager.DatabaseManagerImpl;

public class IntroItemManager extends DatabaseManagerImpl<IntroItem>{
	
	private static IntroItemManager sInstance = null;
	
	public static IntroItemManager getInstance(){
		if(sInstance == null){
			sInstance = new IntroItemManager();
		}
		return sInstance;
	}

	protected IntroItemManager() {
		super(Constants.DB_SERVER, Constants.DB_NAME, Constants.DB_ID, Constants.DB_PASS);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Class<? extends IntroItem> getDatabaseObjectClass() {
		// TODO Auto-generated method stub
		return IntroItem.class;
	}
	
	public ArrayList<IntroItem> getIntroItems(){
		ArrayList<IntroItem> detail = getSelectQueryData(null, null);
		return detail != null && detail.size() > 0 ? detail : getDefaultItems();
	}
	
	@Override
	public IntroItem getDefaultData(){
		IntroItem details = new IntroItem("비전검사시스템", "검사에 필요한 조명, 조명컨트롤러 개발");
		return details;
	}
	
	public ArrayList<IntroItem> getDefaultItems(){
		ArrayList<IntroItem> details = new ArrayList<>();
		details.add(new IntroItem("비전검사시스템", "검사에 필요한 조명, 조명컨트롤러 개발"));
		details.add(new IntroItem("LED HEAT CHECKER", "PCB 조립 과정에서 발생하는 불량 감소"));
		details.add(new IntroItem("의료기기산업", "산부인과 검진대, 수술대, X-RAY 실링, 맘모 등의 컨트롤러 개발 및 납품"));
		return details;
	}
}
