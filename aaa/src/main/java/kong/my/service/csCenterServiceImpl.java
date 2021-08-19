package kong.my.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kong.my.dao.csCenterDAO;
import kong.my.domain.CsCenterVO;
@Service
public class csCenterServiceImpl implements csCenterService {
	
	@Inject
	 private csCenterDAO dao;
	
	// 방명록 전체 목록 조회
	@Override
	public List<CsCenterVO> csCenterList() {
		return dao.csCenterList();
	}
	// 방명록 글쓰기
	@Override
	public void csCenterCreate(CsCenterVO vo) {
		dao.csCenterCreate(vo);
	}
	// 방명록 본문 보기
	@Override
	public CsCenterVO csCenterDetail(int idx) {
		return dao.csCenterDetail(idx);
	}
	
}
