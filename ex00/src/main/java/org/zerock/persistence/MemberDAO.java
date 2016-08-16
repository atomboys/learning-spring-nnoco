package org.zerock.persistence;

import org.zerock.web.domain.MemberVO;

public interface MemberDAO {
	public String readTime() throws Exception;
	public void createMember(MemberVO vo) throws Exception;
	public MemberVO readMember(String userId) throws Exception;
	public MemberVO readWithPW(String userId, String userPw) throws Exception;
}
