package se.mah.k3.pfi3.goransson.andreas.intenttests;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class IntentTests extends Activity implements OnClickListener {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		/* Button - Explicit intent */
		Button explicit = (Button) findViewById(R.id.buttonExplicit);
		explicit.setOnClickListener(this);

		/* Button - Implicit intent */
		Button implicit = (Button) findViewById(R.id.buttonImplicit);
		implicit.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.buttonExplicit:
			/* Launch explicit intent */
			Intent explicit = new Intent(IntentTests.this, ExplicitName.class);
			startActivity(explicit);
			break;
		case R.id.buttonImplicit:
			/* Launch implicit intent */
			Intent implicit = new Intent(Intent.ACTION_VIEW);
			implicit.setData(Uri.parse("http://www.mah.se"));
			startActivity(implicit);
			break;
		}
	}
}