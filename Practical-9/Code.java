package com.example.practical9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnRed,btnGray,btnGreen,btnDefault ;
    private ConstraintLayout layoutsuperparent ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layoutsuperparent = (ConstraintLayout)findViewById(R.id.layoutSuperParent);
        btnRed = (Button)findViewById(R.id.btnRed);
        btnGray = (Button)findViewById(R.id.btnGray);
        btnGreen = (Button)findViewById(R.id.btnGreen);
        btnDefault = (Button)findViewById(R.id.btnDefault);

        btnRed.setOnClickListener(this);
        btnGray.setOnClickListener(this);
        btnGreen.setOnClickListener(this);
        btnDefault.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.btnRed :
                            layoutsuperparent.setBackgroundColor(Color.RED);
                            break;

            case R.id.btnGray :
                layoutsuperparent.setBackgroundColor(Color.GRAY);
                break;

            case R.id.btnGreen :
                layoutsuperparent.setBackgroundColor(Color.GREEN);
                break;

            case R.id.btnDefault :
                layoutsuperparent.setBackgroundColor(Color.TRANSPARENT);
                break;
        }
    }
}
