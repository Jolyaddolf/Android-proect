package com.example.cliker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView mainText;
    Button ClkButton;
    Button MinusButton;

    Button Kill;
    private long score = 0;





    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainText = (TextView) findViewById(R.id.mainText);

        ClkButton = (Button) findViewById(R.id.ClkButton);
        MinusButton = (Button) findViewById(R.id.MinusButton);
        Kill = (Button) findViewById((R.id.Kill));

        ClkButton.setOnClickListener(clickListener);
        MinusButton.setOnClickListener(clickListener);
        Kill.setOnClickListener(clickListener);



    }

    View.OnClickListener clickListener = new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            if (v.getId() == R.id.ClkButton) {
                score++;
                if (score % 10 == 1 || score % 10 == 5 || score % 10 == 0 || score % 10 == 7
                        || score % 10 == 8 || score % 10 == 9 || score % 10 == 6){
                    String s = "Кнопка  " + score ;
                    mainText.setText(s.toCharArray(), 0, s.length());
                    ClkButton.setOnClickListener(clickListener);
                }
                else if (score == 12 || score == 13 || score == 14){
                    String s = "Кнопка  " + score;
                    mainText.setText(s.toCharArray(), 0, s.length());
                    ClkButton.setOnClickListener(clickListener);
                }
                else{
                    String s = "Кнопка  " + score;
                    mainText.setText(s.toCharArray(), 0, s.length());
                    ClkButton.setOnClickListener(clickListener);
                }
            }


            if (v.getId() == R.id.MinusButton) {
                score--;
                if (score % 10 == 1 || score % 10 == 5 || score % 10 == 0 || score % 10 == 7
                        || score % 10 == 8 || score % 10 == 9 || score % 10 == 6) {
                    String a = "Кнопка  " + score ;
                    mainText.setText(a.toCharArray(), 0, a.length());
                    MinusButton.setOnClickListener(clickListener);
                }
                else if (score == 12 || score == 13 || score == 14){
                    String a = "Кнопка  " + score;
                    mainText.setText(a.toCharArray(), 0, a.length());
                    MinusButton.setOnClickListener(clickListener);
                }
                else{
                    String a = "Кнопка  " + score ;
                    mainText.setText(a.toCharArray(), 0, a.length());
                    MinusButton.setOnClickListener(clickListener);
                }

             if(v.getId() ==R.id.Kill){


                        score = 0;
                        String b = "Кнопка -- " + score;
                        mainText.setText(b.toCharArray(), 0, b.length());
                        Kill.setOnClickListener(clickListener);

                 }






             }
            View.OnClickListener killclicklisener = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(v.getId() ==R.id.Kill){


                            score = 0;
                            String b = "Кнопка -- " + score;
                            mainText.setText(b.toCharArray(), 0, b.length());
                            Kill.setOnClickListener(clickListener);

                    }

                }
            };





            }










        };







        };















