package com.elontech.web.manager;

import java.util.ArrayList;
import java.util.List;

import com.elontech.web.entry.CompanyInfo;
import com.elontech.web.entry.IntroduceContents;
import com.elontech.web.entry.Skills;
import com.elontech.web.entry.TopContents;
import com.elontech.web.vo.ImageItem;
import com.elontech.web.vo.MainMessage;
import com.elontech.web.vo.SimpleMessage;

public class WebTextObtainManager {
	
	private static final String TAG = WebTextObtainManager.class.getSimpleName();
	
	private static WebTextObtainManager sInstance = null;
	
	public static WebTextObtainManager getInstance(){
		if(sInstance == null){
			sInstance = new WebTextObtainManager();
		}
		return sInstance;
	}
	
	public TopContents getTopContents(){
		TopContents tct = new TopContents();
		tct.setWebName("ELON-TECH");
		tct.setTopMain(getTopMainMessage());
		tct.setTopIntros(getTopIntroMessages());
		return tct;
	}
	
	public IntroduceContents getIntroduceContents(){
		IntroduceContents itc = new IntroduceContents();
		MainMessage mainMessage = new MainMessage();
		mainMessage.setTitle("꿈의 직장을 만들겠다는 작은 꿈을 펼칠 수 있게 도와 주신 직원들과 지인들께 감사의 말을 전합니다.");
		mainMessage.setContent("엘론은 지엘은 2008년 8월 19일 회사를 설립한 이후 비젼검사시스템에 필요한 조명과 조명컨트롤러를 개발하였으며 "
				+ "표준화 보다는 고객이 원하는 제품을 만드는“고객중심 서비스”를 추구하였습니다. 이를 토대로 현재는 제품을 표준화 하여 "
				+ "홈페이지를 통해 고객에 더 빨리 다가가고자 합니다. 또한 LED 검사공정 중 고온을 가하여 점등 여부를 검사하는 "
				+ "LED Heat Checker를 개발하여 LED를 PCB에 조립하는 과정에서 나오는 불량을 줄이는데 기여하고 있습니다. "
				+ "현재 서울반도체, LUSEM, DS LCD 에서 사용하고 있습니다. 의료기기 분야에도 진출하여 산부인과 검진대, 수술대, "
				+ "X-RAY 실 링, 맘모 등에 들어가는 컨트롤러를 개발하여 납품하고 있습니다. 직원들의 미래에 대한 비젼과 꿈을 펼칠 "
				+ "수 있는 작지만 내실 있는 회사로, 고객이 필요로 하는 좋은 제품을 만들겠다는 다짐으로, 오늘의 땀방울이 내일의 산업으로 "
				+ "이어진다는 마음으로 하루 하루 더 발전하는 지엘이 되어가고 있습니다. "
				+ "다양한 제품으로 작지만 큰 기업으로 성장하는 지엘을 깊은 관심과 애정을 가지고 지켜봐 주시기 바랍니다. 감사합니다. ");
		
		mainMessage.setLinkName("2016.05 엘론텍 대표 이현대");
		itc.setIntroduceMain(mainMessage);
		
		itc.setCompanyHistoryTitle("회사 연혁");
		itc.getIntroMessage().add(new SimpleMessage("비전검사시스템", "검사에 필요한 조명, 조명컨트롤러 개발"));
		itc.getIntroMessage().add(new SimpleMessage("LED HEAT CHECKER", "PCB 조립 과정에서 발생하는 불량 감소"));
		itc.getIntroMessage().add(new SimpleMessage("의료기기산업", "산부인과 검진대, 수술대, X-RAY 실링, 맘모 등의 컨트롤러 개발 및 납품"));
		
		itc.setCompanyResponsiveImage(new ImageItem("company", "company", "img/pcb_image.jpg"));
		itc.setIntroducResponsiveImage(new ImageItem("company", "company", "img/pcb_image.jpg"));
		
		itc.getCompanyHistory().add(new SimpleMessage("2008년 08월", "지엘 창립"));
		itc.getCompanyHistory().add(new SimpleMessage("2008년 12월", "조명컨트롤러 개발"));
		itc.getCompanyHistory().add(new SimpleMessage("2009년 01월", "검진대 컨트롤러 개발 (의료기기,P사)"));
		itc.getCompanyHistory().add(new SimpleMessage("2009년 02월", "프린터포트이용 DIO개발 (H사)"));
		itc.getCompanyHistory().add(new SimpleMessage("2009년 03월", "바코드 라벨 부착기 개발 (약국 자동화 장비,J사)"));
		itc.getCompanyHistory().add(new SimpleMessage("2009년 04월", "Auto Winding System 개발 (약국 자동화 장비,J사)"));
		itc.getCompanyHistory().add(new SimpleMessage("2009년 07월", "조명/조명콘트롤러 대리점 확보 (K사)"));
		itc.getCompanyHistory().add(new SimpleMessage("2009년 07월", "회사이전 (안산)"));
		itc.getCompanyHistory().add(new SimpleMessage("2009년 10월", "앰플,바이알 라벨부착기 개발 (약국 자동화 장비,J사)"));
		itc.getCompanyHistory().add(new SimpleMessage("2010년 04월", "Ceilling 임베디드 컨트롤러 개발 (X-RAY Unit,D사)"));
		itc.getCompanyHistory().add(new SimpleMessage("2010년 05월", "스크라버 모니터링 시스템 개발 (M사)"));
		itc.getCompanyHistory().add(new SimpleMessage("2010년 06월", "LED 히트 체커기 개발 (H사)"));
		itc.getCompanyHistory().add(new SimpleMessage("2010년 07월", "조명/조명컨트롤러 대리점 확보 (I사,J사)"));
		itc.getCompanyHistory().add(new SimpleMessage("2010년 07월", "스팟 용접기 개발 (Y사)ß"));
		itc.getCompanyHistory().add(new SimpleMessage("2010년 10월", "콜리메이터 인터페이스 컨트롤러 개발 (의료기기,D사)"));
		itc.getCompanyHistory().add(new SimpleMessage("2011년 04월", "맘모 컨트롤러 개발 (의료기기,V사)"));
		itc.getCompanyHistory().add(new SimpleMessage("2011년 05월", "TF Vision System 개발 (D사)"));
		itc.getCompanyHistory().add(new SimpleMessage("2016년 03월", "엘론텍 상호변경"));
		return itc;
	}
	
	
	
