package com.android.cbe.baseapp.baseclass;

import android.app.Fragment;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.cbe.android.R;

/**
 * Created by Intern.harshrajT on 2/23/2016.
 */
public class BaseFragment extends Fragment implements View.OnClickListener {

    public View mRoot;
    public LinearLayout mParentContainer;
    public Context mContext;
    ImageView mBtnBack, mImageView;
    public TextView mTvHeader;
    public RelativeLayout layoutHeader;
    public Button mBtnSave;

    public View getContainerView(Context context, int contentId, String fragmentName) {
        mContext = context;

        mRoot = View.inflate(context, R.layout.fragment_base_layout, null);
        mRoot.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT));

        LinearLayout baseFragmentLayout = (LinearLayout) mRoot
                .findViewById(R.id.layoutBaseFragment);

        mParentContainer = (LinearLayout) mRoot.findViewById(R.id.parentContainer);

        ViewGroup layout = (ViewGroup) View.inflate(context, contentId, baseFragmentLayout);

        mBtnBack = (ImageView) mRoot.findViewById(R.id.btnBack);
        mTvHeader = (TextView) mRoot.findViewById(R.id.tvHeaderLabel);

        mBtnSave = (Button) mRoot.findViewById(R.id.saveButton);
        layoutHeader = (RelativeLayout) mRoot.findViewById(R.id.layoutHeader);

        mBtnBack.setOnClickListener(this);

        layout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT));

        mRoot.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (keyCode == KeyEvent.KEYCODE_BACK) {
                    mBtnBack.performClick();
                }
                return false;
            }
        });

        return mRoot;
    }


    public void showHeader(boolean needToShow) {
        if (needToShow) {
            layoutHeader.setVisibility(View.VISIBLE);
        } else {
            layoutHeader.setVisibility(View.GONE);
        }

    }

    public void showSaveButton(boolean needToShow, String btnHeader, View.OnClickListener listener) {
        if (needToShow) {
            mBtnSave.setVisibility(View.VISIBLE);
            mBtnSave.setText(btnHeader);
            mBtnSave.setOnClickListener(listener);
        } else {
            mBtnSave.setVisibility(View.GONE);
        }
    }

    public void setTitle(String title) {
        if (title != null) {
            mTvHeader.setVisibility(View.VISIBLE);
            mTvHeader.setText(title);
        } else {
            mTvHeader.setVisibility(View.GONE);
        }
    }

    public void setIcon(boolean needToShow, int iconId, View.OnClickListener listener) {
        if (needToShow) {
            mBtnBack.setVisibility(View.VISIBLE);
            mBtnBack.setBackground(getResources().getDrawable(iconId));
            mBtnBack.setOnClickListener(listener);
        } else {
            mBtnBack.setVisibility(View.GONE);
        }

    }

    @Override
    public void onResume() {
        super.onResume();

    }


    @Override
    public void onClick(View v) {

        if (v == mBtnBack) {
            getActivity().onBackPressed();
        }

    }
}