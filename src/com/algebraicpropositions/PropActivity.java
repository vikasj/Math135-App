package com.algebraicpropositions;

import com.algebraicpropositions.R;

import android.os.Build;
import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;
import android.annotation.TargetApi;
import android.content.Intent;


public class PropActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Intent intent = getIntent();
		
		//string obtained from the item that was pressed 
		int itemClicked = intent.getIntExtra(MainActivity.ITEM_CLICKED, 0);
		
		setContentView(R.layout.propositions);
		TextView prop_text = (TextView) findViewById(R.id.prop);
		
		/**Sets the appropriate title for the actionbar and sets the appropriate text according 
		 * to the what proposition was pressed**/
		switch (itemClicked) {
			case 1: 
				setTitle(R.string.prop1);
				prop_text.setText(R.string.prop1_str);
				break;
			case 2:
				setTitle(R.string.prop2);
				prop_text.setText(R.string.prop2_str);
				break;
			case 3:
				setTitle(R.string.prop3);
				prop_text.setText(R.string.prop3_str);
				break;
			case 4:
				setTitle(R.string.prop4);
				prop_text.setText(R.string.prop4_str);
				break;
			case 5:
				setTitle(R.string.prop5);
				prop_text.setText(R.string.prop5_str);
				break;
			case 6:
				setTitle(R.string.prop6);
				prop_text.setText(R.string.prop6_str);
				break;
			case 7:
				setTitle(R.string.prop7);
				prop_text.setText(R.string.prop7_str);
				break;
			case 8:
				setTitle(R.string.prop8);
				prop_text.setText(R.string.prop8_str);
				break;
			case 9:
				setTitle(R.string.prop9);
				prop_text.setText(R.string.prop9_str);
				break;
			case 10:
				setTitle(R.string.prop10);
				prop_text.setText(R.string.prop10_str);
				break;
			case 11:
				setTitle(R.string.prop11);
				prop_text.setText(R.string.prop11_str);
				break;
			case 12:
				setTitle(R.string.prop12);
				prop_text.setText(R.string.prop12_str);
				break;
			case 13:
				setTitle(R.string.prop13);
				prop_text.setText(R.string.prop13_str);
				break;
			case 14:
				setTitle(R.string.prop14);
				prop_text.setText(R.string.prop14_str);
				break;
			case 15:
				setTitle(R.string.prop15);
				prop_text.setText(R.string.prop15_str);
				break;
			case 16:
				setTitle(R.string.prop16);
				prop_text.setText(R.string.prop16_str);
				break;
			case 17:
				setTitle(R.string.prop17);
				prop_text.setText(R.string.prop17_str);
				break;
			case 18:
				setTitle(R.string.prop18);
				prop_text.setText(R.string.prop18_str);
				break;
			case 19:
				setTitle(R.string.prop19);
				prop_text.setText(R.string.prop19_str);
				break;
			case 20:
				setTitle(R.string.prop20);
				prop_text.setText(R.string.prop20_str);
				break;
			case 21:
				setTitle(R.string.prop21);
				prop_text.setText(R.string.prop21_str);
				break;
			case 22:
				setTitle(R.string.prop22);
				prop_text.setText(R.string.prop22_str);
				break;
			case 23:
				setTitle(R.string.prop23);
				prop_text.setText(R.string.prop23_str);
				break;
			case 24:
				setTitle(R.string.prop24);
				prop_text.setText(R.string.prop24_str);
				break;
			case 25:
				setTitle(R.string.prop25);
				prop_text.setText(R.string.prop25_str);
				break;
			case 26:
				setTitle(R.string.prop26);
				prop_text.setText(R.string.prop26_str);
				break;
			case 27:
				setTitle(R.string.prop27);
				prop_text.setText(R.string.prop27_str);
				break;
			case 28:
				setTitle(R.string.prop28);
				prop_text.setText(R.string.prop28_str);
				break;
			case 29:
				setTitle(R.string.prop29);
				prop_text.setText(R.string.prop29_str);
				break;
			case 30:
				setTitle(R.string.prop30);
				prop_text.setText(R.string.prop30_str);
				break;
			case 31:
				setTitle(R.string.prop31);
				prop_text.setText(R.string.prop31_str);
				break;
			case 32:
				setTitle(R.string.prop32);
				prop_text.setText(R.string.prop32_str);
				break;
			case 33:
				setTitle(R.string.prop33);
				prop_text.setText(R.string.prop33_str);
				break;
			case 34:
				setTitle(R.string.prop34);
				prop_text.setText(R.string.prop34_str);
				break;
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
