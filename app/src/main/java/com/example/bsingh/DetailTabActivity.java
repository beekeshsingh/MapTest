package com.example.bsingh;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.bsingh.maptest.R;

public class DetailTabActivity extends Fragment {

    TextView textView_lat,textView_lng;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_detail_tab,null);
        textView_lat = (TextView)view.findViewById(R.id.textView_lat);
        textView_lng = (TextView)view.findViewById(R.id.textView_lng);
        return view;
    }
}
