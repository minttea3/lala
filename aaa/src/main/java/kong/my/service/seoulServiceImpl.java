package kong.my.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kong.my.dao.seoulDAO;
import kong.my.domain.SeoulVO;
@Service	
public class seoulServiceImpl implements seoulService {
	
	@Inject
	 private seoulDAO dao;
	
	// 서울시 전국구 목록 조회
	@Override
	public List<SeoulVO> seoulList() {
		return dao.seoulList();
	}
	

}
