package com.example.chiranjivrajput.prototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

public class Main2Activity extends AppCompatActivity {

    public static String s1,s2,s3;

    public static void setS3(String s3) {
        Main2Activity.s3 = s3;
    }

    public static void setS1(String s1) {
        Main2Activity.s1 = s1;
    }

    public static void setS2(String s2) {
        Main2Activity.s2 = s2;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ImageView iv1= findViewById(R.id.aa1);
        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main2Activity.this,new1.class));
            }
        });
        ImageView iv2= findViewById(R.id.aa2);
        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main2Activity.this,Main2Activity.class));
            }
        });
        ImageView iv3= findViewById(R.id.aa3);
        iv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main2Activity.this,Main3Activity.class));
            }
        });
        ImageView iv4= findViewById(R.id.aa4);
        iv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Main2Activity.this,Main4Activity.class));
            }
        });
        Spinner spin= findViewById(R.id.spin1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.format, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);
        Spinner spin2= findViewById(R.id.spin2);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.level, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin2.setAdapter(adapter1);
        Spinner spin3= findViewById(R.id.spin3);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.topic, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin3.setAdapter(adapter2);

        setS1(spin.getSelectedItem().toString());
        setS2(spin2.getSelectedItem().toString());
        setS3(spin3.getSelectedItem().toString());
        Button b= findViewById(R.id.sumbit);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Spinner spin11= findViewById(R.id.spin1);
                Spinner spin12= findViewById(R.id.spin2);
                Spinner spin13= findViewById(R.id.spin3);
                setS1(spin11.getSelectedItem().toString());
                setS2(spin12.getSelectedItem().toString());
                setS3(spin13.getSelectedItem().toString());

                Intent i= new Intent(Main2Activity.this,dataarea.class);
                startActivity(i);
            }
        });
    }
}
