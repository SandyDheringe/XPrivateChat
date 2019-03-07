package com.example.exoplayerdemo.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
        View view;
        switch (viewType)
        {
            case 0:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chat_message_sent, parent, false);
                return new ChatSentViewHolder(view);
            case 1:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chat_message_received, parent, false);
                return new ChatReceiveViewHolder(view);
            case 2:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_currency_message_sent, parent, false);
                return new ChatSentCurrencyViewHolder(view);
            case 3:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_currency_message_received, parent, false);
                return new ChatReceiveCurrencyViewHolder(view);

            default:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chat_message_sent, parent, false);
                return new ChatSentViewHolder(view);
        }


    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)
    {
        if (holder instanceof ChatSentViewHolder)
            ((ChatSentViewHolder) holder).bindView(position);
        else  if (holder instanceof ChatReceiveViewHolder)
            ((ChatReceiveViewHolder) holder).bindView(position);
        else  if (holder instanceof ChatSentCurrencyViewHolder)
            ((ChatSentCurrencyViewHolder) holder).bindView(position);
        else  if (holder instanceof ChatReceiveCurrencyViewHolder)
            ((ChatReceiveCurrencyViewHolder) holder).bindView(position);
    }

    @Override
    public int getItemViewType(int position)
    {
        return position % 4;
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

    class ChatReceiveCurrencyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {

        @BindView(R.id.tvMessage)
        TextView tvMessage;

        @BindView(R.id.tvAmount)
        TextView tvAmount;

        public ChatReceiveCurrencyViewHolder(@NonNull View itemView)
        {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(this);

        }

        public void bindView(int position)
        {
            tvMessage.setText("John Cena has sent you");
            tvAmount.setText("2000 XPC");
        }

        @Override
        public void onClick(View v)
        {

        }
    }

    class ChatSentCurrencyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {

        @BindView(R.id.tvMessage)
        TextView tvMessage;

        @BindView(R.id.tvAmount)
        TextView tvAmount;


        public ChatSentCurrencyViewHolder(@NonNull View itemView)
        {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(this);

        }

        public void bindView(int position)
        {
            tvMessage.setText("You have sent");
            tvAmount.setText("500 XPC");
        }

        @Override
        public void onClick(View v)
        {

        }
    }
}
