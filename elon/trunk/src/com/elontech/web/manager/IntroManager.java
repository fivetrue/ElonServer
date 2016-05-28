package com.elontech.web.manager;

import java.util.ArrayList;

import com.elontech.web.Constants;
import com.elontech.web.entry.IntroMain;
import com.elontech.web.vo.MainMessage;
import com.fivetrue.db.manager.DatabaseManagerImpl;

public class IntroManager extends DatabaseManagerImpl<IntroMain>{
	
	private static IntroManager sInstance = null;
	
	public static IntroManager getInstance(){
		if(sInstance == null){
			sInstance = new IntroManager();
		}
		return sInstance;
	}

	protected IntroManager() {
		super(Constants.DB_SERVER, Constants.DB_NAME, Constants.DB_ID, Constants.DB_PASS);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Class<? extends IntroMain> getDatabaseObjectClass() {
		// TODO Auto-generated method stub
		return IntroMain.class;
	}
	
	public IntroMain getIntro(){
		ArrayList<IntroMain> infos = getSelectQueryData(null, null);
		IntroMain intro = null;
		if(infos != null && infos.size() > 0){
			intro = infos.get(0);
		}else{
			intro = getDefaultData();
		}
		intro.setIntroItems(IntroItemManager.getInstance().getIntroItems());
		return intro;
	}
	
	@Override
	public IntroMain getDefaultData(){
		IntroMain intro = new IntroMain();
		intro.setIntroTitle("(주)엘론텍");
		intro.setIntroMessage("고객이 필요한 제품을 만드는 기업");
		intro.setIntroLink("https://s3-ap-northeast-1.amazonaws.com/fivetrue-drip/ELON+LIGHTING+SOLUTION_2016.pdf");
		intro.setIntroLinkName("카탈로그 다운로드");
		return intro;
	}

}
