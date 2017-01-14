package com.example.book_ticket;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class BuyTicketActivity extends Activity {

	private MyArrayList list2;
	private int number;
	private TextView textview1;
	private TextView textview2;
	private TextView textview3;
	private TextView textview4;
	private TextView textview5;
	private CommonAdapter adapter;
	private Message user_msg;
	private Button but1;

	private List<ItemBean> data;

	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_buy_ticket);
		MessageLab message = MessageLab.get(this);
		MyArrayList msg = message.getMeaaage();
		list2 = msg;
		number = Integer.parseInt(getIntent().getStringExtra("bean"));

		user_msg = list2.get(number);
		textview1 = (TextView) findViewById(R.id.textView1);
		textview2 = (TextView) findViewById(R.id.textView2);
		textview3 = (TextView) findViewById(R.id.textView3);
		textview4 = (TextView) findViewById(R.id.textView4);
		textview5 = (TextView) findViewById(R.id.textView5);
		textview1.setText(user_msg.getStr1() + "  ---  " + user_msg.getStr2());
		textview4.setText(user_msg.getStr3());
		but1=(Button)findViewById(R.id.button1);
		if(user_msg.getNum()==0){
			but1.setText("是否候补");
			
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.show_ticket, menu);
		return true;
	}

	public void Buy(View v) {
		if(user_msg.getNum()==0){
			new AlertDialog.Builder(BuyTicketActivity.this)
			.setTitle("候补提示！")
			// 设置对话框标题

			.setMessage(
					"确认预约" + user_msg.getStr1() + "到" + user_msg.getStr2()
							+ "的车票")
			// 设置显示的内容

			.setPositiveButton("确定", new DialogInterface.OnClickListener() {// 添加确定按钮

						public void onClick(DialogInterface dialog,
								int which) {// 确定按钮的响应事件

							// TODO Auto-generated method stub
							list2.delete(number);
							// finish();

						}

					})
			.setNegativeButton("取消", new DialogInterface.OnClickListener() {// 添加返回按钮

						public void onClick(DialogInterface dialog,
								int which) {// 响应事件

						}

					}).show();// 在按键响应事件中显示此对话框

		}
		else{	new AlertDialog.Builder(BuyTicketActivity.this)
				.setTitle("购票提示！")
				// 设置对话框标题

				.setMessage(
						"确认购买" + user_msg.getStr1() + "到" + user_msg.getStr2()
								+ "的车票")
				// 设置显示的内容

				.setPositiveButton("确定", new DialogInterface.OnClickListener() {// 添加确定按钮

							public void onClick(DialogInterface dialog,
									int which) {// 确定按钮的响应事件

								// TODO Auto-generated method stub
								list2.delete(number);
								// finish();

							}

						})
				.setNegativeButton("取消", new DialogInterface.OnClickListener() {// 添加返回按钮

							public void onClick(DialogInterface dialog,
									int which) {// 响应事件

							}

						}).show();// 在按键响应事件中显示此对话框

	}
	}

}
