package com.example.book_ticket;

import java.util.List;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

public class TextImgAdapter  extends CommonAdapter<ItemBean>{  
    
  public TextImgAdapter(Context context, List<ItemBean> list, int layoutId) {  
      super(context, list, layoutId);  
      // TODO Auto-generated constructor stub  
  }  

  @Override  
  public void convert(CommonViewHolder viewHolder, ItemBean data, int position) {  
      // TODO Auto-generated method stub  
      ImageView item_iv = viewHolder.getView(R.id.item_iv);  
      TextView titleTv = viewHolder.getView(R.id.titleTv);  
      TextView detailTv = viewHolder.getView(R.id.detailTv);  
      item_iv.setBackgroundResource(R.drawable.ic_launcher);  
      titleTv.setText(data.getTitle());  
      detailTv.setText(data.getDetail());  
  }  

}  