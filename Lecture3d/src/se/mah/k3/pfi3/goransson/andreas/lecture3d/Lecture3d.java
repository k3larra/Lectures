package se.mah.k3.pfi3.goransson.andreas.lecture3d;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

public class Lecture3d extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		if (event.getAction() == MotionEvent.ACTION_DOWN) {
			Log.i("pfi3", "ACTION_DOWN  " + event.getX() + " " + event.getY() );
		} else if (event.getAction() == MotionEvent.ACTION_MOVE) {
			Log.i("pfi3", "ACTION_MOVE  " + event.getX() + " " + event.getY() );
		} else if (event.getAction() == MotionEvent.ACTION_UP) {
			Log.i("pfi3", "ACTION_UP  " + event.getX() + " " + event.getY() );
		}

		return super.onTouchEvent(event);
	}

}