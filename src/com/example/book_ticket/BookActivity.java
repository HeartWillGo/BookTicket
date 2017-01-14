package com.example.book_ticket;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class BookActivity extends Activity {
	private EditText Orgin;
	private EditText Terminus;
	private EditText Data;
	private String Orgin_str;
	private String Terminus_str;
	private String Data_str;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_book);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.book, menu);
		return true;
	}

	public void search(View v) {
		Orgin = (EditText) findViewById(R.id.editText1);
		Terminus = (EditText) findViewById(R.id.editText2);
		Data = (EditText) findViewById(R.id.editText3);
		Orgin_str = Orgin.getText().toString();
		Terminus_str = Terminus.getText().toString();
		Data_str = Data.getText().toString();

		Intent intent = new Intent(BookActivity.this, ShowTicketActivity.class);
		intent.putExtra("Orgin", Orgin_str);
		intent.putExtra("Terminus", Terminus_str);
		intent.putExtra("Data", Data_str);

		startActivity(intent);

	}

	public boolean onOptionsItemSelected(MenuItem item) {
		Log.i("onItem", item.getTitle() + "");
		int id = item.getItemId();
		if (id == R.id.MySelf) {
			Intent intent = new Intent(BookActivity.this, MySelfActivity.class);
			startActivity(intent);
		} else if (id == R.id.AirLine) {
			Intent intent = new Intent(BookActivity.this, AirLineActivity.class);
			startActivity(intent);
		}
		else if(id==R.id.Under){
			Intent intent = new Intent(BookActivity.this, UnderActivity.class);
			startActivity(intent);
		}

		return true;

	}

}
