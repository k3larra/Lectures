package se.mah.k3.pfi3.goransson.andreas.lecture3c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyView extends View {

	public MyView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		
		Paint paint = new Paint();
		paint.setColor(Color.CYAN);
		
		canvas.drawRect(10, 10, 100, 100, paint);
	}


	
}
