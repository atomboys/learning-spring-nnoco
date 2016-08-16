package org.zerock.mapper;

import org.apache.ibatis.annotations.Param;
import org.zerock.web.domain.MemberVO;

public interface MemberMapper {
	public void create(MemberVO vo) throws Exception;
	public MemberVO read(String userid) throws Exception;
	public MemberVO readWithPW(@Param("userid") String userId, @Param("userpw") String userpw) throws Exception;
	public String getTime() throws Exception;
	
}
