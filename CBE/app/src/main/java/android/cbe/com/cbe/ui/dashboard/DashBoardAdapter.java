package android.cbe.com.cbe.ui.dashboard;

import android.cbe.com.cbe.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Intern.harshrajT on 3/1/2016.
 */
public class DashBoardAdapter extends BaseAdapter {
    ArrayList arrayList = new ArrayList();
    LayoutInflater inflater;
    Context mContext;

    public DashBoardAdapter(Context context,ArrayList arrayList) {
        this.arrayList = arrayList;
        this.mContext = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MyViewHolder myViewHolder;
        if(convertView == null) {
            convertView=inflater.inflate(R.layout.layout_cbe_dashboard_expanded_view,parent,false);
            myViewHolder = new MyViewHolder(convertView);
            convertView.setTag(myViewHolder);
        }else{
            myViewHolder=(MyViewHolder)convertView.getTag();
        }
        DashBoardModel dashBoardModel= (DashBoardModel)getItem(position);
        myViewHolder.description.setText(dashBoardModel.description);
        int imageID=(int)dashBoardModel.getImage();
        switch (imageID){
            case 1:
                myViewHolder.image.setImageResource(R.drawable.pic_article_carpool);
                myViewHolder.description.setText(mContext.getResources().getString(R.string.car_description));
                break;
            case 2:myViewHolder.image.setImageResource(R.drawable.blood_finder);
                myViewHolder.description.setText(mContext.getResources().getString(R.string.blood_description));
                break;
            case 3:myViewHolder.image.setImageResource(R.drawable.event_organization);
                myViewHolder.description.setText(mContext.getResources().getString(R.string.event_description));
                break;
            default:break;
        }
        ((LinearLayout.LayoutParams)myViewHolder.toolbar.getLayoutParams()).bottomMargin=-50;
        myViewHolder.toolbar.setVisibility(View.GONE);
        return convertView;
    }

    private class MyViewHolder {
        TextView description;
        View toolbar;
        ImageView image;

        public MyViewHolder(View item) {
            image=(ImageView)item.findViewById(R.id.profile);
            description = (TextView) item.findViewById(R.id.description);
            toolbar=(View)item.findViewById(R.id.toolbar);

        }

    }
}
