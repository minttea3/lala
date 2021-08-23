package kong.my.service;

import java.util.List;

import kong.my.domain.ThemaVO;

public interface themaService {
	
	// 테마목록 조회
	public List<ThemaVO> themaList(); 
}