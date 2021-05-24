package com.shell.viewmodalsample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private MyViewModal mViewModal;
    private TextView mUsername;
    private Button mSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewModal = new ViewModelProvider(this).get(MyViewModal.class);
        mUsername = findViewById(R.id.username);
        mUsername.setText(mViewModal.mUsername);
        mSubmit = findViewById(R.id.submit);
        mSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewModal.setUsername("Malayalee");
            }
        });
    }
}