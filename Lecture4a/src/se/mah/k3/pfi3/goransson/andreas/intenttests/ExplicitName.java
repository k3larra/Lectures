package se.mah.k3.pfi3.goransson.andreas.intenttests;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ExplicitName extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main2);

		/* "kill" button */
		Button kill = (Button) findViewById(R.id.buttonKill);
		kill.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.buttonKill:
			finish();
			break;
		}
	}
}
