package com.example.android.tichuscorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class RulesActivity extends AppCompatActivity {

    String[] rulesArray = {"The Cards",getResources().getString(R.string.cards_1),
                              getResources().getString(R.string.cards_2),
                              getResources().getString(R.string.cards_3)};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.activity_listview, rulesArray);

        ListView listView = (ListView) findViewById(R.id.cardsList);
        listView.setAdapter(adapter);


    }
}
