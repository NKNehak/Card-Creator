package com.example.createyourcard;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class festival extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.festival);

        Bundle bundle = getIntent().getExtras();
        if (bundle !=null){
            String from= bundle.getString("From");
            String to= bundle.getString("To");
            String message= bundle.getString("Message");
            String heading= bundle.getString("Heading");
            TextView fm1 = findViewById(R.id.fs);
            TextView fm3 = findViewById(R.id.fl);

            fm3.setText(message);
            fm1.setText(heading);
        }}
}
