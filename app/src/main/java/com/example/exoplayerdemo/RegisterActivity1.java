package com.example.exoplayerdemo;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

public class RegisterActivity1 extends AppCompatActivity {


    @BindView(R.id.etNickName)
    EditText etNickName;


    @BindView(R.id.btnSave)
    Button btnSave;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_1);
        ButterKnife.bind(this);

    }
}
