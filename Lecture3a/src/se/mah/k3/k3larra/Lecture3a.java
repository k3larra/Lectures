package se.mah.k3.k3larra;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Lecture3a extends Activity implements OnClickListener, Callback{
    private int i = 10;
    private MyThread t;
    private Handler handler;
    private final int START_VALUE = 10;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        handler = new Handler(this);
        Button b = (Button)findViewById(R.id.button1);
        b.setOnClickListener(this);
        Button b2 = (Button)findViewById(R.id.button2);
        b2.setOnClickListener(this);
    }
    
  //Button click Method inherited from interface OnClickListener
	@Override
	public void onClick(View v) {
		//Check which button is pressed
		switch(v.getId()){
		case R.id.button1:
				startNewCounter(START_VALUE);
			break;
		case R.id.button2:
			 	Intent i = new Intent(this, ButtonTest.class);
			 	startActivity(i);
			 	finish();
			break;
		}
	}

	//Method called from thread via handler inherited from interface Callback.
	@Override
	public boolean handleMessage(Message msg) {
		//No information in msg that interests us in this application
		updateUI();
		return false;
	}	
	
	//Method for handling UI updating
	private void updateUI() {
		TextView textView = (TextView)findViewById(R.id.textView2);
		if (i == 0){ 
			i = START_VALUE;
			stopCounter();
			textView.setText("KAboom");
			//Please redraw as soon as possible
			textView.invalidate();
			Button b = (Button)findViewById(R.id.button1);
			b.setText("Start");
			//Please redraw as soon as possible
			b.invalidate();
		}else{
			//Update the UI component
			textView.setText(String.valueOf(i));
			//Please redraw as soon as possible
			textView.invalidate();
			--i;
		}
		Log.i("k3","Number: "+ i);
	}
	
	//CounterMethods.
	private void startNewCounter(int startValue){
		i= startValue;
		if (t!=null){
			t.stopCountDown();
			t=null;
		}
	    t = new MyThread(handler);
	    t.start();
	    //Change text on button
	    Button b = (Button)findViewById(R.id.button1);
	    b.setText("Restart");
	    //Please redraw as soon as possible
	    b.invalidate();
	}
	
	private void stopCounter(){
		if (t!=null){
			t.stopCountDown();
			t=null;
		}
	}
	
}