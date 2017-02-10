package com.example.gamef.testproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public int i=0;
    int x = 9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i=1;
        Toast.makeText(this, "from priyank", Toast.LENGTH_SHORT).show();
        x = 10;
    }
}
