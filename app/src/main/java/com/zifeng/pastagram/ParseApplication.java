package com.zifeng.pastagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("4rTzU08EtPYLDRFJwnRCKaXj4o5uYZmFjqsubwDG")
                .clientKey("1qyJuQVSVOSdftwHrS65foVsy3tPA7VvtuWPkRHH")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
