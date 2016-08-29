package com.mlgrier.billboardquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int mScore;
    Editable question1Answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        question1Answer = ((EditText) findViewById(R.id.artistQuestion1)).getText();
    }

    private void displayScore(int score) {
        TextView quizScore = (TextView) findViewById(R.id.quizScore);
        quizScore.setText("" + score);
    }

    public void submitQuiz(View view) {

        mScore = 0;

        //Variable for artist name
        EditText artistInput = (EditText) findViewById(R.id.artistQuestion1);
        String artistName = artistInput.getText().toString();

        if (artistName.equalsIgnoreCase("Bee Gees")) {

            // Note can use - mScore = mScore + 1; || mScore++; || mScore += 1;
            mScore++;
            displayScore(mScore);
        }

        //Variable for question #2. One of the correct answers
        CheckBox andy = (CheckBox) findViewById(R.id.checkBox1);
        boolean isAndy = andy.isChecked();

        //Variable for question #2. One of the correct answers
        CheckBox debby = (CheckBox) findViewById(R.id.checkBox3);
        boolean isDebby = debby.isChecked();

        CheckBox chic = (CheckBox) findViewById(R.id.checkBox2);
        boolean isChic = chic.isChecked();

        CheckBox knack = (CheckBox) findViewById(R.id.checkBox4);
        boolean isKnack = knack.isChecked();


        if (isAndy && isDebby && !isChic && !isKnack) {
            mScore++;
            displayScore(mScore);
        }


        //Access the RadioGroup view and save it to a variable.
        RadioGroup radioGQ1 = (RadioGroup) findViewById(R.id.radioGQ1);
        //Get the id of the RadioButton that is checked and save it
        //as an integer variable.
        int solutionId1 = radioGQ1.getCheckedRadioButtonId();
        //Use if statements to respond based on whether
        //it is the id of the correct answer.
        if (solutionId1 == R.id.michaelBtnQ3) {
            mScore++;
            displayScore(mScore);
        }

        RadioGroup radioGQ2 = (RadioGroup) findViewById(R.id.radioGQ2);
        int solutionId2 = radioGQ2.getCheckedRadioButtonId();
        if (solutionId2 == R.id.oliviaBtnQ4) {
            mScore++;
            displayScore(mScore);
        }

        RadioGroup radioGQ3 = (RadioGroup) findViewById(R.id.radioGQ3);
        int solutionId3 = radioGQ3.getCheckedRadioButtonId();
        if (solutionId3 == R.id.mariahBtnQ5) {
            mScore++;
            displayScore(mScore);
        }

        RadioGroup radioGQ4 = (RadioGroup) findViewById(R.id.radioGQ4);
        int solutionId4 = radioGQ4.getCheckedRadioButtonId();
        if (solutionId4 == R.id.mariahBtnQ6) {
            mScore++;
            displayScore(mScore);
        }

        RadioGroup radioGQ5 = (RadioGroup) findViewById(R.id.radioGQ5);
        int solutionId5 = radioGQ5.getCheckedRadioButtonId();
        if (solutionId5 == R.id.usherBtnQ7) {
            mScore++;
            displayScore(mScore);
        }

        RadioGroup radioGQ6 = (RadioGroup) findViewById(R.id.radioGQ6);
        int solutionId6 = radioGQ6.getCheckedRadioButtonId();
        if (solutionId6 == R.id.mariahBtnQ8) {
            mScore++;
            displayScore(mScore);
        }

        RadioGroup radioGQ7 = (RadioGroup) findViewById(R.id.radioGQ7);
        int solutionId7 = radioGQ7.getCheckedRadioButtonId();
        if (solutionId7 == R.id.rihannaBtnQ9) {
            mScore++;
            displayScore(mScore);
        }

        RadioGroup radioGQ8 = (RadioGroup) findViewById(R.id.radioGQ8);
        int solutionId8 = radioGQ8.getCheckedRadioButtonId();
        if (solutionId8 == R.id.brunoBtnQ10) {
            mScore++;
            displayScore(mScore);

            if (mScore >= 10) {
                Toast.makeText(MainActivity.this,
                        "YOU SCORED A PERFECT " + mScore + " OUT OF 10.", Toast.LENGTH_LONG).show();

            } else if (mScore < 10) {
                Toast.makeText(MainActivity.this,
                        "You scored " + mScore + " out of 10.", Toast.LENGTH_LONG).show();
            }

        }


    }


}


