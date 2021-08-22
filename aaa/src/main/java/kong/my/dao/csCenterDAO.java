package kong.my.dao;

import java.util.List;
import java.util.Map;

import kong.my.domain.CsCenterVO;

public interface csCenterDAO {
	/*
	 * HTTP Request를 Web Application이 받게 되면 Thread를 생성하게 되는데 비즈니스 로직이 DB로부터 데이터를
	 * 얻어오기 위해 매번 Driver를 로드하고 Connection 객체를 생성하게 되면 엄청 많은 커넥션이 일어난다. 그래서 DAO를 하나
	 * 만들어 DB 전용 객체로만 쓰기 위해 dao package 를 만들어준다.
	 */
	
	// 방명록 전체 목록 조회
	public List<CsCenterVO> csCenterList(); 
	
	// 방명록 글쓰기
	public void csCenterCreate(CsCenterVO vo);
	
	// 방명록 상세 보기
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
