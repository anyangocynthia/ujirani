package com.toe.ujirani;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.actionbarsherlock.app.SherlockActivity;

public class Splash extends SherlockActivity {

	Intent i;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.splash);
		getSupportActionBar().hide();

		new Handler().postDelayed(new Runnable() {
			public void run() {
				i = new Intent(getApplicationContext(), Login.class);
				startActivity(i);
			}
		}, 3000);
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}

}
