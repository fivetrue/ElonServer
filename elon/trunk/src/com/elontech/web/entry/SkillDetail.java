package com.elontech.web.entry;

import com.fivetrue.db.DatabaseObject;

public class SkillDetail extends DatabaseObject {
	private String skillName = null;
	private String skillDescription = null;
	private String skillImageUrl = null;
	private String skillImageName = null;
	
	public SkillDetail(String name, String desc, String imageUrl, String imageUrlName){
		skillName = name;
		skillDescription = desc;
		skillImageUrl = imageUrl;
		skillImageName = imageUrlName;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public String getSkillDescription() {
		return skillDescription;
	}
	public void setSkillDescription(String skillDescription) {
		this.skillDescription = skillDescription;
	}
	public String getSkillImageUrl() {
		return skillImageUrl;
	}
	public void setSkillImageUrl(String skillImageUrl) {
		this.skillImageUrl = skillImageUrl;
	}
	public String getSkillImageName() {
		return skillImageName;
	}
	public void setSkillImageName(String skillImageName) {
		this.skillImageName = skillImageName;
	}
	@Override
	public String toString() {
		return "SkillDetail [skillName=" + skillName + ", skillDescription=" + skillDescription + ", skillImageUrl="
				+ skillImageUrl + ", skillImageName=" + skillImageName + "]";
	}
}
