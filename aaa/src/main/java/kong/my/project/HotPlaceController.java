package kong.my.project;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kong.my.domain.HotPlaceVO;
import kong.my.domain.SeoulVO;
import kong.my.domain.ThemaVO;
import kong.my.service.hotPlaceService;
import kong.my.service.seoulService;
import kong.my.service.themaService;

@Controller
@RequestMapping("/hotPlace/*")

public class HotPlaceController {
	@Inject
	private seoulService sservice;
	private themaService tservice;
	private hotPlaceService hservice;
	
	// 전국구 조회
	 @RequestMapping(value="/hotPlaceList", method=RequestMethod.GET) //url mapping
	 public String getHotPlaceList(Model model) throws Exception{
		 // 구 리스트
		 List<SeoulVO> list = sservice.seoulList();
		 model.addAttribute( "list", list );
		 
		 // 테마 리스트
//		 List<ThemaVO> list2 = tservice.themaList();
//		 model.addAttribute( "list2", list2 );
		 
		 // 핫플레이스 리스트
//		 List<HotPlaceVO> list3 = hservice.hotPlaceList();
//		 model.addAttribute( "list3", list3 );
		 return "/hotPlace/hotPlaceList";
	 }

	 

}

