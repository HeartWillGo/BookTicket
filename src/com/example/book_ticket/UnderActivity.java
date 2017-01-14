package com.example.book_ticket;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class UnderActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_under);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.under, menu);
		return true;
	}

}
