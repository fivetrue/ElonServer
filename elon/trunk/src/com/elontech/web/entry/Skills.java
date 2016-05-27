package com.elontech.web.entry;

import java.util.ArrayList;

import com.fivetrue.db.DatabaseObject;
import com.fivetrue.db.annotation.MemberVariable;

public class Skills extends DatabaseObject{
	private String title = null;
	private String description = null;
	private String skillLinkName = null;
	private String skillLink = null;
	private String skillMainImageUrl = null;
	private String skillMainImageName = null;
	
	@MemberVariable
	private ArrayList<SkillDetail> skillDetails = null;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSkillLinkName() {
		return skillLinkName;
	}

	public void setSkillLinkName(String skillLinkName) {
		this.skillLinkName = skillLinkName;
	}

	public String getSkillLink() {
		return skillLink;
	}

	public void setSkillLink(String skillLink) {
		this.skillLink = skillLink;
	}

	public ArrayList<SkillDetail> getSkillDetails() {
		return skillDetails;
	}

	public void setSkillDetails(ArrayList<SkillDetail> skillDetails) {
		this.skillDetails = skillDetails;
	}
	
	public String getSkillMainImageUrl() {
		return skillMainImageUrl;
	}

	public void setSkillMainImageUrl(String skillMainImageUrl) {
		this.skillMainImageUrl = skillMainImageUrl;
	}

	public String getSkillMainImageName() {
		return skillMainImageName;
	}

	public void setSkillMainImageName(String skillMainImageName) {
		this.skillMainImageName = skillMainImageName;
	}

	@Override
	public String toString() {
		return "Skills [title=" + title + ", description=" + description + ", skillLinkName=" + skillLinkName
				+ ", skillLink=" + skillLink + ", skillMainImageUrl=" + skillMainImageUrl + ", skillMainImageName="
				+ skillMainImageName + ", skillDetails=" + skillDetails + "]";
	}
	
}
