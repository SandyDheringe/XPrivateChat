package com.example.exoplayerdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.exoplayerdemo.adapter.ChatListAdapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class AccountListActivity extends AppCompatActivity implements View.OnClickListener
{

    @BindView(R.id.rvChatList)
    RecyclerView rvChatList;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_list);

        ButterKnife.bind(this);

        rvChatList.setLayoutManager(new LinearLayoutManager(this));
        rvChatList.setAdapter(new ChatListAdapter(this));


    }

    @Override
    public void onClick(View v)
    {
        startActivity(new Intent(this, ChatActivity.class));
    }
}
