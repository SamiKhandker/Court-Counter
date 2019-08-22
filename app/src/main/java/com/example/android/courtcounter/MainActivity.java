package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamA = 0;
    int teamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }
    public void threePointerA(View view){
        teamA += 3;
        displayForTeamA(teamA);
    }
    public void twoPointerA(View view){
        teamA += 2;
        displayForTeamA(teamA);
    }
    public void onePointerA(View view){
        teamA += 1;
        displayForTeamA(teamA);
    }
    public void threePointerB(View view){
        teamB += 3;
        displayForTeamB(teamB);
    }
    public void twoPointerB(View view){
        teamB += 2;
        displayForTeamB(teamB);
    }
    public void onePointerB(View view){
        teamB += 1;
        displayForTeamB(teamB);
    }
    public void reset(View view){
        teamA = 0;
        teamB = 0;
        displayForTeamA(teamA);
        displayForTeamB(teamB);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.teamAPoints);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.teamBPoints);
        scoreView.setText(String.valueOf(score));
    }
}
