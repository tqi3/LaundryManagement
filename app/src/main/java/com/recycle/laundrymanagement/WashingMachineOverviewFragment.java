package com.recycle.laundrymanagement;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class WashingMachineOverviewFragment extends Fragment {
    private OverviewAdapter mOverviewAdapter;
    private RecyclerView mRecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.washing_machine_overview_layout, container, false);
        mRecyclerView = rootView.findViewById(R.id.recycler_view);
        List<WashingMachine> listItems = new ArrayList<WashingMachine>() {
            {
                add(new WashingMachine("Ready for usage!", R.drawable.washing_machine));
                add(new WashingMachine("Ready for usage!", R.drawable.washing_machine));
                add(new WashingMachine("Ready for usage!", R.drawable.washing_machine));
                add(new WashingMachine("Ready for usage!", R.drawable.washing_machine));
                add(new WashingMachine("Ready for usage!", R.drawable.washing_machine));
                add(new WashingMachine("Ready for usage!", R.drawable.washing_machine));
                add(new WashingMachine("Ready for usage!", R.drawable.washing_machine));
                add(new WashingMachine("Ready for usage!", R.drawable.washing_machine));
                add(new WashingMachine("Ready for usage!", R.drawable.washing_machine));
            }
        };
        mRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
        mOverviewAdapter = new OverviewAdapter(getContext(), listItems);

        mRecyclerView.setAdapter(mOverviewAdapter);
        return rootView;
    }
}
