package com.example.trafficlight;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button  btn= findViewById(R.id.button);
        final TextView textView = findViewById(R.id.textView);

        btn.setOnClickListener(new View.OnClickListener() {
            int d =1;

            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                  if (d == 1){

                      textView.setBackgroundColor(R.color.red);
                      d=2;
                  }  else if (d== 2)   {
                      textView.setBackgroundColor(R.color.yellow);
                      d=3;
                  }  else if(d == 3){
                    textView.setBackgroundColor(R.color.green);
                    d=1;
                  }

            }
        });
    }
}
