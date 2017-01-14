package com.example.book_ticket;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegeistActivity extends Activity {

	 
	 
	private TextView tex;
	// public Socket socket;
	public String user_name;

	 

	 
	private Random rand = new Random();

	/* 服务器地址 */
 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_regeist);
		Resources res = getResources();
		Drawable drawable = res.getDrawable(R.drawable.under1);
		this.getWindow().setBackgroundDrawable(drawable);
		//
	}

	 

	public void denglu(View v) {
		EditText user = (EditText) RegeistActivity.this
				.findViewById(R.id.editText1);
		EditText password = (EditText) RegeistActivity.this
				.findViewById(R.id.editText2);
		 ;
		final String Euser = user.getText().toString();
		final String Epassword = password.getText().toString();
	 
	 
		 
//		if (((Euser.equals("zp")) && (Epassword.equals("123")))
//				|| ((Euser.equals("cx")) && (Epassword.equals("123")))
//				|| ((Euser.equals("lx")) && (Epassword.equals("123")))) {
//			 

			//
			Intent intent = new Intent(RegeistActivity.this, BookActivity.class);
 
			startActivity(intent);
//		}
//
//	 
//		 else
//		 {
//		 Toast.makeText(RegeistActivity.this, "账号或密码输入错误,请重新输入",
//		 Toast.LENGTH_SHORT).show();
//		 }

		 
	}

	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.regeist, menu);
		return true;
	}

}
