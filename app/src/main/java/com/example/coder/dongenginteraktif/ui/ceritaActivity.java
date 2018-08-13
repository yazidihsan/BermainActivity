package com.example.coder.dongenginteraktif.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.coder.dongenginteraktif.R;

public class ceritaActivity extends AppCompatActivity {
    public static final String TAG = ceritaActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cerita);
        Intent intent = getIntent();
        String nama = intent.getStringExtra(getString(R.string.key_name));
        if(nama == null){

        }

        Log.d(TAG,nama);
    }
}
