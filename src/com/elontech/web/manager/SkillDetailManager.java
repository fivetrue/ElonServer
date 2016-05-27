package com.elontech.web.manager;

import java.util.ArrayList;

import com.elontech.web.Constants;
import com.elontech.web.entry.SkillDetail;
import com.fivetrue.db.manager.DatabaseManagerImpl;

public class SkillDetailManager extends DatabaseManagerImpl<SkillDetail>{
	
	private static SkillDetailManager sInstance = null;
	
	public static SkillDetailManager getInstance(){
		if(sInstance == null){
			sInstance = new SkillDetailManager();
		}
		return sInstance;
	}

	protected SkillDetailManager() {
		super(Constants.DB_SERVER, Constants.DB_NAME, Constants.DB_ID, Constants.DB_PASS);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Class<? extends SkillDetail> getDatabaseObjectClass() {
		// TODO Auto-generated method stub
		return SkillDetail.class;
	}
	
	public ArrayList<SkillDetail> getSkillsInfo(){
		ArrayList<SkillDetail> detail = getSelectQueryData(null, null);
		return detail != null && detail.size() > 0 ? detail : getDefaultSkillDetails();
	}
	
	@Override
	public SkillDetail getDefaultData(){
		SkillDetail skill = new SkillDetail("기계설계 기술 (Solid Works)", "2D,3D 설계 기술 자동화 장비 (Labeler, Winding System) "
				+ "의료기기 (X-RAY, 수술대, Table 등)", null, null);
		return skill;
	}
	
	public ArrayList<SkillDetail> getDefaultSkillDetails(){
		ArrayList<SkillDetail> details = new ArrayList<>();
		details.add(new SkillDetail("기계설계 기술 (Solid Works)", "2D,3D 설계 기술 자동화 장비 (Labeler, Winding System) "
				+ "의료기기 (X-RAY, 수술대, Table 등)", null, null));
		details.add(new SkillDetail("하드웨어설계 기술", "통신 기술 (USB,RS232,Ethernet,RF,ZigBee 등) "
				+ "제어 기술 (AC,DC,STEP모터 DIO 등)"
				+ "카메라 영상 획득 기술", null, null));
		details.add(new SkillDetail("펌웨어 기술", "PIC,AVR Micro-controller", null, null));
		details.add(new SkillDetail("소프트웨어 기술", "Visual Studio 2008 (C#,C++)", null, null));
		return details;
	}
}
