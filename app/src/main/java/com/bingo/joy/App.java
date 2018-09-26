package com.bingo.joy;

import android.app.Application;

import com.bingo.joy.activity.FlashActivity;
import com.ego.shadow.Shadow;

/**
 * @author lxy
 * @time 2018/9/26  17:58
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Shadow.image(R.drawable.fun);
        Shadow.init("michael20180926joy",FlashActivity.class);

    }
}
