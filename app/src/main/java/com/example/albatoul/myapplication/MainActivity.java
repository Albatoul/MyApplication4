package com.example.albatoul.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    ///////////////
     /////////////Reem do u see me ?
    ////////////

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button ebdabtn= findViewById(R.id.ebdabtn);

        final Intent next=new Intent(getApplicationContext(),Main2Activity.class);

        ebdabtn.setOnClickListener(new View.OnClickListener() {
            //editText4

            EditText txt4 = (EditText) findViewById(R.id.editText4);
           public String nameContent = String.valueOf(txt4);

            @Override
            public void onClick(View v) {

                if (txt4.getText().toString().isEmpty())
                    txt4.setError(Html.fromHtml("<font color='white'>أدخل إسمك من فضلك</font>"));

                else
                {
                    next.putExtra("com.example.albatoul.myapplication.Something", txt4.getText().toString()+"");
            startActivity(next);
        }














            }//end of onClick method
        });
    }
}
