package kong.my.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kong.my.domain.ThemaVO;
@Repository
public class themaDAOImpl implements themaDAO {
	

	@Inject
	 private SqlSession sql;
	
	 private static String namespace = "kong.board.mappers.thema";
	
	//전체 테마 목록 조회
	@Override
	public List<ThemaVO> themaList() {
		return sql.selectList(namespace + ".themaList");
	}

}
