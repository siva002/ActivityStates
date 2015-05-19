package com.example.sivaprasad.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends ActionBarActivity {

    public final String logtag = this.getClass().getSimpleName();
    public static String state;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(logtag, "on Create");
        setContentView(R.layout.activity_main);
        state = "on Create";
        textView  = (TextView) findViewById(R.id.textview_activity1);
        textView.setText(state);

    }

    @Override
    protected void onStart(){
        Log.d(logtag,"onStart");
        super.onStart();
        state = "on Start";
        textView  = (TextView) findViewById(R.id.textview_activity1);
        textView.setText(state);

    }

    @Override
    protected void onStop(){
        Log.d(logtag,"OnStop");
        super.onStop();
        state = "on Stop";
        textView  = (TextView) findViewById(R.id.textview_activity1);
        textView.setText(state);
    }

    @Override
    protected void onResume(){
        Log.d(logtag, "on Resume");
        super.onResume();
        state = "on Resume";
        textView  = (TextView) findViewById(R.id.textview_activity1);
        textView.setText(state);

    }

    @Override
    protected void onRestart(){
        Log.d(logtag,"On Restart");
        super.onRestart();
        state = "on Re Start";
        textView  = (TextView) findViewById(R.id.textview_activity1);
        textView.setText(state);
    }

    @Override
    protected void onPause(){
        Log.d(logtag,"OnPause");
        super.onPause();
        state = "on Pause";
        textView  = (TextView) findViewById(R.id.textview_activity1);
        textView.setText(state);

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