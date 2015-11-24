package io.github.jwangsadinata.toktumi;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParsePush;

/**
 * Created by Jason on 11/24/15.
 */
public class TokTuMiApplication extends Application {
    public static final String APP_ID =
            "SrS4jPnIDANGHnL5Q0QBhqH6RphrCNsZQmkHWnCu";
    public static final String CLIENT_ID =
            "DEu84Sc4HLpOIMlfAIkdw5tBs4qyivrIRJLjikuN";

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(this, APP_ID, CLIENT_ID);

        ParseInstallation.getCurrentInstallation().saveInBackground();

        ParsePush.subscribeInBackground("TokTuMi");

    }


}
