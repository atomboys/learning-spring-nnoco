package org.zerock.web;

import static org.junit.Assert.fail;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.mapper.MemberMapper;
import org.zerock.web.domain.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class MemberMapperTest {
	@Inject
	MemberMapper memberMapper;
	
	@Test
	public void testTime() throws Exception {
		MemberVO vo = new MemberVO();
		vo.setUserid("user20160825");
		vo.setUserpw("pw");
		vo.setUsername("USER");
		vo.setEmail("user@hello.com");
		
		memberMapper.create(vo);
	}
	
	@Test
	public void testReadMember() throws Exception {
		System.out.println(memberMapper.read("user20160825"));
	}
}
