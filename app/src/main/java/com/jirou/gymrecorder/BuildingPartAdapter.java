package com.jirou.gymrecorder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by admin on 16/12/7.
 */

public class BuildingPartAdapter {

    static public class BuildingPartViewHolder
            extends RecyclerView.ViewHolder {

        public ImageView mPartIcon;

        public TextView mPartName;

        public BuildingPartViewHolder(View itemView) {
            super(itemView);

            mPartIcon = (ImageView) itemView.findViewById(R.id.part_icon);
            mPartName = (TextView) itemView.findViewById(R.id.part_name);
        }
    }
}
