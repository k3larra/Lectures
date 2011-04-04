package se.mah.k3.rauer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

//ViewExample implements the interface OnClickListener
public class CopyOfViewExample extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //Same thing as in ViewExample with anonymous inner class
        //To listen for buttonclicks we have to tell the button that we want to listen
        //find the button
        Button button = (Button) findViewById(R.id.button1);   
        //the anonymous inner class
        button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Do what has to be done	
			}
		});
    }
}

