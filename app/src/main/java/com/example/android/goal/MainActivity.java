package com.example.android.goal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int score = 0;
    int red = 0;
    int yellow = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Button for score counting for team A.
     */
    public void goalA(View view) {
        score = score + 1;
        displayForTeamA(score);
    }
    /**
     * Button for score counting for team B.
     */
    public void goalB(View view) {
        score = score + 1;
        displayForTeamB(score);
    }

    /**
     * Button for red card counting for team A.
     */
    public void redA(View view) {
        red = red + 1;
        displayForTeamARed(red);
    }
    /**
     * Button for red card counting for team B.
     */
    public void redB(View view) {
        red = red + 1;
        displayForTeamBRed(red);
    }

    /**
     * Button for yellow card counting for team A.
     */
    public void yellowA(View view) {
        yellow = yellow + 1;
        displayForTeamAYellow(yellow);
    }
    /**
     * Button for yellow card counting for team B.
     */
    public void yellowB(View view) {
        yellow = yellow + 1;
        displayForTeamBYellow(yellow);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_a_text);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_b_text);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given red cards for Team A.
     */
    public void displayForTeamARed(int red) {
        TextView scoreView = (TextView) findViewById(R.id.red_a_card);
        scoreView.setText(String.valueOf(red));
    }
    /**
     * Displays the given red cards for Team B.
     */
    public void displayForTeamBRed(int red) {
        TextView scoreView = (TextView) findViewById(R.id.red_b_card);
        scoreView.setText(String.valueOf(red));
    }

    /**
     * Displays the given yellow cards for Team A.
     */
    public void displayForTeamAYellow(int yellow) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_a_card);
        scoreView.setText(String.valueOf(yellow));
    }
    /**
     * Displays the given yellow cards for Team B.
     */
    public void displayForTeamBYellow(int yellow) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_b_card);
        scoreView.setText(String.valueOf(yellow));
    }
    /**
     * Button for resets all points
     */
    public void reset(View view) {
        score = 0;
        red = 0;
        yellow = 0;
        displayForTeamA(score);
        displayForTeamARed(red);
        displayForTeamAYellow(yellow);
        displayForTeamB(score);
        displayForTeamBRed(red);
        displayForTeamBYellow(yellow);
    }
}
