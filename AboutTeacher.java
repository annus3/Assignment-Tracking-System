package com.example.assignmenttrackingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AboutTeacher extends AppCompatActivity {

    ListView l;


    String Data[] = {"PEA305 - ANALYTICAL SKILLS-I"+"\n"+"\nFaculty Name = Jaskiran Kaur"+"\nFaculty Seating = 33-209-CH12"+"\nLast Attendent = 10/5/2019"+"\n",
            "MGN904 - LEADERSHIP DEVELOPMENT"+"\n"+"\nFaculty Name = Nitin Kumar"+"\nFaculty Seating = 38-509-CH13"+"\nLast Attendent = 10/9/2019"+"\n",
            "CSE332 - INDUSTRY ETHICS AND LEGAL ISSUES"+"\n"+"\nFaculty Name = Aarthi"+"\nFaculty Seating = 34-209-CH15"+"\nLast Attendent = 10/8/2019"+"\n",
            "PEV107 - VERBAL ABILITY"+"\n"+"\nFaculty Name = Shweta Kaul"+"\nFaculty Seating = 38-509-CH26"+"\nLast Attendent = 10/10/2019"+"\n",
            "CSE324 - MULTIMEDIA SYSTEMS"+"\n"+"\nFaculty Name = Pradeep Kumar"+"\nFaculty Seating = 34-203-CH5"+"\nLast Attendent = 10/9/2019"+"\n",
            "CSE323 - MULTIMEDIA SYSTEMS LABORATORY"+"\n"+"\nFaculty Name = Pradeep Kumar"+"\nFaculty Seating = 34-203-CH5"+"\nLast Attendent = 10/9/2019"+"\n",
            "INT211 - HUMAN COMPUTER INTERACTION"+"\n"+"\nFaculty Name = Dr. Baljit Singh Saini"+"\nFaculty Seating = 33-205-CH10"+"\nLast Attendent = 10/9/2019"+"\n",
            "INT212 - USER INTERFACE DESIGN LABORATORY"+"\n"+"\nFaculty Name = Dr. Baljit Singh Saini"+"\nFaculty Seating = 33-205-CH10"+"\nLast Attendent = 10/1/2019"+"\n",
            "INT310 - SAP ABAP WORKBENCH FUNDAMENTALS"+"\n"+"\nFaculty Name = Jaspreet Kaur"+"\nFaculty Seating = 34-202-CH21"+"\nLast Attendent = 10/11/2019"+"\n"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_teacher);

        l = (ListView)findViewById(R.id.listView1);

        ArrayAdapter<String> obj = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,Data);
        l.setAdapter(obj);

    }
}
