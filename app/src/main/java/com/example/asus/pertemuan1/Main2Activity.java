package com.example.asus.pertemuan1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }


    public void leave(View view) {
        Intent intent = new Intent(Main2Activity.this, Main22Activity.class);
        startActivity(intent);
    }
}
