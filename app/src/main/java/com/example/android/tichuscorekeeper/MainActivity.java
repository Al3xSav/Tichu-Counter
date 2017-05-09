package com.example.android.tichuscorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String STATE_SCORETEAMA = "stateOfScoreTeamA";
    private static final String STATE_SCORETEAMB = "stateOfScoreTeamB";

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    int tichu = 100;
    int grandTichu = 200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt(STATE_SCORETEAMA, scoreTeamA);
        savedInstanceState.putInt(STATE_SCORETEAMB, scoreTeamB);

        super.onSaveInstanceState(savedInstanceState);
    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        /* Scores */
        scoreTeamA = savedInstanceState.getInt(STATE_SCORETEAMA);
        scoreTeamB = savedInstanceState.getInt(STATE_SCORETEAMB);

        /* Display values after restoring */
        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);
    }

    /**
     * Displays the given fouls for Team A.
     */
    public void displayScoreTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given fouls for Team A.
     */
    public void displayScoreTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team A.
     */
    public void addPointsTeamA(View v) {
        final EditText myInput = (EditText) findViewById(R.id.editTextA);
        String myInputSymbol = myInput.getText().toString();

        if (myInput.getText().length() > 0 && Integer.parseInt(myInput.getText().toString()) <= 200) {
            if (myInputSymbol.substring(0, 1) == "-") {
                scoreTeamA = scoreTeamA - Integer.parseInt(myInput.getText().toString());
                displayScoreTeamA(scoreTeamA);
            } else {
                scoreTeamA = scoreTeamA + Integer.parseInt(myInput.getText().toString());
                displayScoreTeamA(scoreTeamA);

            }
            myInput.getText().clear();
        }
    }

    /**
     * Get Tichu or Grand Tichu score for Team B.
     */
    public void extraTeamB(View v){

        if (v.getId()== R.id.addTichuTeamB) {
            scoreTeamB = scoreTeamB + tichu;
        } else if(v.getId() == R.id.reduceTichuTeamB) {
            scoreTeamB = scoreTeamB - tichu;
        } else if(v.getId() == R.id.addGrandTeamB) {
            scoreTeamB = scoreTeamB + grandTichu;
        } else if(v.getId() == R.id.reduceGrandTeamB) {
            scoreTeamB = scoreTeamB - grandTichu;
        }
        displayScoreTeamB(scoreTeamB);
    }

    /**
     * Get Tichu or Grand Tichu score for Team A.
     */
    public void extraTeamA(View v){

        if (v.getId()== R.id.addTichuTeamA) {
            scoreTeamA = scoreTeamA + tichu;
        } else if(v.getId() == R.id.reduceTichuTeamA) {
            scoreTeamA = scoreTeamA - tichu;
        } else if(v.getId() == R.id.addGrandTeamA) {
            scoreTeamA = scoreTeamA + grandTichu;
        } else if(v.getId() == R.id.reduceGrandTeamA) {
            scoreTeamA = scoreTeamA - grandTichu;
        }
        displayScoreTeamA(scoreTeamA);
    }

    /**
     * Increase or Decrease the score for Team B.
     */
    public void addPointsTeamB(View v) {
        final EditText myInput = (EditText) findViewById(R.id.editTextB);
        String myInputSymbol = myInput.getText().toString();
        if(myInput.getText().length() > 0 && Integer.parseInt(myInput.getText().toString()) <= 200 ) {
            if(myInputSymbol.substring(0,1) == "-") {
                scoreTeamB = scoreTeamB - Integer.parseInt(myInput.getText().toString());
                displayScoreTeamB(scoreTeamB);
            } else {
                scoreTeamB = scoreTeamB + Integer.parseInt(myInput.getText().toString());
                displayScoreTeamB(scoreTeamB);
            }
            myInput.getText().clear();
        }
    }

    /**
     * Reseting the scores of both team.
     */
    public void resetScores(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);
    }
}



