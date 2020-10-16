package com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap;

import com.google.android.gms.maps.GoogleMap;

public class Map
{
	GoogleMap googleMap;
	
	public Map(GoogleMap googleMap)
	{
		this.googleMap = googleMap;
	}
	
	public void setOnMapClickListener(MapClick mapClick)
	{
		GoogleMap.OnMapClickListener wrapper = new Wrapper$OnMapClickListener(mapClick);
		googleMap.setOnMapClickListener(wrapper);
	}
	
	/*
	public void goToLocation(Location location)
	{
		double lat = location.getLatitude();
		double lng = location.getLongitude();
		LatLng latLng = new LatLng(lat, lng);
		googleMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
	}//*/
}

