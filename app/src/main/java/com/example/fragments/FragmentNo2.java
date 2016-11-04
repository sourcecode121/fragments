package com.example.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Anand on 03/11/2016.
 */

public class FragmentNo2 extends Fragment {

    private View v;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_2_layout, container, false);
        return v;
    }

    public void updateTextView(String message) {
        TextView textView = (TextView) v.findViewById(R.id.frag_2_text);
        textView.setText(message);
        textView.setVisibility(View.VISIBLE);
    }
}
