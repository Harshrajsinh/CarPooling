package com.android.cbe.ui.dashboard;


import com.android.cbe.ui.dashboard.dashboardanimation.ExpandAnimation;
import com.cbe.android.R;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Intern.harshrajT on 2/23/2016.
 */
public class CBEDashboard extends AppCompatActivity{
    ArrayList<DashBoardModel> moduleList;
    ListView dashboardListView;
    private Toolbar toolbar;
    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        setContentView(R.layout.layout_cbe_dashboard);
        dashboardListView=(ListView)findViewById(R.id.dashboardList);

        //Populeting Pojo
        DashBoardModel dModelCar=new DashBoardModel(1,getResources().getString(R.string.car_description));
        DashBoardModel dModelBlood=new DashBoardModel(2,getResources().getString(R.string.blood_description));
        DashBoardModel dModelEvent=new DashBoardModel(1,getResources().getString(R.string.event_description));
        moduleList.add(dModelCar);
        moduleList.add(dModelBlood);
        moduleList.add(dModelEvent);

        dashboardListView.setAdapter(new DashBoardAdapter(getApplicationContext(), moduleList));
        dashboardListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                View toolbar1=view.findViewById(R.id.toolbar1);
                ExpandAnimation expandAnimation = new ExpandAnimation(toolbar1, 500);
                toolbar.startAnimation(expandAnimation);

            }
        });
    }
}
