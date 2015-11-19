package com.example.www.myportfolioapp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity implements View.OnClickListener {
    private final String LOG_TAG = MainActivity.class.getSimpleName();

    private Context appContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appContext = getApplicationContext();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return false;
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

    @Override
    public void onClick(View v) {
        int id = v.getId();
        String messagePrefix = "This will open my ";
        StringBuilder message = new StringBuilder(messagePrefix);
        switch (id) {
            case R.id.spotify_steamer:
                makeToast(message.append(getString(R.string.spotify_steamer)).append(" app!").toString());
                break;
            case R.id.super_duo:
                makeToast(message.append(getString(R.string.super_duo)).append(" app!").toString());
                break;
            case R.id.build_it_bigger:
                makeToast(message.append(getString(R.string.build_it_bigger)).append(" app!").toString());
                break;
            case R.id.xyz_reader:
                makeToast(message.append(getString(R.string.xyz_reader)).append(" app!").toString());
                break;
            case R.id.capstone:
                makeToast(message.append(getString(R.string.capstone)).append(" app!").toString());
                break;
        }
    }
    private void makeToast(String message) {
        Toast.makeText(appContext, message, Toast.LENGTH_SHORT).show();
    }
}
