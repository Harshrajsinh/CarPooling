
package com.android.cbe.baseapp.baseclass;

import android.cbe.com.cbe.R;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toolbar;


public class BaseActivity  extends AppCompatActivity{

    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.activity_main);

        //Set custom Toolbar
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setActionBar(mToolbar);

    }


    public void setToolbar(AppCompatActivity context, Toolbar toolBar, boolean isSubActivity) {


        context.getSupportActionBar().setDisplayShowTitleEnabled(false);
        context.getSupportActionBar().setHomeButtonEnabled(true);
        if (isSubActivity) {
            context.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        } else {
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }




}
