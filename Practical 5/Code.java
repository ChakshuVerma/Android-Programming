package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.My,
                android.R.layout.simple_spinner_item
        );

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner = findViewById(R.id.spinner);
        image = findViewById(R.id.image);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch(position)
                {
                    case 1:
                        image.setImageResource(R.drawable.arsd);
                        Toast.makeText(parent.getContext(), "Atmaram Sanatan Dharma College",Toast.LENGTH_SHORT).show();
                        break;

                    case 2:
                        image.setImageResource(R.drawable.city);
                        Toast.makeText(parent.getContext(), "New Delhi",Toast.LENGTH_SHORT).show();
                        break;

                    case 3:
                        image.setImageResource(R.drawable.india);
                        Toast.makeText(parent.getContext(), "india",Toast.LENGTH_SHORT).show();
                        break;

                    case 4:
                        image.setImageResource(R.drawable.circleearth);
                        Toast.makeText(parent.getContext(), "Earth",Toast.LENGTH_SHORT).show();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
