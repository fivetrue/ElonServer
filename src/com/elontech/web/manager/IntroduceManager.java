package com.elontech.web.manager;

import java.util.ArrayList;

import com.elontech.web.Constants;
import com.elontech.web.entry.Introduce;
import com.fivetrue.db.manager.DatabaseManagerImpl;

public class IntroduceManager extends DatabaseManagerImpl<Introduce>{
	
	private static IntroduceManager sInstance = null;
	
	public static IntroduceManager getInstance(){
		if(sInstance == null){
			sInstance = new IntroduceManager();
		}
		return sInstance;
	}

	protected IntroduceManager() {
		super(Constants.DB_SERVER, Constants.DB_NAME, Constants.DB_ID, Constants.DB_PASS);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Class<? extends Introduce> getDatabaseObjectClass() {
		// TODO Auto-generated method stub
		return Introduce.class;
	}
	
	public Introduce getProductsInfo(){
		ArrayList<Introduce> infos = getSelectQueryData(null, null);
		Introduce introduce = null;
		if(infos != null && infos.size() > 0){
			introduce = infos.get(0);
		}else{
			introduce = getDefaultData();
		}
		introduce.setHistories(HistoryItemManager.getInstance().getHistories());
		return introduce;
	}
	
	@Override
	public Introduce getDefaultData(){
		Introduce introduce = new Introduce();
		introduce.setIntroduceTitle("회사 연혁");
		introduce.setIntroduceMessage("꿈의 직장을 만들겠다는 작은 꿈을 펼칠 수 있게 도와 주신 직원들과 지인들께 감사의 말을 전합니다.");
		introduce.setIntroduceContent("엘론은 2008년 8월 19일 회사를 설립한 이후 비젼검사시스템에 "
				+ "필요한 조명과 조명컨트롤러를 개발하였으며 표준화 보다는 고객이 원하는 제품을 만드는“고객중심 서비스”를 추구하였습니다. "
				+ "이를 토대로 현재는 제품을 표준화 하여 홈페이지를 통해 고객에 더 빨리 다가가고자 합니다. 또한 LED 검사공정 중 "
				+ "고온을 가하여 점등 여부를 검사하는 LED Heat Checker를 개발하여 LED를 PCB에 조립하는 과정에서 나오는 "
				+ "불량을 줄이는데 기여하고 있습니다. 현재 서울반도체, LUSEM, DS LCD 에서 사용하고 있습니다. "
				+ "의료기기 분야에도 진출하여 산부인과 검진대, 수술대, X-RAY 실 링, 맘모 등에 들어가는 "
				+ "컨트롤러를 개발하여 납품하고 있습니다. 직원들의 미래에 대한 비젼과 꿈을 펼칠 수 있는 작지만 내실 있는 회사로, "
				+ "고객이 필요로 하는 좋은 제품을 만들겠다는 다짐으로, 오늘의 땀방울이 내일의 산업으로 이어진다는 마음으로 하루 하루 더 발전하는 "
				+ "지엘이 되어가고 있습니다. 다양한 제품으로 작지만 큰 기업으로 성장하는 지엘을 깊은 관심과 애정을 가지고 지켜봐 주시기 바랍니다. "
				+ "감사합니다.");
		introduce.setIntroduceDate("2016.05");
		introduce.setIntroduceAuthor("엘론텍 대표 이현대");
		introduce.setIntroduceImageUrl("https://s3-ap-northeast-1.amazonaws.com/fivetrue-drip/1459698384777.jpg");
//		introduce.setIntroduceImageUrl("/img/lamp_small.png");
		introduce.setIntroduceImageUrlName("company");
		return introduce;
	}

}
