package com.example.mylibrary;

import android.app.Application;

public class TestSDK {

    private static Application mApplication;

    public static void initSDK(Application application) {
        mApplication = application;
    }

}
