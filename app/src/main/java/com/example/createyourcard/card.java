package com.example.createyourcard;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class card extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card);

        Bundle bundle = getIntent().getExtras();
        if (bundle !=null){
        String from= bundle.getString("From");
        String to= bundle.getString("To");
        String message= bundle.getString("Message");
            String heading= bundle.getString("Heading");
            TextView m1 = findViewById(R.id.s);
            TextView m2 = findViewById(R.id.k);
            TextView m3 = findViewById(R.id.l);
            TextView m4 = findViewById(R.id.m);
            TextView m5 = findViewById(R.id.bcard);

          m4.append(from);
            m2.append(to);
            m3.setText(message);
            m1.setText(heading);
            
              m5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(getApplicationContext(), list.class));
                    finish();
                }
            });
        }}
    }

