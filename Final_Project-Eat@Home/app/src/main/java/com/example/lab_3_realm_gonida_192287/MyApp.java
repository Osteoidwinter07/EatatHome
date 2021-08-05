package com.example.lab_3_realm_gonida_192287;

import android.app.Application;

import io.realm.Realm;

public class MyApp extends Application {
    public void onCreate(){
        super.onCreate();
        Realm.init(this);
    }
}
