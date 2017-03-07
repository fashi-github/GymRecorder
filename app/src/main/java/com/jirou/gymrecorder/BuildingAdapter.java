package com.jirou.gymrecorder;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import static com.jirou.gymrecorder.R.id.textView;

/**
 * Created by wizard on 17/3/1.
 */

public class BuildingAdapter extends RecyclerView.Adapter<BuildingAdapter.BuildingViewHolder> {

    public static class BuildingViewHolder extends RecyclerView.ViewHolder {

        private final TextView detailTv;

        public BuildingViewHolder(View itemView) {
            super(itemView);
            detailTv = (TextView) itemView.findViewById(R.id.details);
        }
    }

    private List<String> mBuildingDetails;

    public BuildingAdapter(List<String> data) {
        mBuildingDetails = data;
    }

    @Override
    public BuildingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        // Create a new view.
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.building_item, parent, false);

        return new BuildingViewHolder(v);
    }

    @Override
    public void onBindViewHolder(BuildingViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
