package com.example.lee_roy.flightdaymanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        buildGUI();
    }

    public static String confirmation;

    public void buildGUI(){
        RelativeLayout thisLayout = new RelativeLayout(this);

        TextView welcome = new TextView(this);
        welcome.setText("Welcome to the American Airlines Flight Day Manager.");
        welcome.setTextSize(36);
        welcome.setX(50);
        thisLayout.addView(welcome);
        TextView command = new TextView(this);
        command.setText("Please enter your flight confirmation number:");
        command.setY(800);
        command.setX(10);
        command.setTextSize(20);
        thisLayout.addView(command);
        EditText confirm = new EditText(this);
        confirm.setHint("Confirmation #");
        confirm.setY(900);
        confirm.setX(400);
        confirm.setTextSize(25);
        confirmation = String.valueOf(confirm.getText());
        thisLayout.addView(confirm);
        Button next = new Button(this);
        next.setY(1200);
        next.setX(500);
        next.setText("Login");
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Main2Activity.class);
                intent.putExtra("confirmation", confirmation);
                startActivity(intent);
            }
        });
        thisLayout.addView(next);
        setContentView(thisLayout);
    }

}
