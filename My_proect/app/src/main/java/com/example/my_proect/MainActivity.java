package com.example.my_proect;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener{

    TextView mainTextView;
    Button mainButton;
    EditText mainEditText;

    ListView mainListView;
    ArrayAdapter mArrayAdapter;
    ArrayList mNameList = new ArrayList();

    Button ok_btn;
    Button cnc_btn;


    @SuppressLint("MissingInFloated")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainTextView = findViewById(R.id.main_textview);
        mainTextView.setText("privet");
        mainButton = findViewById(R.id.main_button);
        mainButton.setText(" update Button");

        mainButton.setOnClickListener(this);
        mainEditText = (EditText) findViewById(R.id.main_edittext);
        mainListView = findViewById(R.id.main_listview);
        mArrayAdapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,
                mNameList);
        mainListView.setAdapter(mArrayAdapter);


        mainListView.setAdapter(mArrayAdapter);
        mainListView.setOnItemClickListener(this);

        ok_btn = findViewById(R.id.ok_btn);
        cnc_btn = findViewById(R.id.cnc_btn);
        ok_btn.setOnClickListener(oclBtn);
        cnc_btn.setOnClickListener(oclBtn);




    }
    private void setUpAutoComplete()
    {
        mArrayAdapter.add("test string");   // this is successfully added to the drop down list
        Collections.sort(mNameList);
        mArrayAdapter.notifyDataSetChanged();
    }


    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View View) {
        mainTextView.setText(mainEditText.getText().toString()
                + " is learning Android development!");
        mNameList.add(mainEditText.getText().toString());
        mArrayAdapter.notifyDataSetChanged();





        }




    public void onItemClick(AdapterView<?> parent, View view, int position,
                            long id)
    {
        Log.d("omg android", position + ": " + mNameList.get(position));
        mainTextView.setText(mNameList.get(position).toString()
                + " is learning Android development!");

        Set<String> set = new HashSet<>(mNameList);
        mNameList.clear();
        mNameList.addAll(set);

     

    }

    final View.OnClickListener oclBtn = new View.OnClickListener() {
        
        @Override
        public void onClick(View view)
        {

            if ((view.getId()) == R.id.ok_btn) {
                mainTextView.setText("Нажата кнопка ОК");
                Toast.makeText(getApplicationContext(), "Нажата кнопка ОК",
                        Toast.LENGTH_LONG).show();
            }
            if ((view.getId()) == R.id.cnc_btn) {
                mainTextView.setText("Нажата кнопка Cancel");
                Toast.makeText(getApplicationContext(), "Нажата кнопка Cencel",
                        Toast.LENGTH_LONG).show();



            }
        }
    };}






