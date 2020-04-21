package com.example.projectpratikum.view.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.projectpratikum.R;
import com.example.projectpratikum.adapter.HolidayDiscoverAdapter;
import com.example.projectpratikum.model.holiday.HolidaysDiscoveryResultItem;
import com.example.projectpratikum.view.viewmodel.HolidayViewModel;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HolidayFragment extends Fragment {

    private HolidayDiscoverAdapter holidayDiscoverAdapter;
    private RecyclerView rvHolidayDiscover;
    private HolidayViewModel holidayViewModel;




    public HolidayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_holiday, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        holidayDiscoverAdapter = new HolidayDiscoverAdapter(getContext());
        holidayDiscoverAdapter.notifyDataSetChanged();

        rvHolidayDiscover = view.findViewById(R.id.fragmentholiday_rv);
        rvHolidayDiscover.setLayoutManager(new GridLayoutManager(getContext(),1));

        holidayViewModel = new ViewModelProvider(this).get(HolidayViewModel.class);
        holidayViewModel.setHolidayDiscover();
        holidayViewModel.getHolidayDiscover().observe(this,getHolidayDiscover);

        rvHolidayDiscover.setAdapter(holidayDiscoverAdapter);
    }
    private Observer<ArrayList<HolidaysDiscoveryResultItem>> getHolidayDiscover = new Observer<ArrayList<HolidaysDiscoveryResultItem>>() {
        @Override
        public void onChanged(ArrayList<HolidaysDiscoveryResultItem> holidaysDiscoveryResultItems) {
            if(holidaysDiscoveryResultItems != null){
                holidayDiscoverAdapter.setData(holidaysDiscoveryResultItems);
            }
        }
    };
}
