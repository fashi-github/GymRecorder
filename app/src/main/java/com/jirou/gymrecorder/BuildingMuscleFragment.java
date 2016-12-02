package com.jirou.gymrecorder;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jirou.gymrecorder.coustm.widget.FloatingActionButton;

/**
 * Created by wizard on 16/5/2.
 */
public class BuildingMuscleFragment extends Fragment {
    public BuildingMuscleFragment(){}

    public interface SelectPartListener {
        void showBuildingPart(String part);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_building_muscle, container, false);
        final LinearLayout buildingParts = (LinearLayout) v.findViewById(R.id.building_part);

        FloatingActionButton legBtn = (FloatingActionButton) v.findViewById(R.id.leg_btn);
        legBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView legText = new TextView(getContext());
                legText.setText("L   e    g");
                ViewGroup.LayoutParams marginLayoutParams =
                        new ViewGroup.LayoutParams(1000, 100);
                legText.setLayoutParams(marginLayoutParams);
//                marginLayoutParams. = 1000;
//                marginLayoutParams.topMargin = 1000;
//                marginLayoutParams.rightMargin = 1000;
//                marginLayoutParams.bottomMargin = 1000;
                buildingParts.addView(legText, marginLayoutParams);
            }
        });

        RecyclerView buildingProcedures = (RecyclerView) v.findViewById(R.id.building_procedures);


//        Button selectPartBtn = (Button) v.findViewById(R.id.select_part_btn);
//        final TextView selectedPart = (TextView) v.findViewById(R.id.part_selected);
//        final Button selectActionBtn = (Button) v.findViewById(R.id.select_action_btn);
//
//        selectPartBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                PartDialogFragment dialog = new PartDialogFragment();
//                dialog.setSelectPartListener(new SelectPartListener() {
//                    @Override
//                    public void showBuildingPart(String part) {
//                        Toast.makeText(getContext(), part, Toast.LENGTH_SHORT).show();
//                        selectedPart.setVisibility(View.VISIBLE);
//                        selectedPart.setText(part);
//                        selectActionBtn.setVisibility(View.VISIBLE);
//                    }
//                });
//                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
//                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
//                dialog.show(ft, "df");
//            }
//        });
//
//        selectActionBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("wizard", "Building muscle");
//            }
//        });

        return v;


    }
}
