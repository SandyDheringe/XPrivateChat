package com.example.exoplayerdemo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.exoplayerdemo.adapter.ChatAdapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class ChatActivity extends AppCompatActivity
{

    @BindView(R.id.rvChatList)
    RecyclerView rvChatList;
    @BindView(R.id.btnSend)
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        ButterKnife.bind(this);

        rvChatList.setLayoutManager(new LinearLayoutManager(this));
        rvChatList.setAdapter(new ChatAdapter());

        btnSend.setOnClickListener(v -> {
            startActivity(new Intent(ChatActivity.this, AudioCallActivity.class));
        });

    }
}
