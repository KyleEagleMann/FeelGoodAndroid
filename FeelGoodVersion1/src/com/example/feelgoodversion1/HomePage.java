package com.example.feelgoodversion1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class HomePage extends Activity {
	
	Button button;
	TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        final Intent goToSandwichNavigator = new Intent(this, SandwichNavigator.class);
        
        button = (Button) findViewById(R.id.button_one);
        text = (TextView) findViewById(R.id.text_view);
        OnClickListener button_click_listener = new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				startActivity(goToSandwichNavigator);
			}};
        
        button.setOnClickListener(button_click_listener);
        
    }
    
}
