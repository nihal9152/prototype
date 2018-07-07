package com.example.chiranjivrajput.prototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class new1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new1);
        ImageView iv1= findViewById(R.id.aa1);
        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(new1.this,new1.class));
            }
        });
        ImageView iv2= findViewById(R.id.aa2);
        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(new1.this,Main2Activity.class));
            }
        });
        ImageView iv3= findViewById(R.id.aa3);
        iv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(new1.this,Main3Activity.class));
            }
        });
        ImageView iv4= findViewById(R.id.aa4);
        iv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(new1.this,Main4Activity.class));
            }
        });
    }
}

