package com.jordan.betcher.siviso.sivisolite.thirdparty.permissions;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class Permission$AccessFineLocation implements Permission
{
	private Activity activity;
	
	public Permission$AccessFineLocation(Activity activity)
	{
		this.activity = activity;
	}
	
	@Override
	public void request()
	{
		ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 0);
	}
	
	@Override
	public boolean isGranted()
	{
		int responseCode = ContextCompat
		.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION);
		
		if(responseCode == PackageManager.PERMISSION_GRANTED)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	ArrayList<Listener$PermissionGranted> listeners = new ArrayList<>();
	
	@Override
	public void grant()
	{
		if(isGranted())
		{
			callAllListeners();
		}
	}
	
	private void callAllListeners()
	{
		for(Listener$PermissionGranted listener : listeners)
		{
			listener.act();
		}
	}
	
	@Override
	public void addListener(
	Listener$PermissionGranted listener)
	{
		this.listeners.add(listener);
	}
}
