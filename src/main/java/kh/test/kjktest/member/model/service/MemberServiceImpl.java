package kh.test.kjktest.member.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kh.test.kjktest.member.model.dao.MemberDao;
import kh.test.kjktest.member.model.vo.Member;

@Service("memberservice")
public class MemberServiceImpl implements MemberService{
	@Autowired
	MemberDao memberdao;
	
	@Override
	public int signUp(Member newmember) throws Exception {
		return memberdao.signUp(newmember);
	}
}
