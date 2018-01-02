package net.escomic.support.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by essim
 */
public class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {

    private RecyclerViewItemClickListener clickListener;
    private RecyclerViewItemLongClickListener longClickListener;

    public RecyclerViewHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        itemView.setOnLongClickListener(this);
    }

    void setListener(RecyclerViewItemClickListener clickListener, RecyclerViewItemLongClickListener longClickListener) {
        this.clickListener = clickListener;
        this.longClickListener = longClickListener;
    }

    @Override
    public void onClick(View v) {
        int position = getAdapterPosition();
        if (clickListener != null) clickListener.onItemClick(position, v);
    }

    @Override
    public boolean onLongClick(View v) {
        int position = getAdapterPosition();
        if (longClickListener != null) {
            longClickListener.onItemLongClick(position, v);
            return true;
        }
        return false;
    }
}
