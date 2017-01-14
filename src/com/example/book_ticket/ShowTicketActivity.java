package com.example.book_ticket;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class ShowTicketActivity extends Activity {
	private MyArrayList list2;
	private String Orgin_str;
	private String Terminus_str;
	private String Data_str;
	//private List<ItemBean> list = new ArrayList<ItemBean>();
	// private ListView listview;
	//
	// private MyAdapter adapter;
	//
	// private List<String> data;
	// private ListView listview;
	// private CommonAdapter adapter;
	// private List<String> data;
	private ListView listview;

	private CommonAdapter adapter;

	private List<ItemBean> data;

	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		 

		setContentView(R.layout.activity_show_ticket);
		MessageLab message = MessageLab.get(this);
		MyArrayList msg = message.getMeaaage();
		list2 = msg;
		 Orgin_str = getIntent().getStringExtra("Orgin");
		 Terminus_str = getIntent().getStringExtra("Terminus");
		 Data_str = getIntent().getStringExtra("Data");
		for (int i = 0; i < 20; i++) {
			int num = 20160919 + i;

			for (int j = 0; j < 20; j++) {
				int number = 450 + j;
				Message msg1 = new Message("长沙", "北京",
						new String().valueOf(num), "xxx777", "by777", 0);
				// Message msg=new Message("长沙", "北京", "20160919", "xxx777",
				// "by777", 500);
				list2.add(msg1);
			}
		}
		 
		listview = (ListView) this.findViewById(R.id.listview);
		initData();
		adapter = new TextImgAdapter(this.getApplicationContext(), data,
				R.layout.item_listview);
		adapter = new TextImgAdapter(this.getApplicationContext(), data,
				R.layout.item_listview);
		listview.setAdapter(adapter);
		listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			public void onItemClick(AdapterView<?> adapterView, View view,
					int position, long l) {
				Intent intent = new Intent(ShowTicketActivity.this,
						BuyTicketActivity.class);
				
				ItemBean data_bean=data.get(position);
				intent.putExtra("bean", new String().valueOf(data_bean.getNumber()));

				startActivity(intent);
				
				//ItemBean data_bean=data.get(position);
 
				Toast.makeText(ShowTicketActivity.this, "哈哈哈，你点击了"+data_bean.getDetail(),
						Toast.LENGTH_SHORT).show();
			}

		});
	}

	public void initData() {
		data = new ArrayList<ItemBean>();
		for (int i = 0; i < list2.size(); i++) {
			MessageLab message = MessageLab.get(this);
			MyArrayList msg = message.getMeaaage();
			list2 = msg;
			Message mess = list2.get(i);
			if((Orgin_str.equals(mess.getStr1()))&&(Terminus_str.equals(mess.getStr2()))&&(Data_str.equals(mess.getStr3()))){
			ItemBean bean = new ItemBean(R.drawable.ic_launcher, mess.getStr1()
					+ "      " + mess.getStr2() + "  ", mess.getStr3() + "   "
					+ mess.getStr4() + "    " + mess.getStr5() + "   "
					+ mess.getNum(),i);
			data.add(bean);
		}
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.show_ticket, menu);
		return true;
	}

}
