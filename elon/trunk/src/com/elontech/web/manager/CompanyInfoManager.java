package com.elontech.web.manager;

import java.util.ArrayList;

import com.elontech.web.Constants;
import com.elontech.web.entry.CompanyInfo;
import com.fivetrue.db.manager.DatabaseManagerImpl;

public class CompanyInfoManager extends DatabaseManagerImpl<CompanyInfo>{
	
	private static CompanyInfoManager sInstance = null;
	
	public static CompanyInfoManager getInstance(){
		if(sInstance == null){
			sInstance = new CompanyInfoManager();
		}
		return sInstance;
	}

	protected CompanyInfoManager() {
		super(Constants.DB_SERVER, Constants.DB_NAME, Constants.DB_ID, Constants.DB_PASS);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Class<? extends CompanyInfo> getDatabaseObjectClass() {
		// TODO Auto-generated method stub
		return CompanyInfo.class;
	}
	
	public CompanyInfo getCompanyInfo(){
		ArrayList<CompanyInfo> infos = getSelectQueryData(null, null);
		if(infos != null && infos.size() > 0){
			return infos.get(0);
		}else{
			return getDefaultData();
		}
	}
	
	@Override
	public CompanyInfo getDefaultData(){
		CompanyInfo info = new CompanyInfo();
		info.setCompanyName("(주)엘론텍");
		info.setCategory("자동화 시스템 개발공급,비젼검사장비,조명 & 조명컨트롤러 공급 DIO Terminal,Motor Controller Unit 개발 및 공급 사업, 의료기기 개발사업 외");
		info.setFoundationDate("2016년 04월 01일");
		info.setOwner("이현대");
		info.setAddress("경기도 부천시 원미구 소향로 223, 1007호(중동, 굿모닝위너스텔 3차)");
		info.setCompanyId("122-87-00387");
		info.setTelephon("032-328-4196");
		info.setFax("032-328-4197");
		return info;
	}

}
