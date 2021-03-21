package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    /*Called when Activity is First Created*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, "onCreate invoked",Toast.LENGTH_SHORT);
        toast.show();

        Log.d("MainActivity","onCreate invoked");
    }

    /*Called when Activity is About to become Visible*/
    @Override
    protected void onStart() {
        super.onStart();

        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, "onStart invoked",Toast.LENGTH_SHORT);
        toast.show();

        Log.d("MainActivity","onStart invoked");
    }

    /*Called When Activity Is Restarted*/
    @Override
    protected void onRestart() {
        super.onRestart();

        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, "onRestart invoked",Toast.LENGTH_SHORT);
        toast.show();

        Log.d("MainActivity","onRestart invoked");
    }

    /*Called when Activity has become visible*/
    @Override
    protected void onResume() {
        super.onResume();

        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, "onResume invoked",Toast.LENGTH_SHORT);
        toast.show();

        Log.d("MainActivity","onResume invoked");
    }


    /*Called when Another Activity is taking focus*/
    @Override
    protected void onPause() {
        super.onPause();

        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, "onPause invoked",Toast.LENGTH_SHORT);
        toast.show();

        Log.d("MainActivity","onPause invoked");
    }


    /*Called when Activity is no longer visible*/
    @Override
    protected void onStop() {
        super.onStop();

        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, "onStop invoked",Toast.LENGTH_SHORT);
        toast.show();

        Log.d("MainActivity","onStop invoked");
    }


    /*Called just before the activity is destroyed*/
    @Override
    protected void onDestroy() {
        Context context = getApplicationContext();
        super.onDestroy();

        Toast toast = Toast.makeText(context, "onDestroy invoked", Toast.LENGTH_SHORT);
        toast.show();
        }
}
