package com.example.sivaprasad.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Activity2 extends ActionBarActivity {

    public final String logtag = this.getClass().getSimpleName();
    public static String state;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        state = "onCreate";
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);

        Log.d(logtag,"onCreate");
    }


    @Override
    protected void onStart(){
        Log.d(logtag, "onStart");
        super.onStart();
    }

    @Override
    protected void onStop(){
        Log.d(logtag,"OnStop");
        super.onStop();
    }

    @Override
    protected void onResume(){
        Log.d(logtag, "onResume");
        super.onResume();
    }

    @Override
    protected void onRestart(){
        Log.d(logtag,"OnRestart");
        super.onRestart();
    }

    @Override
    protected void onPause(){
        Log.d(logtag,"OnPause");
        super.onPause();
    }

    @Override
    protected void onDestroy(){
        Log.d(logtag,"OnDestroy");
        super.onDestroy();
    }

    public void onClickActivity3(View view) {

        Log.d(logtag,"Activity 3 Clicked");
        Intent intent = new Intent(this,Activity3.class);
        startActivity(intent);
    }
}
