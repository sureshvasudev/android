package com.example.sureshvasudev.controller;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sureshvasudev.model.Question;

public class QuizActivity extends AppCompatActivity implements View.OnClickListener {

    private Question [] questions = null;
    private int questionIndex = 0;
    private TextView tvQuestion = null;
    private Button btnTrue = null;
    private Button btnFalse = null;
    private Button btnNext = null;
    private Button btnPrev = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        prepareQuestions();
        setContentView(R.layout.activity_quiz);
        tvQuestion = (TextView) findViewById(R.id.question_label);
        btnTrue = (Button) findViewById(R.id.true_label);
        btnTrue.setOnClickListener(this);
        btnFalse = (Button) findViewById(R.id.false_label);
        btnFalse.setOnClickListener(this);
        btnNext = (Button) findViewById(R.id.next_label);
        btnNext.setOnClickListener(this);
        btnPrev = (Button) findViewById(R.id.prev_label);
        btnPrev.setOnClickListener(this);
        setQuizQuestion();
    }



    private void showAnswerStatus(boolean answer) {
        String msg = null;
        int qi = questionIndex;
        System.out.print("Before:" + qi + " , After:");
        if (qi == 0) {
            qi=3;
        } else {
            qi--;
        }
        System.out.println(qi + " ,");
        Question question = questions[qi];
        System.out.println(qi + ": " + question.isAnswer() + ", Yours:" + answer);
        if (answer == question.isAnswer()) {
            msg = "Great, Your answer is CORRECT!!!";
        } else {
            msg = "Sorry, Your answer is WRONG!!!";
        }
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }


    private void setQuizQuestion() {
        System.out.println(questionIndex);
        switch (questionIndex) {
            case 0:
                questionIndex++;
                tvQuestion.setText(R.string.q1);
                break;
            case 1:
                questionIndex++;
                tvQuestion.setText(R.string.q2);
                break;
            case 2:
                questionIndex++;
                tvQuestion.setText(R.string.q3);
                break;
            case 3:
                questionIndex++;
                tvQuestion.setText(R.string.q4);
                break;
            case 4:
                questionIndex = 0;
                tvQuestion.setText(R.string.q5);
                break;
        }


    }


    private void prepareQuestions() {
        questions = new Question[5];
        questions[0] =  new Question(R.string.q1, true);
        questions[1] = new Question(R.string.q2, false);
        questions[2] = new Question(R.string.q3, true);
        questions[3] = new Question(R.string.q4, true);
        questions[4] = new Question(R.string.q5, true);
   }

    @Override
    public void onClick(View view) {
        int id =  view.getId();
        switch (id) {
            case R.id.true_label:
                showAnswerStatus(true);
                break;
            case R.id.false_label:
                showAnswerStatus(false);
                break;
            case R.id.next_label:
                setQuizQuestion();
                break;
            case R.id.prev_label:
                System.out.print("Before : " + questionIndex);
                questionIndex -= 2;
                System.out.print(", After Decrement : " + questionIndex);
                if (questionIndex < 0) questionIndex = 4;
                System.out.println(", Final : " + questionIndex);
                setQuizQuestion();

        }

    }
}


