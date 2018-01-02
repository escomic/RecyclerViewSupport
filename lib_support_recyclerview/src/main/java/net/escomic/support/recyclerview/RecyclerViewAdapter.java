package net.escomic.support.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by essim
 */
public abstract class RecyclerViewAdapter<E, VH extends RecyclerViewHolder> extends RecyclerView.Adapter<VH> implements RecyclerViewItemClickListener, RecyclerViewItemLongClickListener {

    private RecyclerViewItemClickListener clickListener;
    private RecyclerViewItemLongClickListener longClickListener;
    private ArrayList<E> items = new ArrayList<>();

    public void setOnItemClickListener(RecyclerViewItemClickListener listener) {
        this.clickListener = listener;
    }

    public void setOnItemLongClickListener(RecyclerViewItemLongClickListener listener) {
        this.longClickListener = listener;
    }

    @Override
    public final VH onCreateViewHolder(ViewGroup parent, int viewType) {
        VH holder = onCreateItemViewHolder(parent, viewType);
        holder.setListener(this, this);
        return holder;
    }

    @Override
    public final void onBindViewHolder(VH holder, int position) {
        onBindItemViewHolder(holder, position);
    }

    abstract public VH onCreateItemViewHolder(ViewGroup parent, int viewType);

    abstract public void onBindItemViewHolder(VH holder, int position);

    @Override
    public void onItemClick(int position, View view) {
        if (clickListener != null) clickListener.onItemClick(position, view);
    }

    @Override
    public void onItemLongClick(int position, View view) {
        if (longClickListener != null) longClickListener.onItemLongClick(position, view);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public E getItem(int position) {
        return items.get(position);
    }

    public void add(E data) {
        items.add(data);
    }

    public void add(int index, E data) {
        items.add(index, data);
    }

    public void addAll(List<E> data) {
        items.addAll(data);
    }

    public E remove(int index) {
        return items.remove(index);
    }

    public void remove(E data) {
        items.remove(data);
    }

    public int indexOf(E data) {
        return items.indexOf(data);
    }

    public void clear() {
        items.clear();
    }

    public ArrayList<E> getItems() {
        ArrayList<E> items = new ArrayList<>();
        for (int i = 0; i < getItemCount(); i++) {
            items.add(getItem(i));
        }
        return items;
    }

}
