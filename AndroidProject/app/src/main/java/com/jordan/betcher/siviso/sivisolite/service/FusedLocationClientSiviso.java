package com.jordan.betcher.siviso.sivisolite.service;

import android.content.Context;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationServices;

class FusedLocationClientSiviso
{
	LocationClient$Siviso client;
	
	public FusedLocationClientSiviso(Context context)
	{
		Factory$LocationRequest factory$LocationRequest = new Factory$LocationRequest();
		FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context);
		LocationCallback callback = new LocationCallback$Siviso();
		client = new LocationClient$Siviso(fusedLocationProviderClient, factory$LocationRequest,
		                                   callback);
	}
	
	public void start()
	{
		client.start();
	}
	
	public void stop()
	{
		client.stop();
	}
}
