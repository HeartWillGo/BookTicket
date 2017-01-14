package com.example.book_ticket;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TextListViewAdapter extends CommonAdapter<String>{  
  
       
      
    public TextListViewAdapter(Context context, List<String> list2) {
		super(context, list2);
		// TODO Auto-generated constructor stub
	}

	public View getView(int position, View convertView, ViewGroup parent) {  
        // TODO Auto-generated method stub  
        CommonViewHolder holder = CommonViewHolder.get(mContext, convertView, position, R.layout.item_listview, parent);  
        TextView titleTv = holder.getView(R.id.titleTv);  
        titleTv.setText(list.get(position));  
        return holder.getConvertView();  
    }

	@Override
	public void convert(CommonViewHolder viewHolder, String data, int position) {
		// TODO Auto-generated method stub
		
	}     
      
}  
