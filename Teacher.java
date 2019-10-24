package com.example.assignmenttrackingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Teacher extends AppCompatActivity {

    ProgressDialog pd;
    ListView l;
    String data[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);

        l = (ListView)findViewById(R.id.listView);
        data = getResources().getStringArray(R.array.list);

        ArrayAdapter<String> obj = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,data);
        l.setAdapter(obj);

        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                /*String item = data[position];
                Toast.....+item
                 */
                if(position == 0)
                {
                    Intent i = new Intent(Teacher.this,AboutTeacher.class);
                    startActivity(i);
                    pd = new ProgressDialog(Teacher.this);
                    //pd.setTitle("");
                    //pd.setMessage("");
                    pd.setCanceledOnTouchOutside(true);
                    pd.show();
                }
                if(position == 1)
                {
                    Intent i = new Intent(Teacher.this,AssignmentDeadline.class);
                    startActivity(i);
                    pd = new ProgressDialog(Teacher.this);
                    //pd.setTitle("");
                    //pd.setMessage("");
                    pd.setCanceledOnTouchOutside(true);
                    pd.show();

                }
                if(position == 2)
                {
                    Intent i = new Intent(Teacher.this,Subjects.class);
                    startActivity(i);
                    pd = new ProgressDialog(Teacher.this);
                    //pd.setTitle("");
                    //pd.setMessage("");
                    pd.setCanceledOnTouchOutside(true);
                    pd.show();

                }

                if(position == 3)
                {
                    Toast.makeText(Teacher.this, "Redirecting To Browser", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                    startActivity(i);
                    pd = new ProgressDialog(Teacher.this);
                    //pd.setTitle("");
                    //pd.setMessage("");
                    pd.setCanceledOnTouchOutside(true);
                    pd.show();
                }

                if(position == 4)
                {

                    Intent i = new Intent(Teacher.this,TrackAssigment.class);
                    startActivity(i);
                    pd = new ProgressDialog(Teacher.this);
                    //pd.setTitle("");
                    //pd.setMessage("");
                    pd.setCanceledOnTouchOutside(true);
                    pd.show();
                }
                if(position == 5)
                {

                    Toast.makeText(Teacher.this, "No Assignments Are Available", Toast.LENGTH_LONG).show();

                }
                if(position == 6)
                {

                    Intent i = new Intent(Teacher.this,Feedback.class);
                    startActivity(i);
                    pd = new ProgressDialog(Teacher.this);
                    //pd.setTitle("");
                    //pd.setMessage("");
                    pd.setCanceledOnTouchOutside(true);
                    pd.show();
                }


            }
        });

    }
}
