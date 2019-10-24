package com.example.assignmenttrackingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Subjects extends AppCompatActivity {

    ListView l;


    String Data[] = {"\nPEA305 - ANALYTICAL SKILLS-I\n","\nMGN904 - LEADERSHIP DEVELOPMENT\n","\nCSE332 - INDUSTRY ETHICS AND LEGAL ISSUES\n",
            "\nPEV107 - VERBAL ABILITY\n","\nCSE324 - MULTIMEDIA SYSTEMS\n","\nCSE323 - MULTIMEDIA SYSTEMS LABORATORY\n","\nINT211 - HUMAN COMPUTER INTERACTION\n","\nINT212 - USER INTERFACE DESIGN LABORATORY\n",
    "\nINT310 - SAP ABAP WORKBENCH FUNDAMENTALS\n"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);

        l = (ListView)findViewById(R.id.listView1);

        ArrayAdapter<String> obj = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,Data);
        l.setAdapter(obj);


    }
}
