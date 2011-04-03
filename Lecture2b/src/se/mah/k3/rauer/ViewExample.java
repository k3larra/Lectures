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
public class ViewExample extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //To listen for buttonclicks we have to tell the button that we want to listen
        //find the button
        Button button = (Button) findViewById(R.id.button1);
        //tell the button that we want to listen (call onClick when button is invoked)
        button.setOnClickListener(this);
    }

//Interface method from OnClickListener we are forced to 
//implement this when implementing the  OnClickListerner-interface. 
	@Override
	public void onClick(View v) {
		// perform action on click
		//Get the text
		EditText text = (EditText) findViewById(R.id.editText1);
		//Get the radiobutton
		RadioButton rb1 = (RadioButton) findViewById(R.id.radio0); 
		//Compose a message string
		
		String s = "Your name is "+ text.getText().toString() +" and you are a ";
		if (rb1.isChecked()==true){
			s = s + "man";
		}else {
			s = s + "woman";
		}
		Toast t = Toast.makeText(this, s, Toast.LENGTH_LONG);
		t.show();	
	}  
}

