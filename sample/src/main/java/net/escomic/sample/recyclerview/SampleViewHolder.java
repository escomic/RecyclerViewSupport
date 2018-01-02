package net.escomic.sample.recyclerview;

import android.view.View;
import android.widget.TextView;

import net.escomic.support.recyclerview.RecyclerViewHolder;

/**
 * Created by essim on 2018-01-02.
 */

public class SampleViewHolder extends RecyclerViewHolder {
    TextView txtTitle;
    View btnShare;

    SampleViewHolder(View itemView) {
        super(itemView);
        txtTitle = (TextView) itemView.findViewById(R.id.txt_title);
        btnShare = itemView.findViewById(R.id.btn_share);
        btnShare.setOnClickListener(this);
    }
}
