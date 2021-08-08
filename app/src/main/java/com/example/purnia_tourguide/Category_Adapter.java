package com.example.purnia_tourguide;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class Category_Adapter extends FragmentStateAdapter {


    public Category_Adapter(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public Category_Adapter(Fragment fragment) {
        super(fragment);
    }

    public Category_Adapter( FragmentManager fragmentManager, Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch(position)
        {
            case 0: return new HotelsFragment();
            case 1: return new MarketsFragment();
            case 2: return new TemplesFragment();
            default: return null;
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
