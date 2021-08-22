package kong.my.service;

import java.util.List;
import java.util.Map;

import kong.my.domain.CsCenterVO;

public interface csCenterService {
	/*
	 * Service는 비지니스 로직이 들어가는 부분이다. Controller가 Request를 받으면 적절한 Service에 전달하고, 전달
	 * 받은 Service는 비즈니스 로직을 처리한다. DAO로 데이터베이스를 접근하고, DTO로 데이터를 전달받은 다음, 적절한 처리를 해
	 * 반환한다.
	 */
	
	// 방명록 전체 목록 조회
	public List<CsCenterVO> csCenterList();
	
	// 방명록 글쓰기
	public void csCenterCreate(CsCenterVO vo);
	
	// 방명록 본문 보기
	public CsCenterVO csCenterDetail(int idx);
	
	// 방명록 글 수정하기
	public void csCenterUpdate(CsCenterVO vo);

	// 방명록 글 삭제하기
	public void csCenterDelete(int idx);
	
	// 작성자 이름으로 검색하기
	public List<CsCenterVO> csCenterWriterList(String writer);
	
	// 여러 조건으로 검색하기 (순번, 작성자, 날짜)
	public List<CsCenterVO> csCenterAllSearchList(Map<String,Object> map);
}
