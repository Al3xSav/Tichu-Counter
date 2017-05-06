package com.example.android.tichuscorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;


public class RulesActivity extends AppCompatActivity {

    /*String[] rulesArray = {getResources().getString(R.string.cards_1),
                              getResources().getString(R.string.cards_2),
                              getResources().getString(R.string.cards_3)};*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_rules);

    }

}
