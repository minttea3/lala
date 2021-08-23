package kong.my.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kong.my.domain.HotPlaceVO;
@Repository
public class hotPlaceDAOImpl implements hotPlaceDAO {
	@Inject
	 private SqlSession sql;
	
	 private static String namespace = "kong.board.mappers.hotplace";
	
	@Override
	public List<HotPlaceVO> hotPlaceList() {
		return sql.selectList(namespace+".hotPlaceList");
	}

}
