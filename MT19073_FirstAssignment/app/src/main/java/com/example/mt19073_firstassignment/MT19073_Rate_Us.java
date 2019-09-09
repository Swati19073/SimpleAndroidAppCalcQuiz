package com.example.mt19073_firstassignment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MT19073_Rate_Us extends AppCompatActivity {
    private Button submit;
    private RatingBar ratingBar;
    private TextView tv;
    String string;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mt19073__rate__us);

    submit=(Button)findViewById(R.id.submit_button);
        ratingBar=(RatingBar)findViewById(R.id.rating_bar);
        tv=(TextView)findViewById(R.id.text_view_rate_us);


        submit.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            tv.setText("Dear User");
            string=tv.getText().toString();
            String rating= String.valueOf(ratingBar.getRating());
            // initiate a rating bar
            ratingBar.setNumStars(5);
            Toast.makeText(getApplicationContext(), string+" Thanks for rating :) " +rating, Toast.LENGTH_LONG).show();
            }
    });
        if(savedInstanceState!=null)
        {
            string=savedInstanceState.getString("key");
            tv.setText(String.valueOf(string));
        }
    }

    @Override
    public void onSaveInstanceState(@Nullable Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putString("key", string);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }
}
