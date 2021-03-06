package com.myapplicationdev.android.p02_holidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HolidayAdapter extends ArrayAdapter<Holidays> {

    private ArrayList<Holidays> holidays;
    private Context context;
    private TextView tvday;
    private TextView tvdate;
    private ImageView iv;

    public HolidayAdapter(Context context, int resource, ArrayList<Holidays> objects) {
        super(context, resource, objects);
        // Store the food that is passed to this adapter
        holidays = objects;
        // Store Context object as we would need to use it later
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);

        // Get the TextView object

        tvday = (TextView) rowView.findViewById(R.id.textView3);
        tvdate = (TextView) rowView.findViewById(R.id.textView4);
        // Get the ImageView object
        iv = (ImageView) rowView.findViewById(R.id.imageView2);
// The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        Holidays currentHoliday = holidays.get(position);
        // Set the TextView to show the food


        tvday.setText(currentHoliday.getDay());
        tvdate.setText(currentHoliday.getDate());
        iv.setImageResource(currentHoliday.getImage());
           return rowView;

    }

}