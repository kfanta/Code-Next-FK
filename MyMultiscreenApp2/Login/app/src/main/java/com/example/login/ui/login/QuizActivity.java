package com.example.login.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.login.R;

public class QuizActivity extends AppCompatActivity {
    TextView Questions;
    Button answerchoice1;
    Button answerchoice2;
    Button answerchoice3;
    Button answerchoice4;

    @Override //personality quiz
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Questions = findViewById(R.id.Questions);

    }
}
