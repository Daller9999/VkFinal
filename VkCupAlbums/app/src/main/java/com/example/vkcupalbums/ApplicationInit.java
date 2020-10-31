package com.example.vkcupalbums;

import android.app.Application;

import com.vk.sdk.VKAccessToken;
import com.vk.sdk.VKSdk;

public class ApplicationInit extends Application {

    @Override public void onCreate() {
        super.onCreate();
        VKSdk.initialize(this);
        // VKSdk.customInitialize(getApplicationContext(), 7325313, "5.124");
    }
}
