package org.zerock.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAO {
	@Inject
	private SqlSession sqlSession;

	@Override
	public String readTime() throws Exception {
		Object result = sqlSession.selectOne("org.zerock.mapper.MemberMapper.getTime");
		
		return (String)result;
	}

}
