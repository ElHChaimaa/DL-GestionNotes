package com.example.notes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    
    
    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7;
    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.stname);
        ed2 = findViewById(R.id.module1);
        ed3 = findViewById(R.id.module2);
        ed4 = findViewById(R.id.module3);
        ed5 = findViewById(R.id.module4);
        ed6 = findViewById(R.id.total);
        ed7 = findViewById(R.id.avg);

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                markCal();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
            }
        });
    }
    public void markCal(){
        double m1,m2,m3,m4,tot;
        double avg;
        m1=Double.parseDouble(ed2.getText().toString());
        m2=Double.parseDouble(ed3.getText().toString());
        m3=Double.parseDouble(ed4.getText().toString());
        m4=Double.parseDouble(ed5.getText().toString());

        tot= m1 + m2 + m3 + m4;
        ed6.setText(String.valueOf(tot));

        avg = tot/4;
        ed7.setText(String.valueOf(avg));
    }

    public void clear(){

        ed1.setText("");
        ed2.setText("");
        ed3.setText("");
        ed4.setText("");
        ed5.setText("");
        ed6.setText("");
        ed7.setText("");
        ed1.requestFocus();

    }
}