package com.gzeinnumer.xmlstring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String xmlString1 = getResources().getString(R.string.read_string);
        String xmlString2 = getString(R.string.read_string);

        String[] arrayString = getResources().getStringArray(R.array.array_string);
        String array1 = arrayString[0];
    }
}