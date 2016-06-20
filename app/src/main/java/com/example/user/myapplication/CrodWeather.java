package com.example.user.myapplication;

import com.firebase.client.Firebase;

/**
 * Created by user on 19/06/2016.
 */
public class CrodWeather extends android.app.Application {

    @Override
    public void onCreate(){
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
