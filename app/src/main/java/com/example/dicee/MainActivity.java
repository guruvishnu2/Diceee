package com.example.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rollButton=(Button) findViewById(R.id.button);
        final ImageView LeftDice=(ImageView) findViewById(R.id.dice01);
        final ImageView RightDice=(ImageView) findViewById(R.id.dice02);
        final int[] diceArray={
                R.drawable.dice1,
        R.drawable.dice2,
        R.drawable.dice3,
        R.drawable.dice4,
        R.drawable.dice5,
        R.drawable.dice6
        };
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumberGenrator= new Random();
                int number1=randomNumberGenrator.nextInt(6);
                int number2=randomNumberGenrator.nextInt(6);
                LeftDice.setImageResource(diceArray[number1]);
                RightDice.setImageResource(diceArray[number2]);
            }
        });
    }
}
