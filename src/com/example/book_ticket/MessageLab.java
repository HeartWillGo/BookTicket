package com.example.book_ticket;

 

import android.content.Context; 
public class MessageLab {
	private static MessageLab messageLab;
	private MyArrayList  myMessage;
	public static MessageLab get(Context context){
		if (messageLab==null){
			messageLab=new MessageLab(context);
		}
		return messageLab;
	}
	
	private MessageLab(Context context){
		myMessage=new MyArrayList ();
		
	}
	public MyArrayList getMeaaage(){
		return myMessage;
	}

}
