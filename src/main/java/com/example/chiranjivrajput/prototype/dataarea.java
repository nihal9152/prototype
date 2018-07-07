package com.example.chiranjivrajput.prototype;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class dataarea extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datalist);
        ImageView iv1= findViewById(R.id.aa1);
        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(dataarea.this,new1.class));
            }
        });
        ImageView iv2= findViewById(R.id.aa2);
        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(dataarea.this,Main2Activity.class));
            }
        });
        ImageView iv3= findViewById(R.id.aa3);
        iv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(dataarea.this,Main3Activity.class));
            }
        });
        ImageView iv4= findViewById(R.id.aa4);
        iv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(dataarea.this,Main4Activity.class));
            }
        });
        final ArrayList<data> da1= new ArrayList<>();

        da1.add(new data("BOOK","ELOQUENT JAVASCRIPT",true,true,false,new String[]{"JAVASCRIPT","","","","","","","",""},"http://eloquentjavascript.net/"));
        da1.add(new data("BOOK","HEAD FIRST JAVA",true,true,false,new String[]{"JAVA","","","","","","","",""},"http://www.headfirstlabs.com/books/hfjava/"));
        String[] s2=new String[]{"HTML","CSS","","","","","","",""};
        da1.add(new data("BOOK","HTML AND CSS",true,true,false,s2,"http://www.amazon.com/HTML-CSS-Design-Build-Websites/dp/1118008189"));
        String[] s3=new String[]{"JAVASCRIPT","","","","","","","",""};
        da1.add(new data("BOOK","JAVASCRIPT AND HTML 5 NOW - SHORT OVERVIEW OF MORDERN J.S.",true,true,false,s3,"http://www.oreilly.com/programming/free/javascript-html5-now.csp"));
        String[] s4=new String[]{"JAVASCRIPT","","","","","","","",""};
        da1.add(new data("BOOK","JAVASCRIPT AND JQUERY",true,true,false,s4,"http://www.amazon.com/JavaScript-JQuery-Interactive-Front-End-Development/dp/1118531647http://www.amazon.com/JavaScript-Good-Parts-Douglas-Crockford/dp/0596517742"));
        String[] s5=new String[]{"JAVASCRIPT","","","","","","","",""};
        da1.add(new data("BOOK","JAVASCRIPT THE GOOD PARTS",false,true,true,s5,"http://www.amazon.com/JavaScript-Good-Parts-Douglas-Crockford/dp/0596517742"));
        String[] s6=new String[]{"C","","","","","","","",""};
        da1.add(new data("BOOK","lEARN C THE HARD WAY",true,true,false,s6,"http://c.learncodethehardway.org/"));
        String[] s7=new String[]{"CSS","SASS","","","","","","",""};
        da1.add(new data("BOOK","SASS FOR WEB DESIGNERS",true,true,false,s7,"http://www.abookapart.com/products/sass-for-web-designers"));
        String[] s8=new String[]{"JAVASCRIPT","","","","","","","",""};
        da1.add(new data("BOOK","RUBY BEST PRACTICES-BOOK",true,true,false,s8,"https://practicingruby.com/"));
        String[] s9=new String[]{"HTML","CSS","RUBY","","","","","",""};
        da1.add(new data("REFERENCE","BUILDINGWEBAPPS.COM",true,true,false,s9,"http://www.buildingwebapps.com/"));
        String[] s10=new String[]{"CSS","","","","","","","",""};
        da1.add(new data("REFERENCE","CSS SELECTORS",false,true,false,s10,"http://benhowdle.im/cssselectors"));
        String[] s11=new String[]{"JAVASCRIPT","","","","","","","",""};
        da1.add(new data("REFERENCE","KHAN ACADEMY",true,true,false,s11,"https://www.khanacademy.org/computing/computer-programming/programming"));
        String[] s12=new String[]{"HTML","CSS","","","","","","",""};
        da1.add(new data("REFERENCE","UDEMY LEARN TH FOUNDATIONS OF HTML",true,false,false,s12,"https://blog.udemy.com/learn-html-learn-the-foundations-of-html"));
        dataadapter item=new dataadapter(this,da1);
        ListView l= findViewById(R.id.root);
        l.setAdapter(item);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Uri u= Uri.parse(da1.get(i).getLink());
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, u);
                startActivity(launchBrowser);
            }
        });
    }
}
