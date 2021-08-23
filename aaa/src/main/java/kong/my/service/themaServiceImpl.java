package kong.my.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kong.my.dao.themaDAO;
import kong.my.domain.ThemaVO;
@Service	
public class themaServiceImpl implements themaService {
	
	@Inject
	 private themaDAO dao;

	
	//테마 목록 조회
	@Override
	public List<ThemaVO> themaList() {
		return dao.themaList();
	}

}
