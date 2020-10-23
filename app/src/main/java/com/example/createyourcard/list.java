package com.example.createyourcard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class list extends AppCompatActivity {
    private String first;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        TextView a1=findViewById(R.id.a);
        first= a1.getText().toString();
        TextView a2=findViewById(R.id.back);
        
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(list.this,card.class);
                intent.putExtra(Intent.EXTRA_TEXT,first);
                startActivity(intent);
    }
});
    a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(list.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }}
