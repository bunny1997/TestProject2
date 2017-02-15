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
        x = 101;
        Toast.makeText(this, "this is done by priyank for  mona", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Priyank loves you the most , you are too beautiful to be true", Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this, "you are carazy guy ekdum pagla in mona 2", Toast.LENGTH_SHORT).show();


        Toast.makeText(MainActivity.this, "Mona hates youbhut sarabhuttt...teko to chodungi nai..kabhi bhi nai", Toast.LENGTH_SHORT).show();

        Toast.makeText(this, "this is done in new branch", Toast.LENGTH_SHORT).show();


    }
}
