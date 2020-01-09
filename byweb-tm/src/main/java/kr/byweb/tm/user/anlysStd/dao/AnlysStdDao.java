package kr.byweb.tm.user.anlysStd.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AnlysStdDao {
	protected static final String NAMESPACE = "kr.byweb.tm.user.anlysStd.dao.";

	@Autowired
	private SqlSession sqlSession;

	public String selectTime(String queryId){
		return sqlSession.selectOne(NAMESPACE + queryId);
	}
}
