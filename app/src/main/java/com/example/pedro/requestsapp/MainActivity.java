package com.example.pedro.requestsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText urlEdit, paramsEdit;
    Button sendBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        urlEdit = (EditText) findViewById(R.id.edit1);
        paramsEdit = (EditText) findViewById(R.id.edit2);
        sendBtn = (Button) findViewById(R.id.btn1);
    }
}
