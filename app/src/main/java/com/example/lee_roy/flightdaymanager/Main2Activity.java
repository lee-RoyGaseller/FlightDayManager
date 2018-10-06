package com.example.lee_roy.flightdaymanager;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String confirmation = getIntent().getStringExtra("confirmation");
        if(!validConfirmation(confirmation)){
            buildGUI();
        }
        else{
            buildGUI2();
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
    public void buildGUI(){
        RelativeLayout thisLayout = new RelativeLayout(this);
        TextView sorry = new TextView(this);
        sorry.setText("Sorry; this is not a valid confirmation number.");
        sorry.setTextSize(20);
        thisLayout.addView(sorry);
        TextView help = new TextView(this);
        help.setText("Call 800-433-7300 for assistance.");
        help.setY(500);
        help.setX(350);
        thisLayout.addView(help);
        setContentView(thisLayout);
    }

    public void buildGUI2(){
        RelativeLayout thisLayout = new RelativeLayout(this);

        setContentView(thisLayout);
    }

    public boolean validConfirmation(String conf){
        return false;
    }
}
