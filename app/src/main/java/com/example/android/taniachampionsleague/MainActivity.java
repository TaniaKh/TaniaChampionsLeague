package com.example.android.taniachampionsleague;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.taniachampionsleague.R;

public class MainActivity extends AppCompatActivity {
    int scoreRealMadrid = 0;
    int scoreFCBarcelona = 0;
    int foulsRealMadrid = 0;
    int foulsFCBarcelona = 0;
    int ballContactsRealMadrid = 0;
    int ballContactsFCBarcelona = 0;

    /**
     * Increase the score for Real Madrid by 1 point.
     */
    public void addOneForRealMadrid(View v) {
        scoreRealMadrid = scoreRealMadrid+1;
        displayForRealMadrid(scoreRealMadrid);
    }

    /**
     * Increase the score for FC Barcelona by 1 point.
     */
    public void addOneForFCBarcelona(View v) {
        scoreFCBarcelona = scoreFCBarcelona+1;
        displayForFCBarcelona(scoreFCBarcelona);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForRealMadrid(0);

    }
    /**
     * Displays the given score for Real Madrid
     */
    public void displayForRealMadrid(int scoreRealMadrid) {
        TextView scoreView = (TextView) findViewById(R.id.realMadrid_score);
        scoreView.setText(String.valueOf(scoreRealMadrid));
    }

    /**
     * Displays the given score for FC Barcelona
     */
    public void displayForFCBarcelona(int scoreFCBarcelona) {
        TextView scoreView = (TextView) findViewById(R.id.fcBarcelona_score);
        scoreView.setText(String.valueOf(scoreFCBarcelona));
    }


    /**
     * This method is called when the foul Real Madrid button is clicked.
     */
    public void addFoulRealMadrid(View view) {
        String message = "";
        foulsRealMadrid = foulsRealMadrid + 1;
        message = "Fouls " + foulsRealMadrid;
        TextView OrderSummaryTextView = (TextView) findViewById(R.id.foulsRealMadrid);
        OrderSummaryTextView.setText(message);
            }


    /**
     * This method is called when the foul FC Barcelona button is clicked.
     */
    public void addFoulFCBarcelona(View view) {
        String message = "";
        foulsFCBarcelona = foulsFCBarcelona + 1;
        message = "Fouls " + foulsFCBarcelona;
        TextView OrderSummaryTextView = (TextView) findViewById(R.id.foulsFCBarcelona);
        OrderSummaryTextView.setText(message);
    }

    /**
     * This method is called when the ball contacts FC Barcelona button is clicked.
     */
    public void ballContactsFCBarcelona(View view) {
        String message = "";
        ballContactsFCBarcelona = ballContactsFCBarcelona + 1;
        message = "BallContacts " + ballContactsFCBarcelona;
        TextView OrderSummaryTextView = (TextView) findViewById(R.id.ballContactsFCBarcelona);
        OrderSummaryTextView.setText(message);
    }
    /**
     * This method is called when the ball contacts Real Madrid button is clicked.
     */
    public void ballContactsRealMadrid(View view) {
        String message = "";
        ballContactsRealMadrid = ballContactsRealMadrid + 1;
        message = "BallContacts " + ballContactsRealMadrid;
        TextView OrderSummaryTextView = (TextView) findViewById(R.id.ballContactsRealMadrid);
        OrderSummaryTextView.setText(message);
    }

    /**
     * This method displays the message on the screen.
     */
    private void displayMessage(String message) {
        TextView OrderSummaryTextView = (TextView) findViewById(R.id.ballContactsRealMadrid);
        OrderSummaryTextView.setText(message);
    }




    }


