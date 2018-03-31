package com.example.android.horseballtracker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.android.horseballtracker.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        displayForPlayer1(4);
    }

    int scorePlayer1 = 0;
    int scorePlayer2 = 0;

    /**
     * Displays the given score for Player 1.
     */
    public void displayForPlayer1(int score) {
        TextView scoreView = findViewById(R.id.player_1_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the Swish button is clicked for Player 1.
     */
    public void player1Swish(View view) {
        scorePlayer1 = scorePlayer1 + 1;
        displayForPlayer1(scorePlayer1);
    }

    /**
     * This method is called when the Missed is clicked for Player 1.
     */
    public void player1Brick(View view) {
        scorePlayer1 = scorePlayer1 + 0;
        displayForPlayer1(scorePlayer1);
    }

    /**
     * Displays the given score for Player 2.
     */
    public void displayForPlayer2(int score) {
        TextView scoreView = findViewById(R.id.player_2_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the Swish button is clicked for Player 2.
     */
    public void player2Swish(View view) {
        scorePlayer2 = scorePlayer2 + 1;
        displayForPlayer2(scorePlayer2);
    }

    /**
     * This method is called when the Missed button is clicked for Player 2.
     */
    public void player2Brick(View view) {
        scorePlayer2 = scorePlayer2 + 0;
        displayForPlayer2(scorePlayer2);
    }

    /**
     * This method is called when the Reset button is clicked.
     */
    public void reset(View view) {
        scorePlayer1 = 0;
        displayForPlayer1(scorePlayer1);
        scorePlayer2 = 0;
        displayForPlayer2(scorePlayer2);
    }
}
