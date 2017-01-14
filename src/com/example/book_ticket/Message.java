package com.example.book_ticket;

public class Message {

	private String str1  ;
	private 	String str2  ;
	private  String str3  ;
	private  String str4  ;
	private  	String str5;
	private int num;
	public Message(String str1,String str2,String str3,String str4,String str5,int num){
		 this.str1=str1;
		 this.str2=str2;
		 this.str3=str3;
		 this.str4=str4;
		 this.str5=str5;
		this.num=num;
	}
	public String getStr1() {
		return str1;
	}
	public void setStr1(String str1) {
		this.str1 = str1;
	}
	public String getStr3() {
		return str3;
	}
	public void setStr3(String str3) {
		this.str3 = str3;
	}
	public String getStr2() {
		return str2;
	}
	public void setStr2(String str2) {
		this.str2 = str2;
	}
	public String getStr4() {
		return str4;
	}
	public void setStr4(String str4) {
		this.str4 = str4;
	}
	public String getStr5() {
		return str5;
	}
	public void setStr5(String str5) {
		this.str5 = str5;
	}
	public void setNum(int num){
		this.num=num;
	}
	public int getNum(){
		return num;
	}
}
