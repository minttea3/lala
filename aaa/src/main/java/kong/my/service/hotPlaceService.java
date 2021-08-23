package kong.my.service;

import java.util.List;

import kong.my.domain.HotPlaceVO;

public interface hotPlaceService {
	
	// 핫플레이스 목록 조회
	public List<HotPlaceVO> hotPlaceList(); 

}
