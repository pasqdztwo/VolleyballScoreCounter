package com.example.android.volleyballscorecounter;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.volleyballscorecounter.R;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int setTeamA = 0;
    int setTeamB = 0;
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int spikesTeamA = 0;
    int spikesTeamB = 0;
    int blocksTeamA = 0;
    int blocksTeamB = 0;
    int servesTeamA = 0;
    int servesTeamB = 0;
    int oppErrorsTeamA = 0;
    int oppErrorsTeamB = 0;
    Date today = new Date();

    /**
     * code for Team A start here
     */

    public void addOpponentErrorPointForA(View view) {
        scoreTeamA++;
        oppErrorsTeamA++;
        displayForTeamA(scoreTeamA);
        displayOppErrorsForTeamA(oppErrorsTeamA);
    }

    public void decreaseOpponentErrorPointForA(View view) {
        scoreTeamA--;
        oppErrorsTeamA--;
        displayForTeamA(scoreTeamA);
        displayOppErrorsForTeamA(oppErrorsTeamA);
    }

    public void addSpikePointsForA(View view) {
        scoreTeamA++;
        spikesTeamA++;
        displayForTeamA(scoreTeamA);
        displaySpikesForTeamA(spikesTeamA);
    }

    public void decreaseSpikePointsForA(View view) {
        scoreTeamA--;
        spikesTeamA--;
        displayForTeamA(scoreTeamA);
        displaySpikesForTeamA(spikesTeamA);
    }

    public void addServingPointForA(View view) {
        scoreTeamA++;
        servesTeamA++;
        displayForTeamA(scoreTeamA);
        displayServesForTeamA(servesTeamA);
    }

    public void decreaseServingPointForA(View view) {
        scoreTeamA--;
        servesTeamA--;
        displayForTeamA(scoreTeamA);
        displayServesForTeamA(servesTeamA);
    }

    public void addBlockPointForA(View view) {
        scoreTeamA++;
        blocksTeamA++;
        displayForTeamA(scoreTeamA);
        displayBlocksForTeamA(blocksTeamA);
    }

    public void decreaseBlockPointForA(View view) {
        scoreTeamA--;
        blocksTeamA--;
        displayForTeamA(scoreTeamA);
        displayBlocksForTeamA(blocksTeamA);
    }

    public void addSetForA(View view) {
        setTeamA++;
        if (setTeamA <= 5) {
            displaySetForTeamA(setTeamA);
        } else {
            setTeamA = 5;
            displaySetForTeamA(setTeamA);
        }
    }

    public void decreaseSetForA(View view) {
        setTeamA--;
        displaySetForTeamA(setTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.teamA_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displaySetForTeamA(int score) {
        TextView scoreView = findViewById(R.id.teamA_sets);
        scoreView.setText(String.valueOf(score));
    }

    public void displaySpikesForTeamA(int score) {
        TextView scoreView = findViewById(R.id.teamA_spikes);
        scoreView.setText(String.valueOf(score));
    }

    public void displayBlocksForTeamA(int score) {
        TextView scoreView = findViewById(R.id.teamA_blocks);
        scoreView.setText(String.valueOf(score));
    }

    public void displayServesForTeamA(int score) {
        TextView scoreView = findViewById(R.id.teamA_serves);
        scoreView.setText(String.valueOf(score));
    }

    public void displayOppErrorsForTeamA(int score) {
        TextView scoreView = findViewById(R.id.teamA_op_errors);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * code for Team B start here
     */


    public void addOpponentErrorPointForB(View view) {
        scoreTeamB++;
        oppErrorsTeamB++;
        displayForTeamB(scoreTeamB);
        displayOppErrorsForTeamB(oppErrorsTeamB);
    }

    public void decreaseOpponentErrorPointForB(View view) {
        scoreTeamB--;
        oppErrorsTeamB--;
        displayForTeamB(scoreTeamB);
        displayOppErrorsForTeamB(oppErrorsTeamB);
    }

    public void addSpikePointForB(View view) {
        scoreTeamB++;
        spikesTeamB++;
        displayForTeamB(scoreTeamB);
        displaySpikesForTeamB(scoreTeamB);
    }

    public void decreaseSpikePointForB(View view) {
        scoreTeamB--;
        spikesTeamB--;
        displayForTeamB(scoreTeamB);
        displaySpikesForTeamB(scoreTeamB);
    }

    public void addServingPointForB(View view) {
        scoreTeamB++;
        servesTeamB++;
        displayForTeamB(scoreTeamB);
        displayServesForTeamB(servesTeamB);
    }

    public void decreaseServingPointForB(View view) {
        scoreTeamB--;
        servesTeamB--;
        displayForTeamB(scoreTeamB);
        displayServesForTeamB(servesTeamB);
    }

    public void addBlockPointForB(View view) {
        scoreTeamB++;
        blocksTeamB++;
        displayForTeamB(scoreTeamB);
        displayBlocksForTeamB(blocksTeamB);
    }

    public void decreaseBlockPointForB(View view) {
        scoreTeamB--;
        blocksTeamB--;
        displayForTeamB(scoreTeamB);
        displayBlocksForTeamB(blocksTeamB);
    }

    public void addSetForB(View view) {
        setTeamB++;
        if (setTeamB <= 5) {
            displaySetForTeamB(setTeamB);
        } else {
            setTeamB = 5;
            displaySetForTeamB(setTeamB);
        }
    }

    public void decreaseSetForB(View view) {
        setTeamB--;
        displaySetForTeamB(setTeamB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.teamB_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displaySetForTeamB(int score) {
        TextView scoreView = findViewById(R.id.teamB_sets);
        scoreView.setText(String.valueOf(score));
    }

    public void displaySpikesForTeamB(int score) {
        TextView scoreView = findViewById(R.id.teamB_spikes);
        scoreView.setText(String.valueOf(score));
    }

    public void displayBlocksForTeamB(int score) {
        TextView scoreView = findViewById(R.id.teamB_blocks);
        scoreView.setText(String.valueOf(score));
    }

    public void displayServesForTeamB(int score) {
        TextView scoreView = findViewById(R.id.teamB_serves);
        scoreView.setText(String.valueOf(score));
    }

    public void displayOppErrorsForTeamB(int score) {
        TextView scoreView = findViewById(R.id.teamB_op_errors);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * SEND current score to email
     */

    public void sendScore(View view) {

        //create score summary message
        String scoreSummaryMessage = today + " match scores";
        scoreSummaryMessage = scoreSummaryMessage + "\n\n\bTeam A: " + scoreTeamA;
        scoreSummaryMessage = scoreSummaryMessage + "\n\bTeam B: " + scoreTeamB;
        scoreSummaryMessage = scoreSummaryMessage + "\nTeam A sets so far: " + setTeamA;
        scoreSummaryMessage = scoreSummaryMessage + "\nTeam B sets so far: " + setTeamB;
        scoreSummaryMessage = scoreSummaryMessage + "\n\n\bTeam A detailed stats: ";
        scoreSummaryMessage = scoreSummaryMessage + "\n     Spike points: " + spikesTeamA;
        scoreSummaryMessage = scoreSummaryMessage + "\n     Block points: " + blocksTeamA;
        scoreSummaryMessage = scoreSummaryMessage + "\n     Serve points: " + servesTeamA;
        scoreSummaryMessage = scoreSummaryMessage + "\n     Opponent error points: " + oppErrorsTeamA;
        scoreSummaryMessage = scoreSummaryMessage + "\n\n\bTeam B detailed stats: ";
        scoreSummaryMessage = scoreSummaryMessage + "\n     Spike points: " + spikesTeamB;
        scoreSummaryMessage = scoreSummaryMessage + "\n     Block points: " + blocksTeamB;
        scoreSummaryMessage = scoreSummaryMessage + "\n     Serve points: " + servesTeamB;
        scoreSummaryMessage = scoreSummaryMessage + "\n     Opponent error points: " + oppErrorsTeamB;

        //send message to e-mail
        Intent sendIntent = new Intent(Intent.ACTION_SENDTO);
        sendIntent.setData(Uri.parse("mailto:"));
        sendIntent.putExtra(Intent.EXTRA_SUBJECT, "Volleyball match score: " + today + " | set no: (enter set number)");
        sendIntent.putExtra(Intent.EXTRA_TEXT, scoreSummaryMessage);
        if (sendIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(sendIntent);
        }
    }

    /**
     * RESET button
     */
    public void resetScore(View view) {

        new AlertDialog.Builder(this)
                .setMessage("Are you sure?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        scoreTeamA = 0;
                        scoreTeamB = 0;
                        spikesTeamA = 0;
                        spikesTeamB = 0;
                        blocksTeamA = 0;
                        blocksTeamB = 0;
                        servesTeamA = 0;
                        servesTeamB = 0;
                        oppErrorsTeamA = 0;
                        oppErrorsTeamB = 0;
                        setTeamA = 0;
                        setTeamB = 0;
                        displayForTeamA(scoreTeamA);
                        displayForTeamB(scoreTeamB);
                        displaySetForTeamA(setTeamA);
                        displaySetForTeamB(setTeamB);
                        displayBlocksForTeamA(blocksTeamA);
                        displayBlocksForTeamB(blocksTeamB);
                        displayServesForTeamA(servesTeamA);
                        displayServesForTeamB(servesTeamB);
                        displaySpikesForTeamA(spikesTeamA);
                        displaySpikesForTeamB(spikesTeamB);
                        displayOppErrorsForTeamA(oppErrorsTeamA);
                        displayOppErrorsForTeamB(oppErrorsTeamB);
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

}

