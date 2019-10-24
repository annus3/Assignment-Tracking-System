package com.example.assignmenttrackingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Feedback extends AppCompatActivity {

    EditText e1;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        e1 = (EditText)findViewById(R.id.edit7);
        btn = (Button)findViewById(R.id.button7);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = e1.getText().toString();
                if(text.isEmpty())
                {
                    e1.setError("Field Missing");
                }
                else
                {
                    Toast.makeText(Feedback.this, "Feedback Sucessfully Saved", Toast.LENGTH_SHORT).show();
                }
                e1.setText("");
            }
        });

    }
}
