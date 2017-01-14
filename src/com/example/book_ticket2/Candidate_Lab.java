package com.example.book_ticket2;

import android.content.Context;

public class Candidate_Lab {

	private static Candidate_Lab candidate_Lab;
	private Candidate_ArrayList  myMessage;
	public static Candidate_Lab get(Context context){
		if (candidate_Lab==null){
			candidate_Lab=new Candidate_Lab(context);
		}
		return candidate_Lab;
	}
	
	private Candidate_Lab(Context context){
		myMessage=new Candidate_ArrayList ();
		
	}
	public Candidate_ArrayList getMeaaage(){
		return myMessage;
	}

}
