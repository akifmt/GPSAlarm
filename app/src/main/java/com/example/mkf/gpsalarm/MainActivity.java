package com.example.mkf.gpsalarm;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private alarmClass alarm;

    public void startRepeatingTimer(View view) {

    }

    public void cancelRepeatingTimer(View view){

        Intent i = new Intent(this, alarmClass.class);
        stopService(i);
        Toast.makeText(getApplicationContext(), "bitti", Toast.LENGTH_SHORT).show();

    }

    public void onetimeTimer(View view){


        Intent i = new Intent(this, alarmClass.class);
        MainActivity.this.startService(i);
        Toast.makeText(MainActivity.this, "başla", Toast.LENGTH_SHORT).show();

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alarm = new alarmClass();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
