package com.example.abhiram.yummybot;

import android.support.v4.app.Fragment;

/**
 * Created by abhiram on 4/24/17.
 */

public interface HandleClickListerner {
    public void loadFragment(int Button);
    public void refresh(Fragment detailViewFragment);

}
