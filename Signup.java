package com.example.assignmenttrackingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class Signup extends AppCompatActivity {

    EditText e1,e2,e3,e4,e5,e6;
    Button btn;
    String pass12,em;
    ProgressDialog pd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        e1 = (EditText)findViewById(R.id.edit3);
        e2 = (EditText)findViewById(R.id.edit4);
        e3 = (EditText)findViewById(R.id.editText);
        e4 = (EditText)findViewById(R.id.edit6);
        e5 = (EditText)findViewById(R.id.edit8);
        e6 = (EditText)findViewById(R.id.edit9);

        btn = (Button)findViewById(R.id.submit);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = e1.getText().toString();
                String email = e2.getText().toString();
                String reg = e3.getText().toString();
                String phone = e4.getText().toString();
                String pass1 = e5.getText().toString();
                String pass2 = e6.getText().toString();

                if(name.isEmpty())
                {
                    e1.setError("Field Missing");
                }
                if(email.isEmpty())
                {
                    e2.setError("Field Missing");
                }
                if(reg.isEmpty())
                {
                    e3.setError("Field Missing");
                }
                if(phone.isEmpty())
                {
                    e4.setError("Field Missing");
                }
                if(pass1.isEmpty())
                {
                    e5.setError("Field Missing");
                }
                if(pass2.isEmpty())
                {
                    e6.setError("Field Missing");
                }

                if(reg.length()<8 || reg.length()>8)
                {
                    e3.setError("Registration Number Length must contain 8 characters");
                }

                if(pass1.length()<7 && pass2.length()<7)
                {
                    e5.setError("Password Length must contain 8 characters");
                    e6.setError("Password Length must contain 8 characters");
                }

                if(!name.isEmpty() && !email.isEmpty() && !reg.isEmpty() && !phone.isEmpty() && !pass1.isEmpty() && !pass2.isEmpty() && reg.length()==8 && pass1.length()>7)
                {
                    if(!pass1.equals(pass2))
                    {
                        Toast.makeText(Signup.this, "Password Didn't Match\nRe-Enter Password", Toast.LENGTH_SHORT).show();
                        e5.setText("");
                        e6.setText("");
                    }

                    else {

                        Toast.makeText(Signup.this, "Submitted Successfully", Toast.LENGTH_SHORT).show();

                        em = e3.getText().toString();
                        pass12 = e5.getText().toString();

                        e1.setText("");
                        e2.setText("");
                        e3.setText("");
                        e4.setText("");
                        e5.setText("");
                        e6.setText("");

                        Intent i = new Intent(Signup.this,MainActivity.class);
                        i.putExtra("reg",em);
                        i.putExtra("pass",pass12);
                        startActivity(i);

                        pd = new ProgressDialog(Signup.this);
                        pd.setTitle("Submitting");
                        pd.setMessage("Loading...");
                        pd.setCanceledOnTouchOutside(true);
                        pd.show();

                    }
                }



            }
        });
    }
}
