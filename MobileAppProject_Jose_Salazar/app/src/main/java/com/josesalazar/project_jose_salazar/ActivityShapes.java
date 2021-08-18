package com.josesalazar.project_jose_salazar;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;

public class ActivityShapes extends AppCompatActivity {

    TextView txt;
    Button btnEnglish;
    Button btnSpanish;
    Button btnBack;
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapes);

        txt = (TextView) findViewById(R.id.changingText);
        btnEnglish = (Button) findViewById(R.id.button_English);
        btnSpanish = (Button) findViewById(R.id.button_Spanish);
        btnBack = (Button) findViewById(R.id.backBtn);
        btnNext = (Button) findViewById(R.id.nextBtn);


        btnEnglish.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txt.setText("Shapes");
            }
        });

        btnSpanish.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v){
                txt.setText("Formas");
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openHomeActivity();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openShapeCircle();
            }
        });


    }

    public void openHomeActivity(){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);

    }

    public void openShapeCircle(){
        Intent intent = new Intent(this, ShapeCircle.class);
        startActivity(intent);

    }
}