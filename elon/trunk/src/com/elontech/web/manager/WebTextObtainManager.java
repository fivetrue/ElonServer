package com.elontech.web.manager;

import com.elontech.web.entry.CompanyInfo;
import com.elontech.web.entry.Header;
import com.elontech.web.entry.IntroMain;
import com.elontech.web.entry.Introduce;
import com.elontech.web.entry.Products;
import com.elontech.web.entry.Skills;

public class WebTextObtainManager {
	
	private static final String TAG = WebTextObtainManager.class.getSimpleName();
	
	private static WebTextObtainManager sInstance = null;
	
	public static WebTextObtainManager getInstance(){
		if(sInstance == null){
			sInstance = new WebTextObtainManager();
		}
		return sInstance;
	}
	
	public IntroMain getIntroMain(){
		IntroMain main = IntroManager.getInstance().getIntro();
		return main;
	}
	
	public Introduce getIntroduceContents(){
		Introduce introduce = IntroduceManager.getInstance().getProductsInfo();
		return introduce;
	}
	
	public Skills getSkills(){
		Skills skill = SkillsManager.getInstance().getSkillsInfo();
		skill.setSkillDetails(SkillDetailManager.getInstance().getDefaultSkillDetails());
		return skill;
	}
	
	public CompanyInfo getCompanyInfo(){
		return CompanyInfoManager.getInstance().getCompanyInfo();
	}
	
	public Header getHeader(){
		Header header = new Header();
		header.setWebPageName("(주)엘론텍");
		return header;
	}
	
	
	public Products getProductsInfo(){
		return ProductsManager.getInstance().getProductsInfo();
	}
	

}
