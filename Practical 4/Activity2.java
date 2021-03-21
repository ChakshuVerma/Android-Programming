package com.example.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AnotherActivity extends AppCompatActivity {

    private TextView Text;
    private Button GoBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        Text = (TextView) findViewById(R.id.Text);
        Text.setText(
                getIntent().getExtras().getString(Intent.EXTRA_TEXT)
        );

        GoBack = (Button) findViewById(R.id.GoBack);
        GoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
