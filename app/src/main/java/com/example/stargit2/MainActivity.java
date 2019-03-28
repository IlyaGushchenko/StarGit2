package com.example.stargit2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import android.widget.AdapterView;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    int i = 1;
    TextView mainTextView;
    Button mainButton;
    EditText mainEditText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainTextView = findViewById(R.id.main_textview);
        mainTextView.setText("Нажми на кнопку снизу");

        mainButton = findViewById(R.id.main_button);
        mainButton.setOnClickListener(this);




    }
    @Override
    public void onClick(View v) {
        mainTextView.setText("Была нажата " + i + " раз");
        i++;

    }






}
