package com.jordan.betcher.siviso.sivisolite.home;

import android.widget.Button;

import androidx.appcompat.widget.SwitchCompat;

import com.jordan.betcher.siviso.sivisolite.R;
import com.jordan.betcher.siviso.sivisolite.home.Database.Database;
import com.jordan.betcher.siviso.sivisolite.home.onoffview.lock.Lock$OnOff;
import com.jordan.betcher.siviso.sivisolite.home.onoffview.onoff.OnOff;
import com.jordan.betcher.siviso.sivisolite.thirdparty.permissions.Permission$AccessNotificationPolicy;

class OnOffView
{
	OnOff onOff;
	Lock$OnOff lock;
	
	public OnOffView(
	Activity_Home activity,
	Permission$AccessNotificationPolicy permission, Database database)
	{
		SwitchCompat onOffSwitch = activity.findViewById(R.id.switchOnOff);
		Button onOffLock = activity.findViewById(R.id.onOffLock);
		onOff = new OnOff(activity, onOffSwitch, database.isOnn());
		lock = new Lock$OnOff(onOffSwitch, onOffLock, permission);
	}
}
