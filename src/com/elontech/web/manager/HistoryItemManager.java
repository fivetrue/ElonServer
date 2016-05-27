package com.elontech.web.manager;

import java.util.ArrayList;

import com.elontech.web.Constants;
import com.elontech.web.entry.HistoryItem;
import com.fivetrue.db.manager.DatabaseManagerImpl;

public class HistoryItemManager extends DatabaseManagerImpl<HistoryItem>{
	
	private static HistoryItemManager sInstance = null;
	
	public static HistoryItemManager getInstance(){
		if(sInstance == null){
			sInstance = new HistoryItemManager();
		}
		return sInstance;
	}

	protected HistoryItemManager() {
		super(Constants.DB_SERVER, Constants.DB_NAME, Constants.DB_ID, Constants.DB_PASS);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Class<? extends HistoryItem> getDatabaseObjectClass() {
		// TODO Auto-generated method stub
		return HistoryItem.class;
	}
	
	public ArrayList<HistoryItem> getHistories(){
		ArrayList<HistoryItem> detail = getSelectQueryData(null, null);
		return detail != null && detail.size() > 0 ? detail : getDefaultProductDetails();
	}
	
	@Override
	public HistoryItem getDefaultData(){
		HistoryItem details = new HistoryItem("2008년 08월", "지엘 창립");
		return details;
	}
	
	public ArrayList<HistoryItem> getDefaultProductDetails(){
		ArrayList<HistoryItem> histories = new ArrayList<>();
		histories.add(new HistoryItem("2008년 08월", "지엘 창립"));
		histories.add(new HistoryItem("2008년 12월", "조명컨트롤러 개발"));
		histories.add(new HistoryItem("2009년 01월", "검진대 컨트롤러 개발 (의료기기,P사)"));
		histories.add(new HistoryItem("2009년 02월", "프린터포트이용 DIO개발 (H사)"));
		histories.add(new HistoryItem("2009년 04월", "Auto Winding System 개발 (약국 자동화 장비,J사)"));
		histories.add(new HistoryItem("2009년 07월", "조명/조명콘트롤러 대리점 확보 (K사)"));
		histories.add(new HistoryItem("2009년 07월", "회사이전 (안산)"));
		histories.add(new HistoryItem("2009년 10월", "앰플,바이알 라벨부착기 개발 (약국 자동화 장비,J사)"));
		histories.add(new HistoryItem("2010년 04월", "Ceilling 임베디드 컨트롤러 개발 (X-RAY Unit,D사)"));
		histories.add(new HistoryItem("2010년 05월", "스크라버 모니터링 시스템 개발 (M사)"));
		histories.add(new HistoryItem("2010년 06월", "LED 히트 체커기 개발 (H사)"));
		histories.add(new HistoryItem("2010년 07월", "조명/조명컨트롤러 대리점 확보 (I사,J사)"));
		histories.add(new HistoryItem("2010년 07월", "스팟 용접기 개발 (Y사)ß"));
		histories.add(new HistoryItem("2010년 10월", "콜리메이터 인터페이스 컨트롤러 개발 (의료기기,D사)"));
		histories.add(new HistoryItem("2011년 04월", "맘모 컨트롤러 개발 (의료기기,V사)"));
		histories.add(new HistoryItem("2011년 05월", "TF Vision System 개발 (D사)"));
		histories.add(new HistoryItem("2016년 03월", "엘론텍 상호변경"));
		return histories;
	}
}
