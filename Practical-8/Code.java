package com.example.courselist8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.app.LauncherActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

import java.util.HashMap;

public class MainActivity<CourseAdapter> extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private HashMap<String, String> coursemap;
    private ListView lvCourse;
    private String [] Courses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Inserting Values in HashMap
        lvCourse = findViewById(R.id.LVCourse);
        insertValuesInCourseMap();

//        Inserting Values in String Courses
        Courses = new String[coursemap.size()];
        fillCourses();

//        New Array Adapter of type string
        ArrayAdapter<String> CourseAdapter = new ArrayAdapter<>(this, R.layout.list_of_courses, Courses);
        lvCourse.setAdapter(CourseAdapter);

//        Onitemclicklistener
        lvCourse.setOnItemClickListener(this);
    }

    private void insertValuesInCourseMap() {
        coursemap = new HashMap<>();

        coursemap.put("B.Sc(Hons) Computer Science", "Dr. V.S Dixit");
        coursemap.put("B.Sc(Hons) Mathematics", "Dr. Raj Kumar Bhagat");
        coursemap.put("B.A(Hons) Economics", "Dr. V.S Dixit");
        coursemap.put("B.Com(Hons)", "Dr. Manika Jain");
    }

    private void fillCourses(){
        int i = 0;
        for(String crs:coursemap.keySet()){
            Courses[i] = crs;
            i++;
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String CourseSelected = Courses[position];
        String TeacherInCharge = coursemap.get(CourseSelected);
        Snackbar.make(lvCourse,"Course: " + CourseSelected + "\nTeacher In-Charge: " +  TeacherInCharge, Snackbar.LENGTH_SHORT).show();
    }
}
