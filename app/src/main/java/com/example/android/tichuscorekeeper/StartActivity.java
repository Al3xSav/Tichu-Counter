package com.example.android.tichuscorekeeper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;


public class StartActivity  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Button start = (Button) findViewById(R.id.start);

        start.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent mainActivityIntent = new Intent(StartActivity.this, MainActivity.class);
                startActivity(mainActivityIntent);
            }
        });

        Button rules = (Button) findViewById(R.id.rules);

        rules.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent rulesActivityIntent = new Intent(StartActivity.this, RulesActivity.class);
                startActivity(rulesActivityIntent);
            }
        });
    }


}
