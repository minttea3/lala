package kong.my.dao;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kong.my.domain.CsCenterVO;
@Repository
public class csCenterDAOImpl implements csCenterDAO {
	
	 @Inject
	 private SqlSession sql;
	 
	 private static String namespace = "kong.board.mappers.cscenter";
	
	// 방명록 전체 목록 조회
	@Override
	public List<CsCenterVO> csCenterList() {
		return sql.selectList(namespace + ".csCenterList");
	} 
		
	// 방명록 글쓰기
	@Override
	public void csCenterCreate(CsCenterVO vo) {
		sql.insert(namespace+ ".csCentercreate", vo);
	}
	
	// 방명록 상세 보기
	@Override
	public CsCenterVO csCenterDetail(int idx) {
		return sql.selectOne(namespace+ ".csCenterDetail", idx);
	}
	// 방명록 글 수정하기
	public void csCenterUpdate(CsCenterVO vo) {
		sql.update(namespace+".csCenterUpDate", vo);
	}
		
	// 방명록 글 삭제하기
	@Override
	public void csCenterDelete(int idx) {
		sql.delete(namespace+".csCenterDelete", idx);
	}
	// 작성자 이름으로 검색하기
	@Override
	public List<CsCenterVO> csCenterWriterList(String writer) {
		return sql.selectList(namespace + ".csCenterSearch", writer);
	}
	// 여러 조건으로 검색하기 (순번, 작성자, 날짜)
	@Override
	public List<CsCenterVO> csCenterAllSearchList(Map<String,Object> map) {
		return sql.selectList(namespace + ".csCenterAllSearch", map);
	}
	

}
