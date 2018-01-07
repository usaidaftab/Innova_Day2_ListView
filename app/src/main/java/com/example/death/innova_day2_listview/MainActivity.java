package com.example.death.innova_day2_listview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    ListView myListView;
    Button button;
    ArrayList<String> countryList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myListView=(ListView)findViewById(R.id.mylistview);
        button=(Button)findViewById(R.id.button) ;

        countryList.add("Pakistan");
        countryList.add("Canada");
        countryList.add("India");
        countryList.add("China");
        countryList.add("Sirilanka");
        countryList.add("America");
        countryList.add("Israil");
        countryList.add("Japan");

        final ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,countryList);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                myListView.setAdapter(adapter);

            }
        });

    }
}
