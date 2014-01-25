package com.algebraicpropositions;


import com.algebraicpropositions.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
	
	//string passed to ButtonActivity
	public final static String BUTTON_CLICKED = "com.algebraicpropositions.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.activity_main);
    	
    	/**Button Listeners set for all buttons**/
    	
    	Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(this);
        
        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);
        
        Button button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(this);
        
        Button button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(this);
        
        Button button5 = (Button)findViewById(R.id.button5);
        button5.setOnClickListener(this);
        
        Button button6 = (Button)findViewById(R.id.button6);
        button6.setOnClickListener(this);
        
        Button button7 = (Button)findViewById(R.id.button7);
        button7.setOnClickListener(this);
        
        Button button8 = (Button)findViewById(R.id.button8);
        button8.setOnClickListener(this);
        
        Button button9 = (Button)findViewById(R.id.button9);
        button9.setOnClickListener(this);
        
        Button button10 = (Button)findViewById(R.id.button10);
        button10.setOnClickListener(this);
        
        Button button11 = (Button)findViewById(R.id.button11);
        button11.setOnClickListener(this);
        
        Button button12 = (Button)findViewById(R.id.button12);
        button12.setOnClickListener(this);
        
        Button button13 = (Button)findViewById(R.id.button13);
        button13.setOnClickListener(this);
        
        Button button14 = (Button)findViewById(R.id.button14);
        button14.setOnClickListener(this);
        
        Button button15 = (Button)findViewById(R.id.button15);
        button15.setOnClickListener(this);
        
        Button button16 = (Button)findViewById(R.id.button16);
        button16.setOnClickListener(this);
        
        Button button17 = (Button)findViewById(R.id.button17);
        button17.setOnClickListener(this);
        
        Button button18 = (Button)findViewById(R.id.button18);
        button18.setOnClickListener(this);
        
        Button button19 = (Button)findViewById(R.id.button19);
        button19.setOnClickListener(this);
        
        Button button20 = (Button)findViewById(R.id.button20);
        button20.setOnClickListener(this);
        
        Button button21 = (Button)findViewById(R.id.button21);
        button21.setOnClickListener(this);   
        
        Button button22 = (Button)findViewById(R.id.button22);
        button22.setOnClickListener(this);
        
        Button button23 = (Button)findViewById(R.id.button23);
        button23.setOnClickListener(this);
        
        Button button24 = (Button)findViewById(R.id.button24);
        button24.setOnClickListener(this);
        
        Button button25 = (Button)findViewById(R.id.button25);
        button25.setOnClickListener(this);
        
        Button button26 = (Button)findViewById(R.id.button26);
        button26.setOnClickListener(this);
        
        Button button27 = (Button)findViewById(R.id.button27);
        button27.setOnClickListener(this);
        
        Button button28 = (Button)findViewById(R.id.button28);
        button28.setOnClickListener(this);
        
        Button button29 = (Button)findViewById(R.id.button29);
        button29.setOnClickListener(this);
        
        Button button30 = (Button)findViewById(R.id.button30);
        button30.setOnClickListener(this);
        
        Button button31 = (Button)findViewById(R.id.button31);
        button31.setOnClickListener(this);
        
        Button button32 = (Button)findViewById(R.id.button32);
        button32.setOnClickListener(this);
        
        Button button33 = (Button)findViewById(R.id.button33);
        button33.setOnClickListener(this);
        
        Button button34 = (Button)findViewById(R.id.button34);
        button34.setOnClickListener(this);
    }

    //event handled when button is clicked
	public void onClick(View view) {
		Intent intent = new Intent(this, ButtonActivity.class);
		switch (view.getId()) {
			
			case R.id.button1:
				intent.putExtra(BUTTON_CLICKED, "@string/prop1");
				break;
			
			case R.id.button2:
				intent.putExtra(BUTTON_CLICKED, "@string/prop2");
				break;
			
			case R.id.button3:
				intent.putExtra(BUTTON_CLICKED, "@string/prop3");
				break;			
			
			case R.id.button4:
				intent.putExtra(BUTTON_CLICKED, "@string/prop4");
				break;				
			
			case R.id.button5:
				intent.putExtra(BUTTON_CLICKED, "@string/prop5");
				break;
			
			case R.id.button6:
				intent.putExtra(BUTTON_CLICKED, "@string/prop6");
				break;
			
			case R.id.button7:
				intent.putExtra(BUTTON_CLICKED, "@string/prop7");
				break;
			
			case R.id.button8:
				intent.putExtra(BUTTON_CLICKED, "@string/prop8");
				break;
			
			case R.id.button9:
				intent.putExtra(BUTTON_CLICKED, "@string/prop9");
				break;
			
			case R.id.button10:
				intent.putExtra(BUTTON_CLICKED, "@string/prop10");
				break;
			
			case R.id.button11:
				intent.putExtra(BUTTON_CLICKED, "@string/prop11");
				break;
			
			case R.id.button12:
				intent.putExtra(BUTTON_CLICKED, "@string/prop12");
				break;
			
			case R.id.button13:
				intent.putExtra(BUTTON_CLICKED, "@string/prop13");
				break;
			
			case R.id.button14:
				intent.putExtra(BUTTON_CLICKED, "@string/prop14");
				break;
			
			case R.id.button15:
				intent.putExtra(BUTTON_CLICKED, "@string/prop15");
				break;
			
			case R.id.button16:
				intent.putExtra(BUTTON_CLICKED, "@string/prop16");
				break;
			
			case R.id.button17:
				intent.putExtra(BUTTON_CLICKED, "@string/prop17");
				break;
			
			case R.id.button18:
				intent.putExtra(BUTTON_CLICKED, "@string/prop18");
				break;
			
			case R.id.button19:
				intent.putExtra(BUTTON_CLICKED, "@string/prop19");
				break;
			
			case R.id.button20:
				intent.putExtra(BUTTON_CLICKED, "@string/prop20");
				break;
			
			case R.id.button21:
				intent.putExtra(BUTTON_CLICKED, "@string/prop21");
				break;
			
			case R.id.button22:
				intent.putExtra(BUTTON_CLICKED, "@string/prop22");
				break;
			
			case R.id.button23:
				intent.putExtra(BUTTON_CLICKED, "@string/prop23");
				break;
			
			case R.id.button24:
				intent.putExtra(BUTTON_CLICKED, "@string/prop24");
				break;
			
			case R.id.button25:
				intent.putExtra(BUTTON_CLICKED, "@string/prop25");
				break;
			
			case R.id.button26:
				intent.putExtra(BUTTON_CLICKED, "@string/prop26");
				break;
			
			case R.id.button27:
				intent.putExtra(BUTTON_CLICKED, "@string/prop27");
				break;
			
			case R.id.button28:
				intent.putExtra(BUTTON_CLICKED, "@string/prop28");
				break;
			
			case R.id.button29:
				intent.putExtra(BUTTON_CLICKED, "@string/prop29");
				break;
			
			case R.id.button30:
				intent.putExtra(BUTTON_CLICKED, "@string/prop30");
				break;
			
			case R.id.button31:
				intent.putExtra(BUTTON_CLICKED, "@string/prop31");
				break;
			
			case R.id.button32:
				intent.putExtra(BUTTON_CLICKED, "@string/prop32");
				break;
			
			case R.id.button33:
				intent.putExtra(BUTTON_CLICKED, "@string/prop33");
				break;
			
			case R.id.button34:
				intent.putExtra(BUTTON_CLICKED, "@string/prop34");
				break;
		}
		 startActivity(intent);
	}
}
