package kong.my.service;

import java.util.List;

import kong.my.domain.SeoulVO;

public interface seoulService {
	
	// 서울시 전국구 목록 조회
		public List<SeoulVO> seoulList(); 
}
