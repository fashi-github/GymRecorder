package com.jirou.gymrecorder;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by wizard on 16/5/30.
 */
public class PartDialogFragment extends DialogFragment implements DialogInterface.OnClickListener {

    BuildingMuscleFragment.SelectPartListener mSelectPartListener;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.part_dialog, container, false);
        return v;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }


    @Override
    public void onClick(DialogInterface dialog, int which) {
        mSelectPartListener.showBuildingPart(String.valueOf(which));
    }

    public void setSelectPartListener(BuildingMuscleFragment.SelectPartListener listener) {

        mSelectPartListener = listener;

    }

}
