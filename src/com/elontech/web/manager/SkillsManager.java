package com.elontech.web.manager;

import java.util.ArrayList;

import com.elontech.web.Constants;
import com.elontech.web.entry.Skills;
import com.fivetrue.db.manager.DatabaseManagerImpl;

public class SkillsManager extends DatabaseManagerImpl<Skills>{
	
	private static SkillsManager sInstance = null;
	
	public static SkillsManager getInstance(){
		if(sInstance == null){
			sInstance = new SkillsManager();
		}
		return sInstance;
	}

	protected SkillsManager() {
		super(Constants.DB_SERVER, Constants.DB_NAME, Constants.DB_ID, Constants.DB_PASS);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Class<? extends Skills> getDatabaseObjectClass() {
		// TODO Auto-generated method stub
		return Skills.class;
	}
	
	public Skills getSkillsInfo(){
		ArrayList<Skills> infos = getSelectQueryData(null, null);
		Skills skills = null;
		if(infos != null && infos.size() > 0){
			skills = infos.get(0);
		}else{
			skills = getDefaultData();
		}
		skills.setSkillDetails(SkillDetailManager.getInstance().getSkillsInfo());
		return skills;
	}
	
	@Override
	public Skills getDefaultData(){
		Skills skill = new Skills();
		skill.setTitle("보유 기술");
		skill.setDescription("");
		skill.setSkillLink("http://naver.com");
		skill.setSkillLinkName("More");
		skill.setSkillMainImageName("Skill");
		skill.setSkillMainImageUrl("img/macbook-abilities.png");
		return skill;
	}

}
