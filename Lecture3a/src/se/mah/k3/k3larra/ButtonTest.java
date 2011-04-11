package se.mah.k3.k3larra;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class ButtonTest extends Activity implements OnClickListener{
	 @Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.buttontest);
		MyButton b = (MyButton)findViewById(R.id.button3);
		b.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		MyButton b = (MyButton)findViewById(R.id.button3);
		b.setNextImage();
	}

}
