package com.example.feelgoodversion1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SandwichNavigator extends Activity {
	
	Button backButton;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sandwich_navigator);
        
        final Intent goHome = new Intent (this, HomePage.class);
        
        backButton = (Button) findViewById(R.id.back_button1);
        OnClickListener backButton_click_listener = new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				startActivity(goHome);
			}};
			
			backButton.setOnClickListener(backButton_click_listener);
        }
        
        
	}




