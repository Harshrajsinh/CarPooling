package com.android.cbe.ui.navigationdrawer.common;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.android.cbe.ui.navigationdrawer.bloodfinder.BloodFinderFragment;

/**
 * Created by intern.rahuld on 04-03-2016.
 */
public class HomeActivity extends Activity {


    int CONTENT_VIEW_ID = 10101010;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout frame = new FrameLayout(this);
        frame.setId(CONTENT_VIEW_ID);
        setContentView(frame, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT));

        if (savedInstanceState == null) {
            Fragment newFragment = new BloodFinderFragment();
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.add(CONTENT_VIEW_ID, newFragment).commit();
        }
    }




}
