package com.android.cbe.baseapp.baseclass;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.cbe.android.R;

/**
 * Created by Intern.harshrajT on 2/23/2016.
 */
public class BaseFragment extends Fragment {

   /* protected FrameLayout baseFrameLayout;
    protected View baseView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        super.onCreateView(inflater, container, savedInstanceState);

        baseView = inflater.inflate(R.layout.fragment_base_layout, container, false);

        baseFrameLayout = (FrameLayout) baseView.findViewById(R.id.frameLayout);

        return baseView;
    }*/

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment

        return inflater.inflate(
                R.layout.fragment_base_layout, container, false);
    }
}