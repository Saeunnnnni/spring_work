package com.project.myapp.member.dto;

import org.springframework.web.multipart.MultipartFile;

public class MemberDto {
	
	private int num;
	private String writer;
	private String title;
	private String imagePath;
	private String content;
	private int viewCount;
	private String regdate;
	private int prevNum;   //이전 글의 글 번호
	private int nextNum;

	private int startRowNum;
	private int endRowNum;
	private MultipartFile image;
	

	public void setStartRowNum(int startRowNum) {
		this.startRowNum = startRowNum;
	}

	public int getEndRowNum() {
		return endRowNum;
	}

	public void setEndRowNum(int endRowNum) {
		this.endRowNum = endRowNum;
	}



	
	public MemberDto(int num, String writer, String title, String imagePath, String content, int viewCount, String regdate,
			int prevNum, int nextNum, MultipartFile image) {
		super();
		this.num = num;
		this.writer = writer;
		this.title = title;
		this.imagePath = imagePath;
		this.content = content;
		this.viewCount = viewCount;
		this.regdate = regdate;
		this.prevNum = prevNum;
		this.nextNum = nextNum;
		this.image = image;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getcontent() {
		return content;
	}

	public void setClob(String content) {
		this.content = content;
	}

	public int getViewCount() {
		return viewCount;
	}

	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public int getPrevNum() {
		return prevNum;
	}

	public void setPrevNum(int prevNum) {
		this.prevNum = prevNum;
	}

	public int getNextNum() {
		return nextNum;
	}

	public void setNextNum(int nextNum) {
		this.nextNum = nextNum;
	}

	public MultipartFile getImage() {
		return image;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
	}

	
	
	public MemberDto() {}


}
	
