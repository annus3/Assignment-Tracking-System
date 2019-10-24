package com.example.assignmenttrackingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AssignmentDeadline extends AppCompatActivity {

    ListView l ;
    String Data[] = {"CSE211 - HUMAN CMPUTER INTERACTION"+"\n"+"\n"+"Assignment = Computer Modules "+"\n"+"Last Date Of Submission = 10-16-2019"+"\n",
            "MGN404 - LEADERSHIP"+"\n"+"\n"+"Assignment = Survey Based "+"\n"+"Last Date Of Submission = 10-19-2019"+"\n",
            "CSE 322 - INDUSTRY ETHICS AND LEGAL ISSUES"+"\n"+"\n"+"Assignment = Top 10 Startup's In India "+"\n"+"Last Date Of Submission = 10-13-2019"+"\n",
            "INT 310 - SAP ABAP WORKBENCH FUNDAMENTALS"+"\n"+"\n"+"Assignment = Formal Languages "+"\n"+"Last Date Of Submission = 10-23-2019"+"\n"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment_deadline);


        l = (ListView)findViewById(R.id.listView2);

        ArrayAdapter<String> obj = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,Data);
        l.setAdapter(obj);
    }
}
