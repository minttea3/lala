package kong.my.dao;

import java.util.List;

import kong.my.domain.HotPlaceVO;

public interface hotPlaceDAO {
	// 핫플레이스 목록 조회
	public List<HotPlaceVO> hotPlaceList(); 
}
