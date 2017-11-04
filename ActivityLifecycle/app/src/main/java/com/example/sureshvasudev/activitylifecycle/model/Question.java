package com.example.sureshvasudev.activitylifecycle.model;

/**
 * Created by suresh.vasudev on 04-11-2017.
 */

public class Question {

    private int questionId;
    private boolean answer;

    public Question(int questionId, boolean answer) {
        this.questionId = questionId;
        this.answer = answer;
    }

    public int getQuestionId() {
        return questionId;
    }

    public boolean isAnswer() {
        return answer;
    }


}
