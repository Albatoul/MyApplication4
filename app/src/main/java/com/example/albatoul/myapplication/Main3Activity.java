package com.example.albatoul.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

       ImageButton nxtbutton= (ImageButton) findViewById (R.id.nxtimagebtn);


        nxtbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next3=new Intent(getApplicationContext(),Main4Activity.class);
                startActivity(next3);
            }
        });
    }
}
