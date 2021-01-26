package com.jordan.betcher.siviso.sivisolite.home.mapview.map;

import android.content.res.Resources;

import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.jordan.betcher.siviso.sivisolite.R;
import com.jordan.betcher.siviso.sivisolite.thirdparty.googlemap.CircleOptionsCreator;

class CircleOptionsCreator$Highlight implements CircleOptionsCreator
{
	private int fillColor;
	private int radius;
	public LatLng latLng;
	
	public CircleOptionsCreator$Highlight(Resources resources, LatLng latLng)
	{
		radius = resources.getInteger(R.integer.highlightRadius);
		fillColor = resources.getColor(R.color.highlight);
		this.latLng = latLng;
	}
	
	@Override
	public CircleOptions circleOptions()
	{
		CircleOptions circleOptions = new CircleOptions();
		circleOptions.center(latLng);
		circleOptions.radius(radius);
		circleOptions.fillColor(fillColor);
		
		return circleOptions;
	}
}
