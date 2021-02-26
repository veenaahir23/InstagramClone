package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("xhfgHhu0bB0LtJhnKYTEQauSLPm4I4IAlapXMus0")
                .clientKey("9SdUoNLCl8N5JcCdDaiU0sbXeAqLL8IVBB2L1LU5")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
