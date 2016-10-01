package com.example.smuh4.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<students> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView);
        list = new ArrayList<students>();
        list.add(new students("Fuzail", "1st", "present", "A", R.drawable.abc));
        list.add(new students("Saad Ahmed", "2nd", "present", "C+", R.drawable.abc));
        list.add(new students("Zain kalim", "3rd", "present", "B+", R.drawable.abc));
        list.add(new students("Asad khan", "4th", "present", "C+", R.drawable.abc));
        list.add(new students("Ali Jaan", "5th", "present", "A", R.drawable.abc));
        list.add(new students("Muhammad Kamran", "6th", "present", "C", R.drawable.abc));
        list.add(new students("Shah Gani", "7th", "present", "Fail", R.drawable.abc));
        list.add(new students("Amir Khan", "8th", "Absent", "Fail", R.drawable.abc));
        adaptor adaptor = new adaptor(this, list);
        listView.setAdapter(adaptor);
    }
}