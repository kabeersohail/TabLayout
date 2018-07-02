package com.example.sohail.tablayout;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sohail.tablayout.Adapter.CustomViewPagerAdapter;
import com.example.sohail.tablayout.Model.Model;
import com.hold1.pagertabsindicator.PagerTabsIndicator;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    PagerTabsIndicator pagerTabsIndicator;
    List<Model> models = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initModel();
        viewPager = findViewById(R.id.ViewPager);
        pagerTabsIndicator = findViewById(R.id.tabsIndicator);
        viewPager.setAdapter(new CustomViewPagerAdapter(models,this));
        pagerTabsIndicator.setViewPager(viewPager);

    }

    private void initModel() {
//        for(int i=0;i<4;i++){
//            models.add(new Model("Page "+(i+1),0));
//        }
        Model model;
        model = new Model("Page 1",R.drawable.sandle1);
        models.add(model);
        model = new Model("Page 2",R.drawable.sandle2);
        models.add(model);
        model = new Model("Page 3",R.drawable.sandle3);
        models.add(model);
        model = new Model("Page 4",R.drawable.sandle4);
        models.add(model);
    }
}
