package com.jirou.gymrecorder;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by wizard on 16/5/2.
 */
public class BuildingMuscleFragment extends Fragment {
    public BuildingMuscleFragment(){}

    public interface SelectPartListener {
        public void showBuildingPart(String part);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_building_muscle, container, false);

        Button selectPartBtn = (Button) v.findViewById(R.id.button);

        selectPartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PartDialogFragment dialog = new PartDialogFragment();
                dialog.setSelectPartListener(new SelectPartListener() {
                    @Override
                    public void showBuildingPart(String part) {
                        Toast.makeText(getContext(), part, Toast.LENGTH_SHORT).show();
                    }
                });
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                dialog.show(ft, "df");
            }
        });


        return v;


    }
}
