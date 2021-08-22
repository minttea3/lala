package kong.my.service;

import java.util.List;
import java.util.Map;

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
	
	// 방명록 수정
	@Override
	public void csCenterUpdate(CsCenterVO vo) {
		dao.csCenterUpdate(vo);
	}
	
	// 방명록 삭제
	public void csCenterDelete(int idx) {
		dao.csCenterDelete(idx);
	}
	
	// 작성자 이름으로 검색하기
	@Override
	public List<CsCenterVO> csCenterWriterList(String writer) {
		return dao.csCenterWriterList(writer);
	}
	// 여러 조건으로 검색하기 (순번, 작성자, 날짜)
	@Override
	public List<CsCenterVO> csCenterAllSearchList(Map<String,Object> map) {
		return dao.csCenterAllSearchList(map);
	}
	

}
