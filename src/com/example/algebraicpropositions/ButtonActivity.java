package com.example.algebraicpropositions;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;

public class ButtonActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Intent intent = getIntent();
		//string obtained from the exact button was pressed 
		String buttonStr = intent.getStringExtra(MainActivity.BUTTON_CLICKED);
		
		setContentView(R.layout.propositions);
		TextView prop_text = (TextView) findViewById(R.id.prop);
		
		/**Sets the appropriate title for the navbar and sets the appropriate text according 
		 * to the what proposition was pressed**/
		
		if (buttonStr.equals("@string/prop1")) {
			setTitle(R.string.prop1);
			prop_text.setText(R.string.prop1_str);
		} else if (buttonStr.equals("@string/prop2")) {
			setTitle(R.string.prop2);
			prop_text.setText(R.string.prop2_str);
		} else if (buttonStr.equals("@string/prop3")) {
			setTitle(R.string.prop3);
			prop_text.setText(R.string.prop3_str);
		} else if (buttonStr.equals("@string/prop4")) {
			setTitle(R.string.prop4);
			prop_text.setText(R.string.prop4_str);
		} else if (buttonStr.equals("@string/prop5")) {
			setTitle(R.string.prop5);
			prop_text.setText(R.string.prop5_str);
		} else if (buttonStr.equals("@string/prop6")) {
			setTitle(R.string.prop6);
			prop_text.setText(R.string.prop6_str);
		} else if (buttonStr.equals("@string/prop7")) {
			setTitle(R.string.prop7);
			prop_text.setText(R.string.prop7_str);
		} else if (buttonStr.equals("@string/prop8")) {
			setTitle(R.string.prop8);
			prop_text.setText(R.string.prop8_str);
		} else if (buttonStr.equals("@string/prop9")) {
			setTitle(R.string.prop9);
			prop_text.setText(R.string.prop9_str);
		} else if (buttonStr.equals("@string/prop10")) {
			setTitle(R.string.prop10);
			prop_text.setText(R.string.prop10_str);
		} else if (buttonStr.equals("@string/prop11")) {
			setTitle(R.string.prop11);
			prop_text.setText(R.string.prop11_str);
		} else if (buttonStr.equals("@string/prop12")) {
			setTitle(R.string.prop12);
			prop_text.setText(R.string.prop12_str);
		} else if (buttonStr.equals("@string/prop13")) {
			setTitle(R.string.prop13);
			prop_text.setText(R.string.prop13_str);
		} else if (buttonStr.equals("@string/prop14")) {
			setTitle(R.string.prop14);
			prop_text.setText(R.string.prop14_str);
		} else if (buttonStr.equals("@string/prop15")) {
			setTitle(R.string.prop15);
			prop_text.setText(R.string.prop15_str);
		} else if (buttonStr.equals("@string/prop16")) {
			setTitle(R.string.prop16);
			prop_text.setText(R.string.prop16_str);
		} else if (buttonStr.equals("@string/prop17")) {
			setTitle(R.string.prop17);
			prop_text.setText(R.string.prop17_str);
		} else if (buttonStr.equals("@string/prop18")) {
			setTitle(R.string.prop18);
			prop_text.setText(R.string.prop18_str);
		} else if (buttonStr.equals("@string/prop19")) {
			setTitle(R.string.prop19);
			prop_text.setText(R.string.prop19_str);
		} else if (buttonStr.equals("@string/prop20")) {
			setTitle(R.string.prop20);
			prop_text.setText(R.string.prop20_str);
		} else if (buttonStr.equals("@string/prop21")) {
			setTitle(R.string.prop21);
			prop_text.setText(R.string.prop21_str);
		} else if (buttonStr.equals("@string/prop22")) {
			setTitle(R.string.prop22);
			prop_text.setText(R.string.prop22_str);
		} else if (buttonStr.equals("@string/prop23")) {
			setTitle(R.string.prop23);
			prop_text.setText(R.string.prop23_str);
		} else if (buttonStr.equals("@string/prop24")) {
			setTitle(R.string.prop24);
			prop_text.setText(R.string.prop24_str);
		} else if (buttonStr.equals("@string/prop25")) {
			setTitle(R.string.prop25);
			prop_text.setText(R.string.prop25_str);
		} else if (buttonStr.equals("@string/prop26")) {
			setTitle(R.string.prop26);
			prop_text.setText(R.string.prop26_str);
		} else if (buttonStr.equals("@string/prop27")) {
			setTitle(R.string.prop27);
			prop_text.setText(R.string.prop27_str);
		} else if (buttonStr.equals("@string/prop28")) {
			setTitle(R.string.prop28);
			prop_text.setText(R.string.prop28_str);
		} else if (buttonStr.equals("@string/prop29")) {
			setTitle(R.string.prop29);
			prop_text.setText(R.string.prop29_str);
		} else if (buttonStr.equals("@string/prop30")) {
			setTitle(R.string.prop30);
			prop_text.setText(R.string.prop30_str);
		} else if (buttonStr.equals("@string/prop31")) {
			setTitle(R.string.prop31);
			prop_text.setText(R.string.prop31_str);
		} else if (buttonStr.equals("@string/prop32")) {
			setTitle(R.string.prop32);
			prop_text.setText(R.string.prop32_str);
		} else if (buttonStr.equals("@string/prop33")){
			setTitle(R.string.prop33);
			prop_text.setText(R.string.prop33_str);
		} else {
			setTitle(R.string.prop34);
			prop_text.setText(R.string.prop34_str);
		}
		
		// Show the Up button in the action bar.
		setupActionBar();
	}

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}
	
}
