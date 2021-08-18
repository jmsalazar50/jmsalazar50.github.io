package com.josesalazar.project_jose_salazar;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button buttonC = findViewById(R.id.buttonColors);
        buttonC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivityColors();
            }
        });

        Button buttonS = findViewById(R.id.buttonShapes);
        buttonS.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivityShapes();
            }
        });
    }

    public void openActivityColors(){
        Intent intent = new Intent(this, ActivityColors.class);
        startActivity(intent);

    }

    public void openActivityShapes(){
        Intent intent = new Intent(this, ActivityShapes.class);
        startActivity(intent);

    }


}
