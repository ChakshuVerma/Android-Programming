package com.example.radiobuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private HashMap<String,String> coursemap;
    private TextView course;
    private TextView teacherincharge;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        course = (TextView) findViewById(R.id.TV1);
        teacherincharge = (TextView) findViewById(R.id.TV2);
        radioGroup = (RadioGroup) findViewById(R.id.RG);

        insertValuesInCourseMap();
        fillRadioGroup();
        displayTeacherInCharge();
    }

    private void insertValuesInCourseMap(){
        coursemap = new HashMap<>();

        coursemap.put("B.Sc(Hons) Computer Science","Dr. V.S Dixit");
        coursemap.put("B.Sc(Hons) Mathematics","Dr. Raj Kumar Bhagat");
        coursemap.put("B.A(Hons) Economics","Dr. V.S Dixit");
        coursemap.put("B.Com(Hons)","Dr. Manika Jain");

    }

    private void fillRadioGroup(){
        for(String courseName: coursemap.keySet()){
            RadioButton rb = new RadioButton( MainActivity.this);
            rb.setText(courseName);
            radioGroup.addView(rb);
        }
        RadioButton rb = new RadioButton( MainActivity.this);
        rb.setText("None");
        radioGroup.addView(rb);
    }

    private void displayTeacherInCharge(){

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                int selectedID = radioGroup.getCheckedRadioButtonId();
                RadioButton rb = (RadioButton) findViewById(selectedID);
                if(rb.getText() == "None"){
                    course.setHint("Select One Option");
                    teacherincharge.setText("");
                }
                else {
                    course.setText("Course: " + rb.getText());
                    teacherincharge.setText("Teacher In Charge: " + coursemap.get(rb.getText()));
                    Toast.makeText(MainActivity.this, coursemap.get(rb.getText()), Toast.LENGTH_SHORT).show();
                }
            }

        });

    }
}
