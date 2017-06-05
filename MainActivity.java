package com.example.test.branch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
   public void doSomething() {
        int i = 60;
        int ii = 900;


        String iString = Integer.toString(i);
        String iiString;
        if (i <= 100) {
            iiString = Integer.toString(ii + 9);
        }
    }

}
