package kong.my.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kong.my.domain.SeoulVO;
@Repository
public class seoulDAOImpl implements seoulDAO {
	
	@Inject
	 private SqlSession sql;
	
	 private static String namespace = "kong.board.mappers.seoul";
	
	// 서울시 전국구 목록 조회
	@Override
	public List<SeoulVO> seoulList() {
		
		return sql.selectList(namespace + ".seoulList");
	}

}
