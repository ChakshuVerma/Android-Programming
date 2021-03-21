package com.example.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private Button Send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText) findViewById(R.id.Name);
        Send = (Button) findViewById(R.id.Send);

        Send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = Name.getText().toString().str)

                //User Actually Enters Something
                if(str.length() > 0) {
                    Intent int_obj = new Intent();
                    int_obj.setAction(Intent.ACTION_SEND);
                    int_obj.putExtra(Intent.EXTRA_TEXT, ;
                    int_obj.setType("text/plain");
                    startActivity(int_obj);
                }
                else    //User Hasn't Entered Anything
                    Name.setError("Content Missing");
            }
        });

    }
}
