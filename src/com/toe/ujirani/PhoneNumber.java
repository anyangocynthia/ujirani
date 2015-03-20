package com.toe.ujirani;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.actionbarsherlock.app.SherlockActivity;

public class PhoneNumber extends SherlockActivity {

	Intent i;
	Button bEstate;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.phone_number);
		getSupportActionBar().hide();

		setUp();
	}

	private void setUp() {
		// TODO Auto-generated method stub
		bEstate = (Button) findViewById(R.id.bSubmit);
		bEstate.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				i = new Intent(getApplicationContext(), Estate.class);
				startActivity(i);
			}
		});
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}

}
