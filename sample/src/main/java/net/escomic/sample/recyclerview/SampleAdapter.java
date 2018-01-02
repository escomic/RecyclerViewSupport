package net.escomic.sample.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.escomic.support.recyclerview.RecyclerViewAdapter;

/**
 * Created by essim on 2018-01-02.
 */

public class SampleAdapter extends RecyclerViewAdapter<SampleData, SampleViewHolder> {

    private LayoutInflater inflater;

    public SampleAdapter(Context context) {
        inflater = LayoutInflater.from(context);
    }

    @Override
    public SampleViewHolder onCreateItemViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.layout_item, parent, false);
        return new SampleViewHolder(view);
    }

    @Override
    public void onBindItemViewHolder(SampleViewHolder holder, int position) {
        SampleData item = getItem(position);
        holder.txtTitle.setText(item.title);
    }
}
