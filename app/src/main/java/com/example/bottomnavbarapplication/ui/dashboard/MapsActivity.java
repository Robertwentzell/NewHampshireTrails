package com.example.bottomnavbarapplication.ui.dashboard;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.example.bottomnavbarapplication.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_dashboard);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
        public void onMapReady(GoogleMap googleMap){
        map = googleMap;

        // 1.
        LatLng MagallowayMountain = new LatLng(45.063611, -71.163056);
        map.addMarker(new MarkerOptions().position(MagallowayMountain).title("Magalloway Mountain"));

        LatLng GraniteTownRailTrail = new LatLng(42.825297, -71.648559);
        map.addMarker(new MarkerOptions().position(GraniteTownRailTrail).title("Granite Town Rail Trail"));

        LatLng MonadnockMountain = new LatLng(42.860827, -72.108756);
        map.addMarker(new MarkerOptions().position(MonadnockMountain).title("Monadnock Mountain"));

        LatLng TableRockTrail = new LatLng(43.141793, -72.439570);
        map.addMarker(new MarkerOptions().position(TableRockTrail).title("Table Rock Trail"));

        // 5.
        LatLng SugarloafMountainTrail = new LatLng(44.251606, -71.517924);
        map.addMarker(new MarkerOptions().position(SugarloafMountainTrail).title("Sugarloaf Mountain Trail"));

        LatLng NorthPercyTrail = new LatLng(44.663139, -71.435553);
        map.addMarker(new MarkerOptions().position(NorthPercyTrail).title("North Percy Trail"));

        LatLng KilkenneyRidgeTrail = new LatLng(44.597017, -71.368317);
        map.addMarker(new MarkerOptions().position(KilkenneyRidgeTrail).title("Kilkenney Ridge Trail"));

        LatLng GarfieldFallsTrail = new LatLng(45.035142, -71.113665);
        map.addMarker(new MarkerOptions().position(GarfieldFallsTrail).title("Garfield Falls Trail"));

        LatLng ProspectMountainTrail = new LatLng(44.451511, -71.570362);
        map.addMarker(new MarkerOptions().position(ProspectMountainTrail).title("Prospect Mountain Trail"));

        // 10.
        LatLng KilburnCragTrail = new LatLng(44.321008, -71.814537);
        map.addMarker(new MarkerOptions().position(KilburnCragTrail).title("Kilburn Crag Trail"));

        LatLng PeakedHillPondTrail = new LatLng(43.897379, -71.686255);
        map.addMarker(new MarkerOptions().position(PeakedHillPondTrail).title("Peaked Hill Pond Trail"));

        LatLng ProfileFallsTrail = new LatLng(43.568245, -71.731812);
        map.addMarker(new MarkerOptions().position(ProfileFallsTrail).title("Profile Falls Trail"));

        LatLng McCarthyTrail = new LatLng(43.379358, -71.048152);
        map.addMarker(new MarkerOptions().position(McCarthyTrail).title("McCarthy Trail"));

        LatLng NorthwoodMeadowsStatePark = new LatLng(43.213097, -71.198262);
        map.addMarker(new MarkerOptions().position(NorthwoodMeadowsStatePark).title("Northwood Meadows State Park"));

        // 15.
        LatLng GreatBrookTrail = new LatLng(43.213097, -71.198262);
        map.addMarker(new MarkerOptions().position(GreatBrookTrail).title("Great Brook Trail"));

        map.moveCamera(CameraUpdateFactory.newLatLng(MagallowayMountain));
    }
}
