package com.example.book_ticket;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter{  
    
  private Context mContext;  
    
  private List<String> list;  
    
  public MyAdapter(Context context, List<String> list){  
      this.mContext = context;  
      this.list = list;  
  }  
    
  @Override  
  public int getCount() {  
      // TODO Auto-generated method stub  
      return list.size();  
  }  
    
  @Override  
  public Object getItem(int position) {  
      // TODO Auto-generated method stub  
      return list.get(position);  
  }  
    
  @Override  
  public long getItemId(int position) {  
      // TODO Auto-generated method stub  
      return position;  
  }  
    
  @Override  
  public View getView(int position, View convertView, ViewGroup parent) {  
      // TODO Auto-generated method stub  
	  CommonViewHolder holder = CommonViewHolder.get(mContext, convertView, position, R.layout.item_listview, parent);  
	    TextView titleTv = holder.getView(R.id.titleTv);  
	    titleTv.setText(list.get(position));  
	    return holder.getConvertView(); 
  }  
    
  public static class ViewHolder{  
      TextView titleTv;  
  }  

}  