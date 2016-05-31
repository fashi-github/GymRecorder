package com.jirou.gymrecorder;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by wizard on 16/5/2.
 */
public class BuildingMuscleFragment extends Fragment {
    public BuildingMuscleFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_building_muscle, container, false);

        Button selectPartBtn = (Button) v.findViewById(R.id.button);

        selectPartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PartDialogFragment mdf = new PartDialogFragment();
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                mdf.show(ft, "df");
            }
        });


        return v;


    }
}
