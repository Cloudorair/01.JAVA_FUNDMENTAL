package com.itwill04;


public class DvdMember extends Dvd{
	
	private String users;
	private String name;
	private String number;
	private Dvd rentDvd;//빌린dvd
	
	
	public DvdMember(String users, String name, String number, Dvd rentDvd) {
		super();
		this.users = users;
		this.name = name;
		this.number = number;
		this.rentDvd = rentDvd;
	}


	public String getUsers() {
		return users;
	}


	public void setUsers(String users) {
		this.users = users;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public Dvd getRentDvd() {
		return rentDvd;
	}


	public void setRentDvd(Dvd rentDvd) {
		this.rentDvd = rentDvd;
	}
	
	
	
	
	/*
	- 캡슐화
	<<속성>>
	회원번호
	회원이름
	전화번호
	빌린dvd
	 */
	
		
	
	/*
	<<기능>>
	  회원정보출력 
	 */
}
