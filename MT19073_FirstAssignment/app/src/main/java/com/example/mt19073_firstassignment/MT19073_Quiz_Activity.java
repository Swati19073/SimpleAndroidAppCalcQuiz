package com.example.mt19073_firstassignment;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MT19073_Quiz_Activity extends AppCompatActivity {
    Button ans1,ans2, ans3, ans4;
    MT19073_Questions ques1=new MT19073_Questions();
    private int score=0;
    private int quesLength=ques1.ques_main.length;
    Random random;
    private String final_ans;
    TextView tv_score, tv_quiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mt19073__quiz_);
        random=new Random();

        ans1=(Button)findViewById(R.id.button1_quiz);
        ans2=(Button)findViewById(R.id.button2_quiz);
        ans3=(Button)findViewById(R.id.button3_quiz);
        ans4=(Button)findViewById(R.id.button4_quiz);
        tv_score=(TextView)findViewById((R.id.text_view_for_score));
        tv_quiz=(TextView)findViewById(R.id.text_view_for_quiz);

        updateQuestion(random.nextInt(quesLength));

        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ans1.getText()==final_ans)
                {
                    score++;
                    tv_score.setText("Score: " + score);
                    updateQuestion(random.nextInt(quesLength));
                }
                else
                {
                    finish_game();
                }

            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ans2.getText()==final_ans)
                {
                    score++;
                    tv_score.setText("Score: " + score);
                    updateQuestion(random.nextInt(quesLength));
                }
                else
                {
                    finish_game();
                }
            }
        });
        ans3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ans3.getText()==final_ans)
                {
                    score++;
                    tv_score.setText("Score: " + score);
                    updateQuestion(random.nextInt(quesLength));
                }
                else
                {
                    finish_game();
                }
            }
        });
        ans4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ans4.getText()==final_ans)
                {
                    score++;
                    tv_score.setText("Score: " + score);
                    updateQuestion(random.nextInt(quesLength));
                }
                else
                {
                    finish_game();
                }
            }
        });
    }
    private  void updateQuestion(int num)
    {
        tv_quiz.setText(ques1.getQues(num));
        ans1.setText(ques1.getOption1(num));
        ans2.setText(ques1.getOption2(num));
        ans3.setText(ques1.getOption3(num));
        ans4.setText(ques1.getOption4(num));

        final_ans=ques1.getCorrectAns(num);
    }

    private void finish_game()
    {
        AlertDialog.Builder alertDialogBuilder=new AlertDialog.Builder(MT19073_Quiz_Activity.this);
        alertDialogBuilder
                .setMessage("Game over!! Your score is: " + score)
                .setCancelable(false)
                .setPositiveButton("NEW GAME",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                startActivity(new Intent(getApplicationContext(),MT19073_Quiz_Activity.class));
                            finish();
                            }
                        })
                .setNegativeButton("EXIT",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                            }
                        });
        AlertDialog alertDialog=alertDialogBuilder.create();
        alertDialog.show();
    }
}
