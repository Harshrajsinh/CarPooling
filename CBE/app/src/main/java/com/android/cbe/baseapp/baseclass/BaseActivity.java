package com.android.cbe.baseapp.baseclass;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.cbe.android.R;

public abstract class BaseActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private static String TAG = BaseActivity.class.getSimpleName();


    TextView header_txt;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_base);

        //Set custom Toolbar


//        addNavigationDrawer(R.id.drawer_layout,R.id.fragment_navigation_drawer,mToolbar);

    }

    @Override
    public void setContentView(int layoutResID) {
        DrawerLayout fullView = (DrawerLayout) getLayoutInflater().inflate(R.layout.activity_base2, null);
        FrameLayout activityContainer = (FrameLayout) fullView.findViewById(R.id.activity_content);
        getLayoutInflater().inflate(layoutResID, activityContainer, true);
        super.setContentView(fullView);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (useToolbar()) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        } else {
            toolbar.setVisibility(View.GONE);
        }
    }


    protected boolean useToolbar() {
        return true;
    }


    @Override
    public void setTitle(CharSequence title) {

        header_txt = (TextView) findViewById(R.id.header_text);
        header_txt.setText(title);
    }


    public void setToolbar(ActionBarActivity context, Toolbar toolBar, boolean isSubActivity) {

        context.setSupportActionBar(toolBar);
        context.getSupportActionBar().setDisplayShowTitleEnabled(false);
        context.getSupportActionBar().setHomeButtonEnabled(true);
        if (isSubActivity) {
            context.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        } else {
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }

    public void addNavigationDrawer(int drawerLayoutId, int fragmentNavDrawerId, Toolbar toolbar) {
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(drawerLayoutId);

        // NavigationDrawerFragment drawerFragment = (NavigationDrawerFragment)
        //       getSupportFragmentManager().findFragmentById(fragmentNavDrawerId);

        //drawerFragment.setUp(fragmentNavDrawerId, drawerLayout, toolbar);
    }

    public void addFragment(int containerId, Fragment fragment, boolean addToBackStack) {

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(containerId, fragment, fragment.getClass().getName());
        if (addToBackStack) {
            transaction.addToBackStack(fragment.getClass().getName());
        } else {
            transaction.addToBackStack(null);
        }
        transaction.commit();
    }

    public void replaceFragment(int containerId, Fragment fragment) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(containerId, fragment, fragment.getClass().getName());
        transaction.commit();
    }

    public void replaceFragment(int containerId, Fragment fragment, Boolean isBackstack) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(containerId, fragment, fragment.getClass().getName());
        if (isBackstack) {
            transaction.addToBackStack(fragment.getClass().getName());
        }
        transaction.commit();


    }
}//end BaseActivity

