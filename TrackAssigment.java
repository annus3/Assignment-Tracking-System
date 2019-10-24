package com.example.assignmenttrackingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TrackAssigment extends AppCompatActivity {
    ListView l;
    String data[] = {"\nPEA305 - ANALYTICAL SKILLS-I\n"+"Status = Unchecked"+"\nMarks Uploaded = Not Yet\n",
            "\nMGN404 - LEADERSHIP\n"+"Status = Checked"+"\nMarks Uploaded = Not Yet\n",
            "\nCSE332 - INDUSTRY ETHICS AND LEGAL ISSUES\n"+"Status = Checked"+"\nMarks Uploaded = 25/30\n",
            "\nPEV107 - VERBAL ABILITY\n"+"Status = Unchecked"+"\nMarks Uploaded = Not Yet\n",
            "\nCSE224 - FUNDAMENTALS OF ANDROID\n"+"Status = Checked"+"\nMarks Uploaded = 26/30\n",
            "\nCSE322- AUTOMATION AND THEORY\n"+"Status = Checked"+"\nMarks Uploaded = Not Yet\n"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track_assigment);

        l = (ListView)findViewById(R.id.listView3);

        ArrayAdapter<String> obj = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,data);
        l.setAdapter(obj);
    }
}
