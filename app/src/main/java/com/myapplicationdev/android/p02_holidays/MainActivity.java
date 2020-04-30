package com.myapplicationdev.android.p02_holidays;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayAdapter aa;
    ArrayList<Holidays> holidays;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

               lv = this.findViewById(R.id.lvHolidays);
               lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                   @Override
                   public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                       Holidays selectedholidays = holidays.get(position);

                       Toast.makeText(MainActivity.this, selectedholidays.getDay()
                                       + " : " + selectedholidays.getDate(),
                               Toast.LENGTH_LONG).show();
                   }
               });

                holidays = new ArrayList<Holidays>();
                holidays.add(new Holidays("New Year's Day","1 January 2020",R.drawable.picture1));
        holidays.add(new Holidays("Chinese New Year","25 January 2020\n" +
                "26 January 2020" ,R.drawable.picture2));
        holidays.add(new Holidays("Good Friday","10 April 2020",R.drawable.picture3));
        holidays.add(new Holidays("Labour Day","1 May 2020",R.drawable.picture4));

        aa = new HolidayAdapter(this,R.layout.row,holidays);
        lv.setAdapter(aa);
    }
}