	public MainMessage getTopMainMessage(){
		MainMessage tmm = new MainMessage();
		tmm.setTitle("Wellcome to ELON-TECH");
		tmm.setContent("세상을 살아가는 사람들의 이야기");
		tmm.setLinkName("카탈로그 다운로드");
		tmm.setLink("http://naver.com");
		return tmm;
	}
	
	public List<SimpleMessage> getTopIntroMessages(){
		List<SimpleMessage> tims = new ArrayList<SimpleMessage>();
		for(int i = 0 ; i < 3 ; i++){
			SimpleMessage tim = new SimpleMessage();
			tim.setTitle("TopIntroMessage " + i );
			tim.setContent("TopIntro Content " + i);
			tims.add(tim);
		}
		return tims;
	}
	
	public Skills getSkills(){
		Skills skill = new Skills();
		MainMessage mm = new MainMessage();
		mm.setTitle("보유 기술");
		mm.setContent("");
		mm.setLink("http://naver.com");
		mm.setLinkName("More");
		skill.setSkillMain(mm);
		skill.getSkillMessages().add(new SimpleMessage("기계설계 기술 (Solid Works)", "2D,3D 설계 기술 자동화 장비 (Labeler, Winding System) "
				+ "의료기기 (X-RAY, 수술대, Table 등)"));
		skill.getSkillMessages().add(new SimpleMessage("하드웨어설계 기술", "통신 기술 (USB,RS232,Ethernet,RF,ZigBee 등) "
				+ "제어 기술 (AC,DC,STEP모터 DIO 등)"
				+ "카메라 영상 획득 기술"));
		skill.getSkillMessages().add(new SimpleMessage("펌웨어 기술", "PIC,AVR Micro-controller"));
		skill.getSkillMessages().add(new SimpleMessage("소프트웨어 기술", "Visual Studio 2008 (C#,C++)"));
		skill.setImageItem(new ImageItem("skill", "skill", "img/pcb_image.jpg"));
		return skill;
	}
	
	public CompanyInfo getCompanyInfo(){
		CompanyInfo info = new CompanyInfo();
		info.setCompanyName(new SimpleMessage("법인명", "(주)엘론텍"));
		info.setCategory(new SimpleMessage("사업분야", "자동화 시스템 개발공급,비젼검사장비,조명 & 조명컨트롤러 공급 DIO Terminal,Motor Controller Unit 개발 및 공급 사업, 의료기기 개발사업 외"));
		info.setFoundationDate(new SimpleMessage("설립일", "2016년 04월 01일"));
		info.setOwner(new SimpleMessage("대표자", "이현대"));
		info.setAddress(new SimpleMessage("사업장","경기도 부천시 원미구 소향로 223, 1007호(중동, 굿모닝위너스텔 3차)"));
		info.setCompanyId(new SimpleMessage("등록번호", "122-87-00387"));
		info.setTelephon(new SimpleMessage("Tel.", "032-328-4196"));
		info.setFax(new SimpleMessage("Fax.", "032-328-4197"));
		return info;
	}
	

}
