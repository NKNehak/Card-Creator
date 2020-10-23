package com.example.createyourcard;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class birthday extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.birthday);

        Bundle bundle = getIntent().getExtras();
        if (bundle !=null){
            String from= bundle.getString("From");
            String to= bundle.getString("To");
            String message= bundle.getString("Message");
            String heading= bundle.getString("Heading");
            TextView bm1 = findViewById(R.id.bs);
            TextView bm2 = findViewById(R.id.bk);
            TextView bm3 = findViewById(R.id.bl);
            TextView bm4 = findViewById(R.id.bm);
            TextView m5 = findViewById(R.id.bfestival);

            bm4.append(from);
            bm2.append(to);
            bm3.setText(message);
            bm1.setText(heading);
            
              m5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(getApplicationContext(), list.class));
                    finish();
                }
            });
        }}
}



