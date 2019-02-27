package com.example.exoplayerdemo;

import android.os.Bundle;

import com.example.exoplayerdemo.adapter.ChatAdapter;
import com.example.exoplayerdemo.adapter.ChatListAdapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class ChatActivity extends AppCompatActivity {

    @BindView(R.id.rvChatList)
    RecyclerView rvChatList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        ButterKnife.bind(this);

        rvChatList.setLayoutManager(new LinearLayoutManager(this));
        rvChatList.setAdapter(new ChatAdapter());


    }
}
