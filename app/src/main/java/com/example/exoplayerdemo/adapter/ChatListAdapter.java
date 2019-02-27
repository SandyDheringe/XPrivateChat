package com.example.exoplayerdemo.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.exoplayerdemo.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class ChatListAdapter extends RecyclerView.Adapter<ChatListAdapter.ChatViewHolder>
{
    View.OnClickListener onClickListener;

    public ChatListAdapter(View.OnClickListener onClickListener)
    {
        this.onClickListener = onClickListener;
    }

    @NonNull
    @Override
    public ChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chat, parent, false);
        return new ChatViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatViewHolder holder, int position)
    {
        holder.bindView();
    }

    @Override
    public int getItemCount()
    {
        return 20;
    }

    class ChatViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {

        @BindView(R.id.ivAvtar)
        ImageView ivAvtar;

        @BindView(R.id.tvNickName)
        TextView tvNickName;

        public ChatViewHolder(@NonNull View itemView)
        {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(this);
        }

        public void bindView()
        {

            ivAvtar.setImageResource(R.drawable.ic_avtar);
            tvNickName.setText("John Cena");
        }

        @Override
        public void onClick(View v)
        {
            onClickListener.onClick(v);
        }
    }
}
