package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView greeting = (TextView)findViewById(R.id.textView);
        EditText txt = (EditText)findViewById(R.id.editTextPersonName);
        Button click = (Button)findViewById(R.id.btnClick);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = txt.getText().toString();
                greeting.setText("Hello\n" + name);
                txt.setText(" ");
            }
        });
    }
}
