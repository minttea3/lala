package kong.my.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kong.my.dao.hotPlaceDAO;
import kong.my.domain.HotPlaceVO;
@Service	
public class hotPlaceServiceImpl implements hotPlaceService {
	@Inject
	 private hotPlaceDAO dao;
	// 핫플레이스 목록 조회
	@Override
	public List<HotPlaceVO> hotPlaceList() {
		return dao.hotPlaceList();
	}

}
