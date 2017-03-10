package com.shopspreeng.android.javadev;

import android.graphics.drawable.Drawable;

/**
 * Created by jayson surface on 09/03/2017.
 */

public class Users {

    private String mUser;

    private Drawable mResource;

    private String mUrl;

    public Users(String user, Drawable resource, String url){
        mUser = user;
        mResource = resource;
        mUrl = url;
    }

    public String getmUser(){
        return mUser;
    }

    public Drawable getmResource(){
        return mResource;
    }

    public String getmUrl(){
        return mUrl;
    }


}
