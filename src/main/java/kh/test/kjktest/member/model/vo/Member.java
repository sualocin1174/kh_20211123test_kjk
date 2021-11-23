package kh.test.kjktest.member.model.vo;

import java.sql.Date;

public class Member {
//	MEMBER_ID VARCHAR2(30) PRIMARY KEY,
//	MEMBER_PWD VARCHAR2(100) NOT NULL,
//	MEMBER_NM VARCHAR2(15) NOT NULL,
//	MEMBER_ENROLL_DT DATE DEFAULT SYSDATE
	private static final long serialVersionUID = 1111L;
	private String memberId;
	private String memberPwd;
	private String memberNm;
	private Date memberEnrollDt;
	
	public Member() {
	}
	
	public Member(String memberId, String memberPwd, String memberNm, Date memberEnrollDt) {
		super();
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberNm = memberNm;
		this.memberEnrollDt = memberEnrollDt;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberPwd=" + memberPwd + ", memberNm=" + memberNm
				+ ", memberEnrollDt=" + memberEnrollDt + "]";
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPwd() {
		return memberPwd;
	}

	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}

	public String getMemberNm() {
		return memberNm;
	}

	public void setMemberNm(String memberNm) {
		this.memberNm = memberNm;
	}

	public Date getMemberEnrollDt() {
		return memberEnrollDt;
	}

	public void setMemberEnrollDt(Date memberEnrollDt) {
		this.memberEnrollDt = memberEnrollDt;
	}
}
