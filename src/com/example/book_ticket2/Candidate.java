package com.example.book_ticket2;

public class Candidate {
	private String User_name;
	private String Orgin;
	private String Termin;
	//private String Air;
	private String Date;
	//private int Sit;

	public Candidate(String User_name, String Orgin, String Termin ,
			String Date ) {
		//this.Air = Air;
		this.Orgin = Orgin;
		this.Date = Date;
	//	this.Sit = Sit;
		this.User_name = User_name;

	}

	public String getUser_name() {
		return User_name;
	}

	public void setUser_name(String user_name) {
		User_name = user_name;
	}

	public String getTermin() {
		return Termin;
	}

	public void setTermin(String termin) {
		Termin = termin;
	}

	public String getOrgin() {
		return Orgin;
	}

	public void setOrgin(String orgin) {
		Orgin = orgin;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

//	public int getSit() {
//		return Sit;
//	}
//
//	public void setSit(int sit) {
//		Sit = sit;
//	}
//
//	public String getAir() {
//		return Air;
//	}
//
//	public void setAir(String air) {
//		Air = air;
//	}

}
