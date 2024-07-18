package com.itwill04;


public class Dvd {
	/*
	 * - 캡슐화하세요
	 * - 생성자를 정의하세요
	 * 
	 * <<속성>>
	  번호
	  타이틀
	  쟝르
	 * 
	 * <<기능>>
	 *   Dvd정보출력
	 *   
	 */

	private String no; //번호
	private String title;
	private String 	Genre; // 장르
	private int fee;// 금액
	private int out; //빌린날
	private int in; //반납일
public Dvd() {
	// TODO Auto-generated constructor stub
}
public Dvd(String no, String title, String genre, int fee, int out, int in) {
	
	this.no = no;
	this.title = title;
	Genre = genre;
	this.fee = fee;
	this.out = out;
	this.in = in;
}













public String getNo() {
	return no;
}
public void setNo(String no) {
	this.no = no;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getGenre() {
	return Genre;
}
public void setGenre(String genre) {
	Genre = genre;
}
public int getFee() {
	return fee;
}
public void setFee(int fee) {
	this.fee = fee;
}
public int getOut() {
	return out;
}
public void setOut(int out) {
	this.out = out;
}
public int getIn() {
	return in;
}
public void setIn(int in) {
	this.in = in;
}
	
	
}