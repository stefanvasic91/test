package com.easyswitch.test.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.easyswitch.test.R;
import com.easyswitch.test.models.Item;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RepositoryAdapter extends RecyclerView.Adapter<RepositoryAdapter.ReposHolder> {

    Context context;
    List<Item> reposList;
    OnItemClickListener onItemClickListener;
    OnAvatarClickListener onAvatarClickListener;

    public RepositoryAdapter(Context context, List<Item> reposList) {
        this.context = context;
        this.reposList = reposList;
    }

    public interface OnItemClickListener {
        void onItemClick(View v, int position, Item item);
    }

    public interface OnAvatarClickListener {
        void onAvatarClick(View v, int position, Item item);
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public void setOnAvatarClickListener(OnAvatarClickListener onAvatarClickListener) {
        this.onAvatarClickListener = onAvatarClickListener;
    }

    @NonNull
    @Override
    public ReposHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ReposHolder(LayoutInflater.from(parent.getContext())
        .inflate(R.layout.item_repository, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ReposHolder holder, int position) {
        Item item = reposList.get(position);

        Picasso.with(context).load(item.getOwner().getAvatarUrl()).into(holder.ivAvatar);
        holder.tvName.setText(item.getName());
        holder.tvAuthor.setText(item.getOwner().getLogin());
        holder.tvWatchers.setText(String.valueOf(item.getWatchers()));
        holder.tvForks.setText(String.valueOf(item.getForks()));
        holder.tvIssues.setText(String.valueOf(item.getOpenIssuesCount()));
    }

    @Override
    public int getItemCount() {
        return reposList.size();
    }

    class ReposHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.ivAvatar)
        ImageView ivAvatar;
        @BindView(R.id.tvName)
        TextView tvName;
        @BindView(R.id.tvAuthor)
        TextView tvAuthor;
        @BindView(R.id.tvWatchers)
        TextView tvWatchers;
        @BindView(R.id.tvForks)
        TextView tvForks;
        @BindView(R.id.tvIssues)
        TextView tvIssues;

        public ReposHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        @OnClick(R.id.llRepo)
        public void pickItem() {
            if (onItemClickListener != null && getAdapterPosition() != RecyclerView.NO_POSITION) {
                onItemClickListener.onItemClick(itemView, getAdapterPosition(), reposList.get(getAdapterPosition()));
            }
        }

        @OnClick(R.id.ivAvatar)
        public void avatarclick() {
            if (onAvatarClickListener != null && getAdapterPosition() != RecyclerView.NO_POSITION) {
                onAvatarClickListener.onAvatarClick(itemView, getAdapterPosition(), reposList.get(getAdapterPosition()));
            }
        }
    }
}
