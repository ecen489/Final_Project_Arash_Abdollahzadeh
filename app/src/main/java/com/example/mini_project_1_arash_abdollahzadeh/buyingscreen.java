package com.example.mini_project_1_arash_abdollahzadeh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class buyingscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buyingscreen);

        Intent intent = getIntent();

        Bundle extra = intent.getExtras();

        String[] list = (String[]) extra.getStringArray("list");

        TextView txt = (TextView) findViewById(R.id.Text_of_Buy);

        String total = "";

        for (int i = 0; i < list.length ; i++){
            total = total +  Integer.toString(i+1) + ". " + list[i] + "\n" ;
        }

        txt.setText(total);

    }


    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
    }

    public void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);

    }

}
