package com.android.cbe.ui.dashboard.dashboardanimation;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.LinearLayout.LayoutParams;

/**
 * Created by Intern.harshrajT on 3/1/2016.
 */
public class ExpandAnimation extends Animation {
    private View mAnimatedView;
    private LayoutParams mLayoutParam;
    private  int mMarginStart,mMarginEnd;
    private boolean isVisibleAFter=false;
    private boolean wasEndedAlready=false;


    public ExpandAnimation(View view,int duration) {
        setDuration(duration);
        mLayoutParam=(LayoutParams)view.getLayoutParams();
        this.mAnimatedView = view;
        isVisibleAFter=(view.getVisibility() == View.VISIBLE);
        mMarginStart=mLayoutParam.bottomMargin;
        mMarginEnd= (mMarginStart == 0 ? (0- view.getHeight()) : 0);
        view.setVisibility(View.VISIBLE);
    }


    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        super.applyTransformation(interpolatedTime, t);
        super.applyTransformation(interpolatedTime, t);
        if (interpolatedTime < 1.0f) {

            // Calculating the new bottom margin, and setting it
            mLayoutParam.bottomMargin = mMarginStart
                    + (int) ((mMarginEnd - mMarginStart) * interpolatedTime);

            // Invalidating the layout, making us seeing the changes we made
            mAnimatedView.requestLayout();

            // Making sure we didn't run the ending before (it happens!)
        } else if (!wasEndedAlready) {
            mLayoutParam.bottomMargin = mMarginEnd;
            mAnimatedView.requestLayout();

            if (isVisibleAFter) {
                mAnimatedView.setVisibility(View.GONE);
            }
            wasEndedAlready = true;
        }
    }
}
