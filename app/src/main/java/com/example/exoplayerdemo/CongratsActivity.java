package com.example.exoplayerdemo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

public class CongratsActivity extends AppCompatActivity {


    @BindView(R.id.etNickName)
    EditText etNickName;


    @BindView(R.id.btnSave)
    Button btnSave;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_1);
        ButterKnife.bind(this);

        btnSave.setOnClickListener(v -> {
            startActivity(new Intent(CongratsActivity.this, ChatListActivity.class));

        });


    }
}
