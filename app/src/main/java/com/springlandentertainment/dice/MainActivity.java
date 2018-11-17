package com.springlandentertainment.dice;

import android.support.v7.app.AppCompatActivity;
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

                   //dice images
                   final ImageView dice1 = findViewById(R.id.dice1);
                   final ImageView dice2 = findViewById(R.id.dice2);

                   //roll button
                   final Button rollButton = findViewById(R.id.rollButton);

                   //dice array
                   final int[] diceArray = {
                           R.drawable.dice1,
                           R.drawable.dice2,
                           R.drawable.dice3,
                           R.drawable.dice4,
                           R.drawable.dice5,
                           R.drawable.dice6
                   };

                //set roll button listener
                rollButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    //random numbers
                    int num;
                    Random random;

                    //set random num
                    random = new Random();

                    //roll first dice
                    num = random.nextInt(6);
                    dice1.setImageResource(diceArray[num]);

                    //roll second dice
                    num = random.nextInt(6);
                    dice2.setImageResource(diceArray[num]);

            }
        });




    }
}
