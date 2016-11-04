package com.example.fragments;

import android.content.Context;
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

public class FragmentNo1 extends Fragment {

    private Fragment1Callback fragment1Callback;

    public interface Fragment1Callback {
        public void callback1(String message);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        fragment1Callback = (Fragment1Callback) context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_1_layout, container, false);
        final TextView textView = (TextView) v.findViewById(R.id.frag_1_text);

        v.findViewById(R.id.frag_1_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setVisibility(View.GONE);
                fragment1Callback.callback1(textView.getText().toString());
            }
        });

        return v;
    }
}
