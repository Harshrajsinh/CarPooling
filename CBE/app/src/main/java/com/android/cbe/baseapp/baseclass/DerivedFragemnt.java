package com.android.cbe.baseapp.baseclass;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.android.cbe.baseapp.baseclass.BaseFragment;
import com.cbe.android.R;

/**
 * Created by intern.rahuld on 03-03-2016.
 */
public class DerivedFragemnt extends BaseFragment {

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment

        return inflater.inflate(
                R.layout.test, container, false);
    }

}
