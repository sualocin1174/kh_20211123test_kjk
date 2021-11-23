package kh.test.kjktest.member.model.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kh.test.kjktest.member.model.vo.Member;

@Repository("memberdao")
public class MemberDao {
	@Autowired
	SqlSession sqlsession;
	
	public int signUp(Member newmember) {
		System.out.println(newmember);
		return sqlsession.insert("signUp", newmember);
	}

}
