package com.baste.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.baste.enums.Personaje;
import com.baste.fragments.SonidosFragment;

/**
 * Created by Joaquin on 07/06/2014.
 */
public class MyPagerAdapter extends FragmentPagerAdapter {

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return Personaje.values()[position].getName();
    }

    @Override
    public int getCount() {
        return Personaje.values().length;
    }

    @Override
    public Fragment getItem(int position) {
        return SonidosFragment.newInstance(Personaje.values()[position].getName());
    }

}
