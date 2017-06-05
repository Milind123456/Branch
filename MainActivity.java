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
        int i = 7;
        int ii = 30;
       int iii = 56;


        String iString = Integer.toString(ii);
        String iiString;
        if (i < 100) {
            iiString = Integer.toString(ii + 9);
        }
    }

}
