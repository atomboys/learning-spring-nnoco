package org.zerock.persistence;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.web.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	public static final String NAMESPACE = "org.zerock.mapper.MemberMapper";
	@Inject
	private SqlSession sqlSession;

	@Override
	public String readTime() throws Exception {
		Object result = sqlSession.selectOne(NAMESPACE + ".getTime");
		
		return (String)result;
	}

	@Override
	public void createMember(MemberVO vo) throws Exception {
		sqlSession.insert(NAMESPACE + ".create", vo);
		
	}

	@Override
	public MemberVO readMember(String userId) throws Exception {
		return (MemberVO)sqlSession.selectOne(NAMESPACE + ".read", userId);
	}

	@Override
	public MemberVO readWithPW(String userId, String userPw) throws Exception {
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("userid", userId);
		paramMap.put("userpw", userPw);
		
		return (MemberVO)sqlSession.selectOne(NAMESPACE + ".read", paramMap);
	}
	
	

}
