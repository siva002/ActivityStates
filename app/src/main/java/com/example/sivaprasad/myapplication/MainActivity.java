package com.example.sivaprasad.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    public final String logtag = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(logtag,"onCreate");
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart(){
        Log.d(logtag,"onStart");
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
    @Override
    protected void onSaveInstanceState(Bundle savedInstaceState){
        Log.d(logtag,"onSaveInstanceState");
        super.onSaveInstanceState(savedInstaceState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        Log.d(logtag,"onRestoreInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
    }
//

    public void onClickActivity2(View view) {
        Log.d(logtag,"Activity2 Button Clicked");
        Intent intent = new Intent(this,Activity2.class);
        startActivity(intent);
    }

    public void onClickActivity3(View view) {
        Log.d(logtag,"Activity3 Button Clicked");
        Intent intent = new Intent ( this, Activity3.class);
        startActivity(intent);
    }
}
