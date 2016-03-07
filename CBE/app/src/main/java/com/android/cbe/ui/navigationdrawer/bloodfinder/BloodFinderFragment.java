package com.android.cbe.ui.navigationdrawer.bloodfinder;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.cbe.baseapp.baseclass.BaseFragment;
import com.cbe.android.R;

/**
 * Created by Intern.harshrajT on 2/23/2016.
 */
public class BloodFinderFragment extends BaseFragment{


    private static final String TAG = BloodFinderFragment.class.getSimpleName();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = getContainerView(getActivity(), R.layout.fragment_blood_finder, TAG);


        return view;
    }

}
