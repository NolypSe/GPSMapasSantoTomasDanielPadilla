package com.example.gpsmapas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnMapClickListener,GoogleMap.OnMapLongClickListener {

    EditText txtLatitud, txtLongitud;
    GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtLatitud=findViewById(R.id.txtLatitud);
        txtLongitud=findViewById(R.id.txtLongitud);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.fragment);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap){
        mMap=googleMap;
        this.mMap.setOnMapClickListener(this);
        this.mMap.setOnMapLongClickListener(this);

        LatLng sTomasArica= new LatLng(-18.37024881219408, -70.33098549711374);
        mMap.addMarker(new MarkerOptions().position(sTomasArica).title("STomas Arica"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sTomasArica));

        LatLng sTomasIquique= new LatLng(-20.23928292855018, -70.14488943198442);
        mMap.addMarker(new MarkerOptions().position(sTomasIquique).title("STomas Iquique"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sTomasIquique));

        LatLng sTomasAntofagasta= new LatLng(-23.634584045075012, -70.3940204165514);
        mMap.addMarker(new MarkerOptions().position(sTomasAntofagasta).title("STomas Antofagasta"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sTomasAntofagasta));

        LatLng sTomasLaSerena= new LatLng(-29.901389261149703, -71.26019598752308);
        mMap.addMarker(new MarkerOptions().position(sTomasLaSerena).title("STomas La Serena"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sTomasLaSerena));

        LatLng sTomasVinaDelmar= new LatLng(-33.0364667657514, -71.51731491624969);
        mMap.addMarker(new MarkerOptions().position(sTomasVinaDelmar).title("STomas Viña Del mar"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sTomasVinaDelmar));

        LatLng sTomasSantiago= new LatLng(-33.44883054284838, -70.66078050274271);
        mMap.addMarker(new MarkerOptions().position(sTomasSantiago).title("STomas Santiago"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sTomasSantiago));

        LatLng sTomasTalca= new LatLng(-35.42854256949457, -71.67288281616095);
        mMap.addMarker(new MarkerOptions().position(sTomasTalca).title("STomas Talca"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sTomasTalca));

        LatLng sTomasConcepcion= new LatLng(-36.82606275689734, -73.06156092959887);
        mMap.addMarker(new MarkerOptions().position(sTomasConcepcion).title("STomas Concepcion"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sTomasConcepcion));

        LatLng sTomasLosAngeles= new LatLng(-37.4730545311452, -72.35457098909717);
        mMap.addMarker(new MarkerOptions().position(sTomasLosAngeles).title("sTomas Los Angeles"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sTomasLosAngeles));

        LatLng sTomasTemuco= new LatLng(-38.73447475229141, -72.6020530043904);
        mMap.addMarker(new MarkerOptions().position(sTomasTemuco).title("STomas Temuco"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sTomasTemuco));

        LatLng sTomasValdivia= new LatLng(-39.81724381650577, -73.23314353132992);
        mMap.addMarker(new MarkerOptions().position(sTomasValdivia).title("STomas Valdivia"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sTomasValdivia));

        LatLng sTomasOsorno= new LatLng(-40.57157073351718, -73.13774738897038);
        mMap.addMarker(new MarkerOptions().position(sTomasOsorno).title("STomas Osorno"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sTomasOsorno));

        LatLng sTomasPuertoMontt= new LatLng(-41.47263681742755, -72.92890710427591);
        mMap.addMarker(new MarkerOptions().position(sTomasPuertoMontt).title("STomas Puerto Montt"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sTomasPuertoMontt));
    }

    @Override
    public void onMapClick(@NonNull LatLng latLng){
        txtLatitud.setText(""+latLng.latitude);
        txtLongitud.setText(""+latLng.longitude);
    }

    @Override
    public void onMapLongClick(@NonNull LatLng latLng){
        txtLatitud.setText(""+latLng.latitude);
        txtLongitud.setText(""+latLng.longitude);
    }

    public void VerVideo(View view){
        Intent i = new Intent(this, VideoPromocional.class);
        startActivity(i);
    }

}