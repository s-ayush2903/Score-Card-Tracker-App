package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.android.courtcounter.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {
    int points = 0;
    int marks = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This comes into action when 3points button is called
     */
    public void add1(View view) {
        points = points + 1;
        displayForTeamA(points);
    }
    {}
    /**
     * This comes into action when 3points button is called
     */
    public void add2(View view) {
        points = points + 2;
        displayForTeamA(points);
    }

    /**
     * This comes into action when 3points button is called
     */
    public void add3(View view) {
        points = points + 3;
        displayForTeamA(points);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }/**
     * This comes into action when 3points button is called
     */
    public void plus1(View view) {
        marks = marks + 1;
        displayForTeamB(marks);
    }
    {}
    /**
     * This comes into action when 3points button is called
     */
    public void plus2(View view) {
        marks = marks + 2;
        displayForTeamB(marks);
    }

    /**
     * This comes into action when 3points button is called
     */
    public void plus3(View view) {
        marks = marks + 3;
        displayForTeamB(marks);
    }

    /**
     * This comes into action when Reset button is called
     */
    public void setZero(View view) {
        marks = 0;
        displayForTeamB(marks);
        points = 0;
        displayForTeamA(points);
    }

}