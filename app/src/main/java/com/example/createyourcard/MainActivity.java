package com.example.createyourcard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText tv1,tv2,tv3,tv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         tv1 = findViewById(R.id.fm1);
         tv2 = findViewById(R.id.fm2);
         tv3 = findViewById(R.id.fm3);
        tv5 = findViewById(R.id.fm4);
        TextView tv4 = findViewById(R.id.create);


        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = tv1.getText().toString();
                String s2 = tv2.getText().toString();
                String s3 = tv3.getText().toString();
                String s4 = tv5.getText().toString();
                Bundle bundle=new Bundle();
                bundle.putString("From",s1);
                bundle.putString("To",s2);
                bundle.putString("Message",s3);
                bundle.putString("Heading",s4);
                Intent f1 = new Intent(MainActivity.this, card.class);
                f1.putExtras(bundle);
                startActivity(f1);
            }
        });
    }}
