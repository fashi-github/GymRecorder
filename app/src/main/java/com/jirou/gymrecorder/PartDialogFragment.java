package com.jirou.gymrecorder;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by wizard on 16/5/30.
 */
public class PartDialogFragment extends DialogFragment {

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
        View armView = view.findViewById(R.id.arm);
        armView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("PartDialog", "arm selected");
                mSelectPartListener.showBuildingPart(((TextView) v).getText().toString());
                dismiss();
            }
        });

        super.onViewCreated(view, savedInstanceState);
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return super.onCreateDialog(savedInstanceState);
    }

    public void setSelectPartListener(BuildingMuscleFragment.SelectPartListener listener) {

        mSelectPartListener = listener;

    }

}
