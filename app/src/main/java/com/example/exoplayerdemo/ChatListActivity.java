package com.example.exoplayerdemo;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;

public class ChatListActivity extends AppCompatActivity {


    @BindView(R.id.etUsername)
    EditText etUsername;

    @BindView(R.id.etPassword)
    EditText etPassword;

    @BindView(R.id.btnLogin)
    Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername.setText("Hi");

    }
}
