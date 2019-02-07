package com.example.biggernumbergame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int num1;
    private int num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainGameLogic();


    }
    public void mainGameLogic(){
        Random random = new Random();
        while(true){
            num1 = random.nextInt(100);
            num2 = random.nextInt(100);
            if(num1 != num2)
                break;
        }

        // Acessing Buttons In Java code

        Button left_button = findViewById(R.id.left_button);
        Button right_button = findViewById(R.id.right_button);

        //Setting Up the text of left button and right button

        left_button.setText(String.valueOf(num1));
        right_button.setText(String.valueOf(num2));

    }


    public void leftButtonClicked(View view) {
    }

    public void rightButtonClicked(View view) {
    }
}
