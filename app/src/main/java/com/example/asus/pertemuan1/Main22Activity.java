package com.example.asus.pertemuan1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main22Activity extends AppCompatActivity implements View.OnClickListener {

    EditText editText;
    TextView textView;
    Button button, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);
        editText = (EditText) findViewById(R.id.editText);
        textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
        public void onClick(View v){
            switch(v.getId()) {
                case R.id.button:
                    textView.setText(editText.getText().toString());
                    break;
                case R.id.button2:
                    textView.setText("");
                    editText.setText("");
                    break;
            }
    }
}