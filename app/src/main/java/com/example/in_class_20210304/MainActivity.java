package com.example.in_class_20210304;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayAdapter<String> myAdapter;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<String> myArrayList = new ArrayList<String>();
        myArrayList.add("Larry Fine");
        myArrayList.add("Moe Howard");
        myArrayList.add("Curly Howard");


        ListView myListView = (ListView) findViewById(R.id.LV);
        myAdapter = new
                ArrayAdapter<String>(this,R.layout.my_text_view,myArrayList);
        myListView.setAdapter(myAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("ME", "pos" + position);
            }
        });

    }

    public void addToList(View v) {

        editText = (EditText) findViewById(R.id.editText);



        myAdapter.add((String)editText.getText().toString());

    }






}