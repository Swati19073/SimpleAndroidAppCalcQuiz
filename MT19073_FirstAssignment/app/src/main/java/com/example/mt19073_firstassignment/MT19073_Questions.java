package com.example.mt19073_firstassignment;

public class MT19073_Questions {

    public String ques_main[]={
      "Velocity of wind is measured by ?",
            " Which of the following is the first calculating device?",
            "IC chips used in computers are usually made of?",
            "Which supercomputer is developed by the Indian Scientists?",
            "Find out the odd one?"
    };

    public String options_main[][]={
            {"speedometer","tachometer","anemometer","audiometer"},
            {" Abacus","Calculator","Turing Machine","Pascaline"},
            {"Lead","Silicon", "Gold","Chromium"},
            {"Param","Super 301","CRAY YMP","Compaq Presario"},
            {"Linux","Unix","Windows","Internet"}
    };
    private String correct_ans_main[]={"anemometer","Abacus","Silicon","Param","Internet"};

    public String getQues(int a)
    {
        String questions=ques_main[a];
        return questions;
    }
    public String getOption1(int a)
    {
        String op=options_main[a][0];
        return op;
    }
    public String getOption2(int a)
    {
        String op=options_main[a][1];
        return op;
    }
    public String getOption3(int a)
    {
        String op=options_main[a][2];
        return op;
    }
    public String getOption4(int a)
    {
        String op=options_main[a][3];
        return op;
    }

    public String getCorrectAns(int a)
    {
        String corr=correct_ans_main[a];
        return corr;
    }

}
