package com.example.book_ticket;

import java.util.Random;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Bitmap.Config;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

@SuppressLint("DrawAllocation")
public class IndexView extends View {
	int id, width = 0, height = 0, k = 0, k3 = 18, k4 = 0;

	int q = 0;
	int menuId;

	private Bitmap bit;
	private Canvas can;

	private Paint paint = new Paint();

	 

	public IndexView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}

	public IndexView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public IndexView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	@SuppressLint("DrawAllocation")
	public void onDraw(Canvas canvas) {

		height = this.getHeight();
		width = this.getWidth();
 if(k==0){
 		bit = Bitmap.createBitmap(width, height, Config.ARGB_8888);
			can = new Canvas(bit);
			paint.setColor(Color.BLUE);
			paint.setTextSize(60);
			k++;
 }

		canvas.drawBitmap(bit, 0, 0, paint);

//		Bitmap pic0 = BitmapFactory.decodeResource(getResources(),
//				R.drawable.hotel);
//		Bitmap pic_hotel = Bitmap.createBitmap(width, height / 5,
//				Config.ARGB_8888);
//		Canvas can0 = new Canvas(pic_hotel);
//		Rect old_rect = new Rect(0, 0, 407, 123);
//		RectF new_rect = new RectF(0, 0, width, height / 5);
//		
//		can0.drawBitmap(pic0, old_rect, new_rect, paint);
//
//		Bitmap pic1 = BitmapFactory.decodeResource(getResources(),
//				R.drawable.fly);
//		Bitmap pic_fly = Bitmap.createBitmap(width / 3, height / 5,
//				Config.ARGB_8888);
//		Canvas can1 = new Canvas(pic_fly);
//		Rect old_rect1 = new Rect(0, 0, 136, 126);
//		RectF new_rect1 = new RectF(0, 0, width / 3, height / 5);
//		can1.drawBitmap(pic1, old_rect1, new_rect1, paint);
//
//		Bitmap pic2 = BitmapFactory.decodeResource(getResources(),
//				R.drawable.other);
//		Bitmap pic_other = Bitmap.createBitmap(2 * width / 3, height / 5,
//				Config.ARGB_8888);
//		Canvas can2 = new Canvas(pic_other);
//		Rect old_rect2 = new Rect(0, 0, 280, 126);
//		RectF new_rect2 = new RectF(0, 0, 2 * width / 3, height / 5);
//		can2.drawBitmap(pic2, old_rect2, new_rect2, paint);
//
//		Bitmap pic3 = BitmapFactory.decodeResource(getResources(),
//				R.drawable.travel);
//		Bitmap pic_travel = Bitmap.createBitmap(width, height / 5,
//				Config.ARGB_8888);
//		Canvas can3 = new Canvas(pic_travel);
//		Rect old_rect3 = new Rect(0, 0, 412, 123);
//		RectF new_rect3 = new RectF(0, 0, width / 3, height / 5);
//		can3.drawBitmap(pic3, old_rect3, new_rect3, paint);
//
//		can.drawBitmap(pic_hotel, 0, height / 5, paint);
//		can.drawBitmap(pic_fly, 0,2* height / 5, paint);
//		can.drawBitmap(pic_other, width/3,2* height / 5, paint);
//		can.drawBitmap(pic_travel, 0, 3*height / 5, paint);
//		
		 
		setBack();
		this.invalidate();

	}

	public boolean onTouchEvent(MotionEvent event) {
		
		
		 
		

		this.invalidate();

		return true;

	}
	
	public void setBack(){
		Bitmap pic0 = BitmapFactory.decodeResource(getResources(),
				R.drawable.hotel);
		Bitmap pic_hotel = Bitmap.createBitmap(width+100, height ,
				Config.ARGB_8888);
		Canvas can0 = new Canvas(pic_hotel);
		Rect old_rect = new Rect(10, 10, 407, 123);
		RectF new_rect = new RectF(0, 0, width+100, height );
		
		can0.drawBitmap(pic0, old_rect, new_rect, paint);

		Bitmap pic1 = BitmapFactory.decodeResource(getResources(),
				R.drawable.fly);
		Bitmap pic_fly = Bitmap.createBitmap(width / 3, height / 5,
				Config.ARGB_8888);
		Canvas can1 = new Canvas(pic_fly);
		Rect old_rect1 = new Rect(0, 0, 136, 126);
		RectF new_rect1 = new RectF(0, 0, width / 3, height / 5);
		can1.drawBitmap(pic1, old_rect1, new_rect1, paint);

		Bitmap pic2 = BitmapFactory.decodeResource(getResources(),
				R.drawable.other);
		Bitmap pic_other = Bitmap.createBitmap(2 * width / 3, height / 5,
				Config.ARGB_8888);
		Canvas can2 = new Canvas(pic_other);
		Rect old_rect2 = new Rect(0, 0, 280, 126);
		RectF new_rect2 = new RectF(0, 0, 2 * width / 3, height / 5);
		can2.drawBitmap(pic2, old_rect2, new_rect2, paint);

		Bitmap pic3 = BitmapFactory.decodeResource(getResources(),
				R.drawable.travel);
		Bitmap pic_travel = Bitmap.createBitmap(width, height / 5,
				Config.ARGB_8888);
		Canvas can3 = new Canvas(pic_travel);
		Rect old_rect3 = new Rect(0, 0, 412, 123);
		RectF new_rect3 = new RectF(0, 0, width / 3, height / 5);
		can3.drawBitmap(pic3, old_rect3, new_rect3, paint);

		can.drawBitmap(pic_hotel, 0, height / 5, paint);
		can.drawBitmap(pic_fly, 0,2* height / 5, paint);
		can.drawBitmap(pic_other, width/3,2* height / 5, paint);
		can.drawBitmap(pic_travel, 0, 3*height / 5, paint);
		
	}

}
