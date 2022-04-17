package com.plife.web.entity;

import java.util.Date;

public class Notice {
	
	private int id;
	private String title;
	private String content;
	private Date regdate;
	private int hit;
	private boolean pup;
	private int memberId;
	
	public Notice() {
		
	}

	public Notice(int id, String title, String content, Date regdate, int hit, boolean pup, int memberId) {
		
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.regdate = regdate;
		this.hit = hit;
		this.pup = pup;
		this.memberId = memberId;
	}

	public int getId() {
		
		return id;
	}

	public void setId(int id) {
		
		this.id = id;
	}

	public String getTitle() {
		
		return title;
	}

	public void setTitle(String title) {
		
		this.title = title;
	}

	public String getContent() {
		
		return content;
	}

	public void setContent(String content) {
		
		this.content = content;
	}

	public Date getRegdate() {
		
		return regdate;
	}

	public void setRegdate(Date regdate) {
		
		this.regdate = regdate;
	}

	public int getHit() {
		
		return hit;
	}

	public void setHit(int hit) {
		
		this.hit = hit;
	}

	public boolean isPup() {
		
		return pup;
	}

	public void setPup(boolean pup) {
		
		this.pup = pup;
	}

	public int getMemberId() {
		
		return memberId;
	}

	public void setMemberId(int memberId) {
		
		this.memberId = memberId;
	}

	@Override
	public String toString() {
		
		return "Notice [id=" + id + ", title=" + title + ", content=" + content + ", regdate=" + regdate + ", hit="
				+ hit + ", pup=" + pup + ", memberId=" + memberId + "]";
	}
	
}