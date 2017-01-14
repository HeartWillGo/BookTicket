package com.example.book_ticket2;

import android.content.Context;

public class User_Lab {

	private static User_Lab user_Lab;
	private User_ArrayList  myMessage;
	public static User_Lab get(Context context){
		if (user_Lab==null){
			user_Lab=new User_Lab(context);
		}
		return user_Lab;
	}
	
	private User_Lab(Context context){
		myMessage=new User_ArrayList ();
		
	}
	public User_ArrayList getMeaaage(){
		return myMessage;
	}
}
