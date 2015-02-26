package com.example.googlemapsdemo;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends FragmentActivity {

	  static final LatLng INDIA = new LatLng(21.0000, 78.0000);
	  private GoogleMap map;

	
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		getMapFragment();
		@SuppressWarnings("unused")
		Marker india = map.addMarker(new MarkerOptions().position(INDIA)
				.title("INDIA"));
		map.moveCamera(CameraUpdateFactory.newLatLngZoom(INDIA, 5));
	}
	
	private void getMapFragment() {

		if(map==null)
			map = ((SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
