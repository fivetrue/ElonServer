package com.elontech.web.entry;

import java.util.ArrayList;
import java.util.List;

import com.elontech.web.vo.ImageItem;
import com.elontech.web.vo.MainMessage;
import com.elontech.web.vo.SimpleMessage;

public class Skills {
	private MainMessage skillMain = null;
	private List<SimpleMessage> skillMessages = new ArrayList<>();
	private ImageItem imageItem = null;
	
	

	public MainMessage getSkillMain() {
		return skillMain;
	}

	public void setSkillMain(MainMessage skillMain) {
		this.skillMain = skillMain;
	}

	public List<SimpleMessage> getSkillMessages() {
		return skillMessages;
	}

	public void setSkillMessages(List<SimpleMessage> skillMessages) {
		this.skillMessages = skillMessages;
	}
	
	public ImageItem getImageItem() {
		return imageItem;
	}

	public void setImageItem(ImageItem imageItem) {
		this.imageItem = imageItem;
	}

	@Override
	public String toString() {
		return "Skills [skillMain=" + skillMain + ", skillMessages=" + skillMessages + ", imageItem=" + imageItem + "]";
	}
}
