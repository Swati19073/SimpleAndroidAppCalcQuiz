package com.example.mt19073_firstassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MT19073_MainActivity extends AppCompatActivity {

    Button button_calculate, button_notes, button_rate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt19073_activity_main);

        button_calculate=(Button)findViewById(R.id.calculator);
        button_notes=(Button)findViewById(R.id.quiz);
        button_rate=(Button)findViewById(R.id.rate_us);

        button_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1= new Intent(MT19073_MainActivity.this,MT19073_Calculator_Activity.class);
                startActivity(intent1);
            }
        });

        button_notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2= new Intent(MT19073_MainActivity.this, MT19073_Quiz_Activity.class);
                startActivity(intent2);
            }
        });

        button_rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3= new Intent(MT19073_MainActivity.this, MT19073_Rate_Us.class);
                startActivity(intent3);
            }
        });
    }
}
