package com.example.bottomnavbarapplication.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import androidx.lifecycle.ViewModelProviders;
import com.example.bottomnavbarapplication.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;


public class DashboardFragment extends Fragment implements OnMapReadyCallback {
    public DashboardFragment() {

    }
    private DashboardViewModel dashboardViewModel;
    SupportMapFragment mapFragment;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel.class);


        View v= inflater.inflate(R.layout.fragment_dashboard, container, false);
        mapFragment= (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
                if(mapFragment == null) {
                    FragmentManager fm = getFragmentManager();
                    FragmentTransaction ft= fm.beginTransaction();
                    mapFragment= SupportMapFragment.newInstance();
                            ft.replace(R.id.map, mapFragment).commit();
                }
                mapFragment.getMapAsync(this);

        return v;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

    }
}