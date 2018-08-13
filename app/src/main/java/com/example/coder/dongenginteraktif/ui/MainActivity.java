package com.example.coder.dongenginteraktif.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.coder.dongenginteraktif.R;

public class MainActivity extends AppCompatActivity {

    private EditText mEditText;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText = findViewById(R.id.nameText);
        mButton = findViewById(R.id.confirmButton);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String nama =  mEditText.getText().toString();
                mulaiCerita(nama);
            }
        });

    }

    public void mulaiCerita(String nama){
        Intent intent = new Intent(this, ceritaActivity.class);
        intent.putExtra(getString(R.string.key_name),nama);
        startActivity(intent);

    }

}
