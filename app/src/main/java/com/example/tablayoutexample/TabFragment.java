package com.example.tablayoutexample;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tablayoutexample.R;

import butterknife.Bind;
import butterknife.ButterKnife;


public class TabFragment extends Fragment {

    @Bind(R.id.text) TextView text;

    public TabFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View tabFragmentView = inflater.inflate(R.layout.fragment_tab, container, false);
        ButterKnife.bind(this, tabFragmentView);
        return tabFragmentView;
    }


}
