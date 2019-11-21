package com.example.studentbusinessjob;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class ListAdapter extends BaseAdapter {

    Activity activity;
    ArrayList data;
    Resources res;
    LayoutInflater inflater;

    public ListAdapter(Activity a, ArrayList d, Resources r) {
        activity = a;
        data = d;
        res = r;

        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        if (data.size() <= 0) {
            return 1;
        } else {
            return data.size();
        }
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        ViewHolder holder;

        if (v == null) {
            v = inflater.inflate(R.layout.list_model, null);
            holder = new ViewHolder();
            holder.title = v.findViewById(R.id.txtJobTitle);

            v.setTag(holder);
        } else {
            holder = (ViewHolder) v.getTag();
        }

        if(data.size() <= 0) {
            holder.title.setText("No Data");
        } else {
            JobModel temp = (JobModel) data.get(position);

            holder.title.setText(temp.getJobTitle());
        }

        return v;
    }
}

class ViewHolder {
    TextView title;
}

class OnItemClick implements View.OnClickListener {

    @Override
    public void onClick(View v) {

    }
}
