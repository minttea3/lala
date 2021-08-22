package kong.my.project;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kong.my.domain.CsCenterVO;
import kong.my.service.csCenterService;

@Controller
@RequestMapping("/csCenter/*")

public class CscenterController {
	
	@Inject
	private csCenterService service;
	
	 // 전체 조회  
	 @RequestMapping(value="/csCenterList", method=RequestMethod.GET) //url mapping
	    public String getList( Model model ) throws Exception{
		 	List<CsCenterVO> list = service.csCenterList();
		 	model.addAttribute( "list", list );
	        //board/list.jsp로 포워딩
	        return "csCenter/csCenterList";
		 	
	    }
	 // 방명록 작성 페이지로 이동
	    @RequestMapping(value = "/csCenterCreate", method = RequestMethod.GET)
	    public String getcreate() throws Exception {
	       return "csCenter/csCenterCreate";
	    }
	// 방명록 작성 post
	    @RequestMapping(value = "/csCenterCreate", method = RequestMethod.POST)
	    public String postcreate(CsCenterVO vo) throws Exception {
	    	service.csCenterCreate(vo);
	       return "redirect:csCenterList";
	    }
	 // 방명록 상세 페이지로 이동
	    @RequestMapping(value = "/csCenterDetail", method = RequestMethod.GET)
	    public String getdetail(Model model, int idx) {
	    	CsCenterVO data = service.csCenterDetail(idx); //idx값 넘김
	    	model.addAttribute("data",data);
	       return "csCenter/csCenterDetail";
	    }
	    // 방명록 수정 페이지로 이동
	    @RequestMapping(value = "/csCenterUpdate", method = RequestMethod.GET)
	    public String getupdate(int idx, Model model) throws Exception {
	    	CsCenterVO data = service.csCenterDetail(idx); //idx값 넘김
	    	model.addAttribute("data",data);
	       return "csCenter/csCenterUpdate";
	    } 
	    // 방명록 수정 post
	    @RequestMapping(value="/csCenterUpdate", method=RequestMethod.POST)
	    public String postupdate(CsCenterVO vo) throws Exception {
	        service.csCenterUpdate(vo);
	        return "redirect:csCenterList"; // 리스트로 리다이렉트
	    }
	    
	    // 방명록 삭제
	    @RequestMapping(value = "/csCenterDelete", method = RequestMethod.GET)
	    public String postdelete(int idx) throws Exception {
	    	service.csCenterDelete(idx);
	       return "redirect:csCenterList";
	    }
	    //게시물 선택삭제
	    @RequestMapping(value = "/delete")
	    public String ajaxTest(HttpServletRequest request) {
	            
	        String[] ajaxMsg = request.getParameterValues("valueArr");
	       
	        // 형변환
	        int[] ajaxVal = new int[ajaxMsg.length];
	        for(int i = 0; i<ajaxMsg.length; i++) {
	        	ajaxVal[i] = Integer.parseInt(ajaxMsg[i]);
	        }
	        
	        int size = ajaxMsg.length;
	        for(int i = 0; i<size; i++) {
	        	service.csCenterDelete(ajaxVal[i]);
	        }
	        return "redirect:csCenterList";
	    }
}
