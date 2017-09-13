package com.mocity.rom.pixel;

import android.widget.RemoteViews;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public class WeatherUpdateReceiver extends BroadcastReceiver
{
    public void onReceive(final Context context, final Intent intent) {
        WeatherListener.getInstanceUI(context).bH((RemoteViews)intent.getParcelableExtra("com.mocity.rom.weather_view"));
    }
}