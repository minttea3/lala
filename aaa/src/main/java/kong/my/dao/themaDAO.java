package kong.my.dao;

import java.util.List;

import kong.my.domain.ThemaVO;


public interface themaDAO {
	// 테마 목록 조회
	public List<ThemaVO> themaList(); 
}
