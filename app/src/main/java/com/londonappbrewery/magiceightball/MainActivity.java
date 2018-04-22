package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] decisions = {"YES!", "NO!"};

        Button askButton = findViewById(R.id.askButton);

        final TextView decisionText = findViewById(R.id.decisionText);

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random rnd = new Random();
                int randomNumber = rnd.nextInt(2);

                decisionText.setText(decisions[randomNumber]);

            }
        });


    }
}
