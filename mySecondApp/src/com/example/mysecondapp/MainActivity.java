package com.example.mysecondapp;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	TextView myMessage;
	OnClickListener myRadioClickListener;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final Button myButton=(Button)findViewById(R.id.button1);
        
        final CheckBox iSpeckFrench=(CheckBox)findViewById(R.id.iSpeakFrench);
        iSpeckFrench.setOnClickListener(new OnClickListener(){
        	
			@Override
			public void onClick(View v) {
				
	        		CheckBox v2=(CheckBox) v;
	        		
	        		if(v2.isChecked()){
	        			myButton.setText("Judus Joyrus");
	        		}
	        		else
	        		{
	        			myButton.setText("Hello world.");
	        		}
	        					
			}
        	
        });
        
        myButton.setOnClickListener( new Button.OnClickListener(){

			@Override
			public void onClick(View v) {
				if(iSpeckFrench.isChecked()){
					Toast.makeText(MainActivity.this, R.string.myButtonFrenchListener, Toast.LENGTH_LONG).show();	
				}else{
				Toast.makeText(MainActivity.this, R.string.myButtonListener, Toast.LENGTH_LONG).show();
				}
			}
        	
        });
        
        myMessage=(TextView)findViewById(R.id.myMessage);
        myRadioClickListener=new OnClickListener(){

			@Override
			public void onClick(View v) {
				RadioButton myRadioButton=(RadioButton) v;
				
				switch(myRadioButton.getId()){
				case R.id.myRadioButtonRed:	myMessage.setTextColor(Color.RED); break;
				case R.id.myRadioButtonGreen: myMessage.setTextColor(Color.GREEN); break;
				case R.id.myRadioButtonBlue: myMessage.setTextColor(Color.BLUE); break;
				}
			}
        };
        
        RadioButton rbred, rbgreen, rbblue;
        rbred=(RadioButton)findViewById(R.id.myRadioButtonRed);
        rbgreen=(RadioButton)findViewById(R.id.myRadioButtonGreen);
        rbblue=(RadioButton)findViewById(R.id.myRadioButtonBlue);
        
        rbred.setOnClickListener(myRadioClickListener);
        rbgreen.setOnClickListener(myRadioClickListener);
        rbblue.setOnClickListener(myRadioClickListener);
        
        
    }
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
