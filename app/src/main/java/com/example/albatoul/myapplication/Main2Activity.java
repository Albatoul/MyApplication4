package com.example.albatoul.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView NameDisplaytextView=(TextView) findViewById(R.id.NameDisplaytextView);
        Button intalqbtn=(Button) findViewById(R.id.intaliqbtn);
        intalqbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next2=new Intent(getApplicationContext(),Main3Activity.class);
                startActivity(next2);
            }
        });


       if (getIntent().hasExtra("com.example.albatoul.myapplication.Something")){
           String t=getIntent().getExtras().getString("com.example.albatoul.myapplication.Something");
           NameDisplaytextView.setText(t);


        }


    }
}
