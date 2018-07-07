package com.example.chiranjivrajput.prototype;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class dataadapter extends ArrayAdapter<data> {
    dataadapter(Activity context, ArrayList<data> objects) {
        super(context,0, objects);
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        View listview=convertView;
        if (listview == null) {
            listview = LayoutInflater.from(getContext()).inflate(
                    R.layout.dataform, parent, false);
        }
        data currentdata=getItem(position);


        TextView t1 = listview.findViewById(R.id.ts1);
        assert currentdata != null;
        t1.setText(currentdata.getResource());
        TextView t2 = listview.findViewById(R.id.ts2);
        StringBuilder ss = new StringBuilder(currentdata.topic[0]);
        for (int i = 1; i < currentdata.topic.length; i++) {
            if (currentdata.topic[i].equals(""))
                break;
            ss.append(",").append(currentdata.topic[i]);
        }
        t2.setText(ss.toString());

        return listview;
    }

}
