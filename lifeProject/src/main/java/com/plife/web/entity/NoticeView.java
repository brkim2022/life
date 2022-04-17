package com.plife.web.entity;

import java.util.Date;

public class NoticeView extends Notice {
	
	private String memberName;
	
	public NoticeView() {
		
	}

	public NoticeView(int id, String title, String content, Date regdate, int hit, boolean pup, int memberId, String memberName) {
		
		super(id, title, content, regdate, hit, pup, memberId);
		
		this.memberName = memberName;
	}

	public String getMemberName() {
		
		return memberName;
	}

	public void setMemberName(String memberName) {
		
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		
		return "NoticeView [memberName=" + memberName + ", getId()=" + getId() + ", getTitle()=" + getTitle()
				+ ", getContent()=" + getContent() + ", getRegdate()=" + getRegdate() + ", getHit()=" + getHit()
				+ ", isPup()=" + isPup() + ", getMemberId()=" + getMemberId() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}

