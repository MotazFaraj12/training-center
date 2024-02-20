package com.example.trainingcenter.View.Trainee;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.example.trainingcenter.R;

public class CustomAdapterSetting extends ArrayAdapter<String> {
    Activity context;
    String name[];
    String num[];
    TextView medium_text, small_text;

    public CustomAdapterSetting(Activity context, String[] name, String[] num) {
        super(context, R.layout.setting_trainee, name);
        this.context = context;
        this.name = name;
        this.num = num;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View v = inflater.inflate(R.layout.setting_trainee, null, true);
        medium_text = (TextView) v.findViewById(R.id.medium_text);
        small_text = (TextView) v.findViewById(R.id.small_text);
        medium_text.setText(name[position]);
        small_text.setText(num[position]);
        return v;
    }
}
