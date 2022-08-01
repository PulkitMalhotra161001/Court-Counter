package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity<b1> extends AppCompatActivity {

    int sc_a=0;
    int sc_b=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        displayForTeamA(sc_a);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void a1(View view){
        sc_a+=1;
        displayForTeamA(sc_a);
    }
    public void a2(View view){
        sc_a+=2;
        displayForTeamA(sc_a);
    }
    public void a3(View view){
        sc_a+=3;
        displayForTeamA(sc_a);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void b1(View view){
        sc_b+=1;
        displayForTeamB(sc_b);
    }
    public void b2(View view){
        sc_b+=2;
        displayForTeamB(sc_b);
    }
    public void b3(View view){
        sc_b+=3;
        displayForTeamB(sc_b);
    }

    public void reset(View view) {
        sc_a=0;
        sc_b=0;
        displayForTeamA(sc_a);
        displayForTeamB(sc_b);
    }
}