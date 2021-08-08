package com.example.purnia_tourguide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager2 vpager = (ViewPager2) findViewById(R.id.viewPager);
        Category_Adapter vAdapter = new Category_Adapter(getSupportFragmentManager(),getLifecycle());
        vpager.setAdapter(vAdapter);
        TabLayout tab = (TabLayout) findViewById(R.id.tabLayout);
        new TabLayoutMediator(
                tab, vpager, (tab1, position) -> {
                    if(position == 0) tab1.setText("Hotels");
                    else if(position == 1) tab1.setText("Markets");
                    else if(position == 2) tab1.setText("Temples");
                }
        ).attach();
        tab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                vpager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        vpager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tab.selectTab(tab.getTabAt(position));
            }
        });

    }

}