package com.example.assignmenttrackingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    Button btn1,btn2;
    EditText e1,e2;
    String em1,passw;
    ProgressDialog pd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText)findViewById(R.id.edit1);
        e2 = (EditText)findViewById(R.id.edit2);


        btn1 = (Button)findViewById(R.id.button1);
        btn2 = (Button)findViewById(R.id.button2);


        em1 = getIntent().getStringExtra("reg");
        passw = getIntent().getStringExtra("pass");


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String name = e1.getText().toString();
               String password = e2.getText().toString();

               if(name.isEmpty())
               {
                   e1.setError("Field is Missing");
               }

               if (password.isEmpty() )
               {
                   e2.setError("Field is missing");
               }

               if(!name.isEmpty()&&!password.isEmpty()) {

                   if(name.equals(em1) && password.equals(passw))
                   {

                       Intent i = new Intent(MainActivity.this, Teacher.class);
                       startActivity(i);
                       pd = new ProgressDialog(MainActivity.this);
                       pd.setTitle("Verifiying");
                       pd.setMessage("Loading...");
                       pd.setCanceledOnTouchOutside(true);
                       pd.show();

                   }
                   else if(name.equals(em1)&&!password.equals(passw))
                   {
                       Toast.makeText(MainActivity.this, "Incorrect  Password ", Toast.LENGTH_LONG).show();
                       e2.setText("");
                   }
                    if(!name.equals(em1)&&password.equals(passw))
                   {
                       Toast.makeText(MainActivity.this, "Incorrect Registration or Password", Toast.LENGTH_LONG).show();
                       e1.setText("");
                       e2.setText("");
                   }
                    if(!name.equals(em1)&&!password.equals(passw))
                   {
                       Toast.makeText(MainActivity.this, "User Not Found\n"+"Register Yourself", Toast.LENGTH_LONG).show();
                       //Toast.makeText(MainActivity.this, "Register Yourself", Toast.LENGTH_SHORT).show();
                       e1.setText("");
                       e2.setText("");
                   }

               }




            }

        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Signup.class);
                startActivity(i);
                pd = new ProgressDialog(MainActivity.this);
                pd.setTitle("Signup");
                pd.setMessage("Loading...");
                pd.setCanceledOnTouchOutside(true);
                pd.show();
            }
        });


    }
}
