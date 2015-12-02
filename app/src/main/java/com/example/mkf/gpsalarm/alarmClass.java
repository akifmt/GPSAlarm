package com.example.mkf.gpsalarm;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PowerManager;
import android.widget.Toast;

import android.app.AlarmManager;
import android.app.PendingIntent;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by mkf on 1.12.2015.
 */
public class alarmClass extends Service
{
    private Ringtone ringtone;

    @Override
    public IBinder onBind(Intent intent)
    {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId)
    {
        Uri ringtoneUri = RingtoneManager.getActualDefaultRingtoneUri(getApplicationContext(), RingtoneManager.TYPE_RINGTONE);
        ringtone = RingtoneManager.getRingtone(this, ringtoneUri);
        ringtone.play();

        return START_NOT_STICKY;
    }

    @Override
    public void onDestroy()
    {
        ringtone.stop();
    }
}