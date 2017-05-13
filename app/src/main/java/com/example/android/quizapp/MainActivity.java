package com.example.android.quizapp;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static com.example.android.quizapp.R.id.radio1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswer (View view) {
        int score = 0;
        //first question
        EditText checkFirstQuestion = (EditText) findViewById(R.id.answer1);
        if (checkFirstQuestion.getText().toString().equals("Berlin")){
            score += 1;
        }
        //second question
        EditText checkSecondQuestion = (EditText) findViewById(R.id.answer2);
        if (checkSecondQuestion.getText().toString().equals("6")){
            score += 1;
        }
        RadioButton checkThirdQuestion = (RadioButton) findViewById(R.id.answer3_1);
        boolean checked3_1 = checkThirdQuestion.isChecked();
        if (checked3_1) {
            score += 1;
        }
        CheckBox checkFourthQuestion_1 = (CheckBox) findViewById(R.id.checkbox1);
        CheckBox checkFourthQuestion_2 = (CheckBox) findViewById(R.id.checkbox2);
        CheckBox checkFourthQuestion_3 = (CheckBox) findViewById(R.id.checkbox3);
        CheckBox checkFourthQuestion_4 = (CheckBox) findViewById(R.id.checkbox4);
        boolean checked4_1 = checkFourthQuestion_1.isChecked();
        boolean checked4_2 = checkFourthQuestion_2.isChecked();
        boolean checked4_3 = checkFourthQuestion_3.isChecked();
        boolean checked4_4 = checkFourthQuestion_4.isChecked();
        if (checked4_1 && checked4_2 && checked4_3 && !checked4_4){
            score += 1;
        }
        RadioButton checkFifthQuestion = (RadioButton) findViewById(radio1);
        boolean checked5_1 = checkFifthQuestion.isChecked();
        if (checked5_1) {
            score += 1;
        }

        Context context = getApplicationContext();
        CharSequence textSuccess = "You scored " + score + "/5 points!";
        CharSequence textFailure = "You scored " + score + "/5 points, please try harder!";
        int duration = Toast.LENGTH_LONG;

        if (score == 0) {
            Toast toast = Toast.makeText(context, textFailure, duration);
            toast.show();
        }

        else {

        Toast toast = Toast.makeText(context, textSuccess, duration);
        toast.show();
        }
    }
}