package com.example.exoplayerdemo.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.exoplayerdemo.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class ChatAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {

        if (viewType == 0)
        {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chat_message_sent, parent, false);
            return new ChatSentViewHolder(view);
        }
        else
        {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chat_message_received, parent, false);
            return new ChatReceiveViewHolder(view);
        }

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)
    {
        if (holder instanceof ChatSentViewHolder)
            ((ChatSentViewHolder) holder).bindView(position);
        else
            ((ChatReceiveViewHolder) holder).bindView(position);
    }

    @Override
    public int getItemViewType(int position)
    {
        if (position % 2 == 0)
            return 0;
        else return 1;
    }

    @Override
    public int getItemCount()
    {
        return 20;
    }

    class ChatReceiveViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {

        @BindView(R.id.tvMessage)
        TextView tvMessage;

        @BindView(R.id.tvNickName)
        TextView tvNickName;


        public ChatReceiveViewHolder(@NonNull View itemView)
        {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(this);

        }

        public void bindView(int position)
        {
            tvMessage.setText("This is demo message showing the appearance and layout - Received");
            tvNickName.setText("John Cena");
        }

        @Override
        public void onClick(View v)
        {

        }
    }

    class ChatSentViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {

        @BindView(R.id.tvMessage)
        TextView tvMessage;

        @BindView(R.id.tvNickName)
        TextView tvNickName;


        public ChatSentViewHolder(@NonNull View itemView)
        {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(this);

        }

        public void bindView(int position)
        {
            tvMessage.setText("This is demo message showing the appearance and layout - Sent");
            tvNickName.setText("John Cena");
        }

        @Override
        public void onClick(View v)
        {

        }
    }
}
