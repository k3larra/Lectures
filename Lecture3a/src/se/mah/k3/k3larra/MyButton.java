package se.mah.k3.k3larra;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.Button;

public class MyButton extends Button {

	int lastIndex = 0;
	List<Integer> myList;
	public MyButton(Context context, AttributeSet attrs)  {
		super(context,attrs);
		this.setText("");
		myList = new ArrayList<Integer>();
		myList.add(R.drawable.sample_thumb_0);
		myList.add(R.drawable.sample_thumb_1);
		myList.add(R.drawable.sample_thumb_2);
		setNextImage();
		// TODO Auto-generated constructor stub
		Log.i("k3","constructor in my button");
	}
	

	public void setNextImage(){
		lastIndex++;
		if (lastIndex >= myList.size()){
		  lastIndex=0;
		}
		this.setBackgroundResource(myList.get(lastIndex));
		invalidate();
		Log.i("k3","SetNextImage");
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
	}
	



}
